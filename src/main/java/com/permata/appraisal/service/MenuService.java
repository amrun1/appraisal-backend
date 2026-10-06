package com.permata.appraisal.service;

import java.util.List;
import com.permata.appraisal.dto.MenuDto;

public interface MenuService {
    public List<MenuDto.Response> getMenuByLevel(String level);

    public List<MenuDto.Response> getMenuByLevel(List<String> level);

    public MenuDto.Response save(MenuDto.Request request);

    public MenuDto.MenuRoleResponse saveRelation(MenuDto.MenuRoleRequest request);
}
