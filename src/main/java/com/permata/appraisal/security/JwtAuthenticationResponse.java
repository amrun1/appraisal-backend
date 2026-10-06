package com.permata.appraisal.security;

import java.util.List;
import com.permata.appraisal.dto.MenuDto;

public class JwtAuthenticationResponse {

    private String token;
    private String tokenType = "Bearer";
    private String userId;
    private List<String> roles;
    private List<MenuDto.Response> menus;

    public JwtAuthenticationResponse(String token, String userId, List<String> roles,
            List<MenuDto.Response> menus) {
        this.token = token;
        this.userId = userId;
        this.roles = roles;
        this.menus = menus;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<MenuDto.Response> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuDto.Response> menus) {
        this.menus = menus;
    }
}
