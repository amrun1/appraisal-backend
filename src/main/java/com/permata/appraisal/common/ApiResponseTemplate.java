package com.permata.appraisal.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.ALWAYS)
public class ApiResponseTemplate {

    private Boolean status;
    private String message;
    private Object object;

    public ApiResponseTemplate(Boolean status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public ApiResponseTemplate(Boolean status, Object object) {
        this.status = status;
        this.message = null;
        this.object = object;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}

