package com.permata.appraisal.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.permata.appraisal.dto.MenuDto;
import com.permata.appraisal.dto.MenuDto.MenuRoleRequest;
import com.permata.appraisal.dto.MenuDto.MenuRoleResponse;
import com.permata.appraisal.dto.MenuDto.Request;
import com.permata.appraisal.dto.MenuDto.Response;
import com.permata.appraisal.model.projection.MenuWithLevel;
import com.permata.appraisal.repository.MenuRepository;
import com.permata.appraisal.repository.MenuRoleRepository;
import com.permata.appraisal.service.MenuService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuRoleRepository menuRoleRepository;

    @Override
    public List<MenuDto.Response> getMenuByLevel(String level) {
        var menus = menuRepository.getMenuByLevel(level);

        return toMenuDTO(menus);
    }

    @Override
    public List<MenuDto.Response> getMenuByLevel(List<String> levels) {
        var menus = menuRepository.getMenuByLevel(levels);

        return toMenuDTO(menus);
    }

    private List<MenuDto.Response> toMenuDTO(List<MenuWithLevel> menus) {
        Map<Long, MenuDto.Response> byId = new LinkedHashMap<>();
        for (var m : menus) {
            MenuDto.Response dto = new MenuDto.Response();
            if (byId.containsKey(m.getId())) {
                dto = byId.get(m.getId());
                var currentRoleIds = dto.getRoles();
                currentRoleIds.add(m.getRole());
                dto.setRoles(currentRoleIds);
            } else {
                dto.setId(m.getId());
                dto.setName(m.getName());
                dto.setUri(m.getUri());
                dto.setRoles(new ArrayList<String>());
                dto.getRoles().add(m.getRole());
                dto.setChildren(new ArrayList<>());
            }
            byId.put(m.getId(), dto);
        }

        List<MenuDto.Response> roots = new ArrayList<>();
        for (var m : menus) {
            MenuDto.Response dto = byId.get(m.getId());
            if (m.getParentId() == null) {
                roots.add(dto);
                continue;
            }
            MenuDto.Response parent = byId.get(m.getParentId());
            if (parent != null) {
                parent.getChildren().add(dto);
            }
        }

        return roots;
    }

    @Override
    public Response save(Request request) {
        var menu = request.toMenu();

        return new MenuDto.Response(menuRepository.save(menu));
    }

    @Override
    public MenuRoleResponse saveRelation(MenuRoleRequest request) {
        var menuRole = menuRoleRepository.save(request.toMenuRole());

        return new MenuRoleResponse(menuRole);
    }

}
