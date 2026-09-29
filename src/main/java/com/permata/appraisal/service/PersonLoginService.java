package com.permata.appraisal.service;

import com.permata.appraisal.dto.PersonLoginDto;
import com.permata.appraisal.dto.PersonRoleDto;
import com.permata.appraisal.model.PersonLevel;

public interface PersonLoginService {

    PersonLoginDto getCurrentLogin();

    PersonLoginDto getLogin(String userId);

    PersonRoleDto getCurrentRole(PersonLevel level);
}
