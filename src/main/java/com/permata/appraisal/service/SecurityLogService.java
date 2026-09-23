package com.permata.appraisal.service;

import com.permata.appraisal.dto.SecurityLogDto;
import jakarta.servlet.http.HttpServletRequest;

public interface SecurityLogService {

    public SecurityLogDto saveLogging (Long status, String personUserId, HttpServletRequest request, String detailEvent, String userAffected);
}
