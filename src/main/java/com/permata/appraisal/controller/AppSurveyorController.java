package com.permata.appraisal.controller;

import com.permata.appraisal.common.ApiResponseTemplate;
import com.permata.appraisal.common.ApiTemplateMessage;
import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.PaginatedListRequest;
import com.permata.appraisal.common.PaginatedListResponse;
import com.permata.appraisal.dto.DataCommonDto;
import com.permata.appraisal.dto.DataCommonTableDto;
import com.permata.appraisal.dto.PersonLoginDto;
import com.permata.appraisal.model.PersonLevel;
import com.permata.appraisal.service.DataCommonService;
import com.permata.appraisal.service.PersonLoginService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app-surveyor")
@RequiredArgsConstructor
@Log4j2
public class AppSurveyorController {

    private static final String POSISI = AppConstans.TaskPosition.APP_SURVEYOR;
    private static final PersonLevel ROLE_SURVEYOR = PersonLevel.APPRAISAL_SURVEYOR;

    private final ApiTemplateMessage templateMessage;
    private final DataCommonService dataCommonService;
    private final PersonLoginService personLoginService;

    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    @PostMapping(value = "/find", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> find(@RequestBody PaginatedListRequest<DataCommonDto> request) {
        PersonLoginDto person = personLoginService.getCurrentLogin();
        DataCommonDto dto = request.getWrapper() != null ? request.getWrapper() : new DataCommonDto();
        dto.setPosition(POSISI);
        dto.setTaskList(person.getUserId());
        dto.setAppBranchId(personLoginService.getCurrentRole(ROLE_SURVEYOR).getAppBranchId());

        PaginatedListResponse<DataCommonTableDto> data =
                dataCommonService.findForAppSurveyor(request.getPagingInfo(), dto);
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(
                true,
                "Success",
                data
        ));
    }
}
