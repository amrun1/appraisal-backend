package com.permata.appraisal.controller;

import com.permata.appraisal.common.ApiResponseTemplate;
import com.permata.appraisal.common.ApiTemplateMessage;
import com.permata.appraisal.common.PaginatedListRequest;
import com.permata.appraisal.common.PaginatedListResponse;
import com.permata.appraisal.dto.DataCommonTableDto;
import com.permata.appraisal.dto.PersonLoginDto;
import com.permata.appraisal.service.DataCommonService;
import com.permata.appraisal.service.PersonLoginService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inquiry")
@RequiredArgsConstructor
@Log4j2
@SessionAttributes({"person", "roleActive"})
public class InquiryController {

    private final ApiTemplateMessage templateMessage;
    private final DataCommonService dataCommonService;
    private final PersonLoginService personLoginService;

    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    @PostMapping(value = "/find", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> find(@RequestBody PaginatedListRequest<DataCommonTableDto> request) {
        PersonLoginDto person = personLoginService.getCurrentLogin();
        request.getWrapper().setSourceId("null_inquiry");
        PaginatedListResponse<DataCommonTableDto> data = dataCommonService.findForTables(request.getPagingInfo(), request.getWrapper());
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(
                true,
                "Success",
                data
        ));
    }
}
