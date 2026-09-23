package com.permata.appraisal.common;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ApiTemplateMessage {

    public ResponseEntity<Object> buildResponseEntity(ApiResponseTemplate template) {
        HttpStatus status = Boolean.TRUE.equals(template.getStatus()) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return new ResponseEntity<>(template, status);
    }

    public ResponseEntity<Object> buildResponseEntity(ApiResponseTemplate template, HttpStatus status) {
        return new ResponseEntity<>(template, status);
    }

}
