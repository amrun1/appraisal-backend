package com.permata.appraisal.model;

import com.permata.appraisal.model.id.MenuLevelId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@IdClass(MenuLevelId.class)
@Table(name = "menu_level")
public class MenuLevel {
    @Id
    @Column(name = "menu_id")
    private long menuId;

    @Id
    @Column(name = "level")
    @Enumerated(EnumType.STRING)
    private PersonLevel level;
}
