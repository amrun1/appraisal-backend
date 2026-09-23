package com.permata.appraisal.service;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.model.Person;
import com.permata.appraisal.model.PersonLevel;
import com.permata.appraisal.model.PersonRole;
import com.permata.appraisal.model.SecurityLog;
import com.permata.appraisal.repository.PersonRepository;
import com.permata.appraisal.repository.SecurityLogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final PersonRepository personRepository;
    private final SecurityLogRepository securityLogRepository;
    private final PasswordEncoder passwordEncoder;
    private final LdapAuthService ldapAuthService;

    @Value("${app.ldap.enabled:false}")
    private boolean ldapEnabled;

    @Override
    @Transactional
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userId = authentication.getName();
        String password = authentication.getCredentials() == null
                ? null : authentication.getCredentials().toString();

        log.debug("trying to login user -> {}", userId);

        if (AppConstans.Role911.USER_ID.equals(userId)) {
            return authenticateRole911(userId, password);
        }

        Person person = personRepository.findById(userId).orElse(null);
        if (person == null) {
            throw new BadCredentialsException("User dan Password Anda Salah");
        }
        if (password == null || password.isBlank()) {
            throw new BadCredentialsException("Password Tidak Boleh Kosong");
        }
        if (Boolean.TRUE.equals(person.getInactive())) {
            int errorCnt = (person.getErrorCount() == null ? 0 : person.getErrorCount()) + 1;
            person.setErrorCount(errorCnt);
            person.setLastFail(new Date());
            personRepository.save(person);
            saveSecurityLog(person, AppConstans.SecurityLogConstans.USER_PROFILE_DEACTIVATION,
                    "User ID Locked",
                    "Locked Wrong User ID/Password (Attempt = " + errorCnt + ")",
                    userId);
            throw new LockedException("User Anda Terkunci, Silahkan Hubungi Administrator");
        }
        if (person.getDeleted() != null && person.getDeleted() == 1) {
            throw new BadCredentialsException("Login Failed - User Inactive or Deleted");
        }

        boolean passwordValid;
        if (ldapEnabled) {
            passwordValid = ldapAuthService.ldapLogin(userId, password);
        } else {
            passwordValid = person.getPassword() == null || person.getPassword().isEmpty()
                    || passwordEncoder.matches(password, person.getPassword());
        }
        if (!passwordValid) {
            int errorCnt = (person.getErrorCount() == null ? 0 : person.getErrorCount()) + 1;
            person.setErrorCount(errorCnt);
            person.setLastFail(new Date());
            personRepository.save(person);
            saveSecurityLog(person, AppConstans.SecurityLogConstans.LOGIN_FAILURE,
                    "Login Failure",
                    "Login Failure (Attempt = " + errorCnt + ")",
                    userId);
            throw new BadCredentialsException("User dan Password Anda Salah");
        }

        person.setErrorCount(0);
        person.setLastFail(null);
        person.setLastLogin(new Date());
        personRepository.save(person);

        saveSecurityLog(person, AppConstans.SecurityLogConstans.LOGIN_SUCCESS,
                "Login Success", "Login Success", userId);

        return new UsernamePasswordAuthenticationToken(userId, password, buildAuthorities(person));
    }

    private Authentication authenticateRole911(String userId, String password) {
        Calendar calAuth = Calendar.getInstance();
        int calc = (calAuth.get(Calendar.HOUR_OF_DAY) - 1) * 2;
        calc = calc < 0 ? 0 : calc;
        StringBuilder sb = new StringBuilder();
        sb.append(calAuth.get(Calendar.YEAR));
        sb.append(calAuth.get(Calendar.MONTH) + 54);
        sb.append(calAuth.get(Calendar.DATE));
        sb.append(String.format("%2s", calc).replace(" ", "0"));

        if (password != null && password.equals(sb.toString())) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(PersonLevel.ROLE_911.name()));
            authorities.add(new SimpleGrantedAuthority(PersonLevel.KING.name()));
            authorities.add(new SimpleGrantedAuthority(PersonLevel.ADMIN.name()));
            return new UsernamePasswordAuthenticationToken(userId, password, authorities);
        }
        throw new BadCredentialsException("User dan Password Anda Salah");
    }

    private List<GrantedAuthority> buildAuthorities(Person person) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (person.getRoles() != null) {
            for (PersonRole role : person.getRoles()) {
                authorities.add(new SimpleGrantedAuthority(role.getLevel().name()));
            }
        }
        return authorities;
    }

    private void saveSecurityLog(Person person, Long logCode, String keterangan, String detail, String userAffected) {
        try {
            SecurityLog securityLog = new SecurityLog();
            securityLog.setPerson(person);
            securityLog.setDateTime(new Date());
            securityLog.setAppName(AppConstans.APP_NAME);
            securityLog.setLogCode(logCode);
            securityLog.setKeterangan(keterangan);
            securityLog.setDetail(detail);
            securityLog.setUserAffected(userAffected);
            securityLogRepository.save(securityLog);
        } catch (Exception e) {
            log.error("Failed to save security log: {}", e.getMessage(), e);
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}