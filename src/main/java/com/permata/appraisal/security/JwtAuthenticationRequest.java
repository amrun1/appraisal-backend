package com.permata.appraisal.security;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JwtAuthenticationRequest {

    @NotNull(message = "{Message.NotNull}")
    @Size(min = 3, max = 30, message = "{Message.Size}")
    @ApiModelProperty(dataType = "String", required = true, position = 0, example = "12345", notes = "min 3, max 30")
    private String userId;
    @ApiModelProperty(dataType = "String", required = true, position = 1, notes = "plain text, Password length min=3, max=255")
    @NotNull(message = "{Message.NotNull}")
    @Size(min = 3, max = 255, message = "{Message.Size}")

    private String password;

    public JwtAuthenticationRequest() {
    }

    public JwtAuthenticationRequest(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}