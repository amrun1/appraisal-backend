package com.permata.appraisal.controller;

import com.permata.appraisal.common.ApiResponseTemplate;
import com.permata.appraisal.common.ApiTemplateMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Log4j2
public class UserController {
    private final ApiTemplateMessage templateMessage;

    @Operation(summary = "Test Get)")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK") })
    @GetMapping(value = "/generateGet/{id}")
    public ResponseEntity<?> testGet(@PathVariable String id) throws IOException {
        Object test = "oktest";


        return templateMessage.buildResponseEntity(
                new ApiResponseTemplate(true, "Success", test));
    }
}
