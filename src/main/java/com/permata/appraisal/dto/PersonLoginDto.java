package com.permata.appraisal.dto;

import com.permata.appraisal.model.PersonLevel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonLoginDto extends PersonDto  implements Serializable {

    private List<PersonRoleDto> roles = new ArrayList<PersonRoleDto>();;

    public PersonRoleDto getRole(PersonLevel level) {
        for (PersonRoleDto role : roles) {
            if (role.getLevel().equals(level)) {
                return role;
            }
        }
        return null;
    }

    public void addRole(PersonRoleDto role) {
        roles.add(role);
    }

    public List<PersonRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<PersonRoleDto> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonLoginDto{");
        sb.append("roles=").append(roles);
        sb.append('}');
        return sb.toString();
    }
}
