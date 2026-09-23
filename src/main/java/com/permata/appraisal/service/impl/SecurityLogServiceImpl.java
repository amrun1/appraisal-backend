package com.permata.appraisal.service.impl;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.dto.SecurityLogDto;
import com.permata.appraisal.model.SecurityLog;
import com.permata.appraisal.repository.PersonRepository;
import com.permata.appraisal.repository.SecurityLogRepository;
import com.permata.appraisal.service.SecurityLogService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SecurityLogServiceImpl implements SecurityLogService {

    @Autowired
    private SecurityLogRepository securityLogRepository;
    @Autowired
    private PersonRepository personRepository;

    public SecurityLogDto toWrapper(SecurityLog e) {
        SecurityLogDto w = new SecurityLogDto();
        BeanUtils.copyProperties(e, w);
        if (e.getPerson() != null) {
            w.setPersonId(e.getPerson().getUserId());
        }
        if (w.getDateTime()!=null){
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            w.setDateFormatJson(d.format(w.getDateTime()));
        }
        return w;
    }

    public SecurityLog toEntity(SecurityLogDto securityLogDto) {
        SecurityLog s = new SecurityLog();
        BeanUtils.copyProperties(securityLogDto, s,"person","dateTime");
        s.setPerson(personRepository.findById(securityLogDto.getPersonId()).orElse(null));
        s.setDateTime(new Date());
        return s;
    }
    public SecurityLogDto saveLogging (Long status, String personUserId, HttpServletRequest request, String detailEvent, String userAffected){
        SecurityLog s = new SecurityLog();
        s.setDateTime(new Date());
        s.setIpAddress(getClientIp(request));
        s.setKeterangan(getDesc(status));
        s.setDetail(detailEvent);
        s.setAppName("Web Appraisal");
        s.setComputerName(request.getRemoteHost());
        s.setUserAffected(userAffected);
        s.setPerson(personRepository.findById(personUserId).orElse(null));
        s.setLogCode(status);
        return toWrapper(securityLogRepository.save(s));

    }

    private String getDesc(Long id){
        Map<Long,String> m = new HashMap<Long, String>();
        m.put(AppConstans.SecurityLogConstans.LOGIN_SUCCESS,"Login Success");
        m.put(AppConstans.SecurityLogConstans.LOGIN_FAILURE,"Login Failure");
        m.put(AppConstans.SecurityLogConstans.LOGOUT,"Logout");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_CREATION,"User ID Creation");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_ACTIVATION,"User ID Unlocked");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_DEACTIVATION,"User ID Locked");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_DELETION,"User ID Deleted");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_UNDELETE,"User ID Un-Delete");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_RENAMING,"User ID Renamed");
        m.put(AppConstans.SecurityLogConstans.USER_PROFILE_CHANGE,"Change Profile");
        m.put(AppConstans.SecurityLogConstans.USER_ROLES_ADD,"Modification of user profile access rights");
        m.put(AppConstans.SecurityLogConstans.USER_ROLES_REMOVED,"Removal of user profile access rights");
        m.put(AppConstans.SecurityLogConstans.USER_ROLES_CHANGE,"Modification of user profile access rights Desc");
        m.put(AppConstans.SecurityLogConstans.SYSTEM_PARAMETER_CHANGE,"Change System Parameter");
        m.put(AppConstans.SecurityLogConstans.UNAUTHORIZE_ACCESS,"Unauthorize Access");
        m.put(AppConstans.SecurityLogConstans.LOGOUT_SESSION_EXPIRED,"Logout  session expired");
        return m.get(id);
    }

    private String getClientIp(HttpServletRequest request) {

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }
}
