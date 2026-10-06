package com.permata.appraisal.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.permata.appraisal.model.Menu;
import com.permata.appraisal.model.MenuLevel;
import com.permata.appraisal.model.PersonLevel;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

public final class MenuDto {
    private MenuDto() {}

    @Data
    @NoArgsConstructor
    @JsonPropertyOrder(value = {"id", "name", "uri", "children", "roles"})
    public static class Response {
        private long id;
        private String name;
        private String uri;
        private List<String> roles;
        @JsonInclude(value = JsonInclude.Include.NON_NULL)
        private List<MenuDto.Response> children;

        public Response(Menu menu) {
            id = menu.getId();
            name = menu.getName();
            uri = menu.getUri();
        }

    }

    @Data
    @NoArgsConstructor
    public static class Request {
        @NotBlank
        private String name;
        private String uri;
        private Long parentId;

        public Menu toMenu() {
            var menu = new Menu();
            menu.setParentId(parentId);
            menu.setName(name);
            menu.setUri(uri);

            return menu;
        }
    }

    @Data
    @NoArgsConstructor
    public static class MenuRoleRequest {
        private long menuId;
        private PersonLevel level;

        public MenuLevel toMenuRole() {
            var menuRole = new MenuLevel();
            menuRole.setMenuId(menuId);
            menuRole.setLevel(level);

            return menuRole;
        }
    }

    @Data
    @NoArgsConstructor
    public static class MenuRoleResponse {
        private long menuId;
        private PersonLevel level;

        public MenuRoleResponse(MenuLevel menuLevel) {
            menuId = menuLevel.getMenuId();
            level = menuLevel.getLevel();
        }
    }
}
