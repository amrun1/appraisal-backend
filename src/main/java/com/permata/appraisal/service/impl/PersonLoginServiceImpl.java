package com.permata.appraisal.service.impl;

import com.permata.appraisal.dto.PersonLoginDto;
import com.permata.appraisal.dto.PersonRoleDto;
import com.permata.appraisal.model.Person;
import com.permata.appraisal.model.PersonLevel;
import com.permata.appraisal.model.PersonRole;
import com.permata.appraisal.repository.PersonRepository;
import com.permata.appraisal.service.PersonLoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Service
@Log4j2
@RequiredArgsConstructor
public class PersonLoginServiceImpl implements PersonLoginService {

    private static final String REQUEST_CACHE_KEY = PersonLoginServiceImpl.class.getName() + ".LOGIN";

    private final PersonRepository personRepository;

    @Override
    public PersonLoginDto getCurrentLogin() {
        PersonLoginDto cached = getFromRequestCache();
        if (cached != null) {
            return cached;
        }
        PersonLoginDto dto = getLogin(getCurrentUserId());
        putToRequestCache(dto);
        return dto;
    }

    @Override
    @Transactional(readOnly = true)
    public PersonLoginDto getLogin(String userId) {
        Person person = personRepository.findWithRolesByUserId(userId)
                .orElseThrow(() -> new AccessDeniedException("User " + userId + " tidak ditemukan"));
        return toLoginDto(person);
    }

    @Override
    public PersonRoleDto getCurrentRole(PersonLevel level) {
        PersonRoleDto role = getCurrentLogin().getRole(level);
        if (role == null) {
            throw new AccessDeniedException("User tidak memiliki role " + level.name());
        }
        return role;
    }

    private String getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()
                || authentication.getPrincipal() == null
                || "anonymousUser".equals(authentication.getPrincipal())) {
            throw new AccessDeniedException("User belum login");
        }
        return authentication.getName();
    }

    private PersonLoginDto toLoginDto(Person person) {
        PersonLoginDto dto = new PersonLoginDto();
        BeanUtils.copyProperties(person, dto, "password", "roles");
        if (person.getRoles() != null) {
            for (PersonRole role : person.getRoles()) {
                dto.addRole(toRoleDto(person.getUserId(), role));
            }
        }
        return dto;
    }

    private PersonRoleDto toRoleDto(String userId, PersonRole entity) {
        PersonRoleDto dto = new PersonRoleDto(userId);
        BeanUtils.copyProperties(entity, dto, "person");
        return dto;
    }

    private PersonLoginDto getFromRequestCache() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return null;
        }
        Object cached = attributes.getAttribute(REQUEST_CACHE_KEY, RequestAttributes.SCOPE_REQUEST);
        return cached instanceof PersonLoginDto ? (PersonLoginDto) cached : null;
    }

    private void putToRequestCache(PersonLoginDto dto) {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            attributes.setAttribute(REQUEST_CACHE_KEY, dto, RequestAttributes.SCOPE_REQUEST);
        }
    }
}
