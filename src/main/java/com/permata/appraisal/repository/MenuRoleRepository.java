package com.permata.appraisal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.permata.appraisal.model.MenuLevel;
import com.permata.appraisal.model.id.MenuLevelId;

public interface MenuRoleRepository extends JpaRepository<MenuLevel, MenuLevelId> {

}
