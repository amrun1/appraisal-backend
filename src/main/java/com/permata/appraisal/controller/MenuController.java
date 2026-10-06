package com.permata.appraisal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.permata.appraisal.common.ApiResponseTemplate;
import com.permata.appraisal.common.ApiTemplateMessage;
import com.permata.appraisal.dto.MenuDto;
import com.permata.appraisal.service.MenuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {
    private final MenuService menuService;
    private final ApiTemplateMessage templateMessage;

    @PostMapping("/")
    public ResponseEntity<?> save(@RequestBody @Valid MenuDto.Request request) {
        var menu = menuService.save(request);

        return templateMessage.buildResponseEntity(
                new ApiResponseTemplate(true, "menu saved successfully", menu), HttpStatus.CREATED);
    }

    @PostMapping("/relation")
    public ResponseEntity<?> saveRelation(@RequestBody @Valid MenuDto.MenuRoleRequest request) {
        var menuRole = menuService.saveRelation(request);

        return templateMessage.buildResponseEntity(
                new ApiResponseTemplate(true, "menu relation saved successfully", menuRole),
                HttpStatus.CREATED);
    }
}
