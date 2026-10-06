package com.permata.appraisal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import com.permata.appraisal.model.Menu;
import com.permata.appraisal.model.projection.MenuWithLevel;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    @NativeQuery("""
            SELECT m.*,
                   ml.level
            FROM menu m
                     RIGHT JOIN menu_level ml ON m.id = ml.menu_id
            WHERE LOWER(ml.level) = LOWER(:level)
            ORDER BY m.parent_id NULLS FIRST, m.id
                            """)
    List<MenuWithLevel> getMenuByLevel(String level);

    @NativeQuery("""
            SELECT m.*,
                   ml.level
            FROM menu m
                     RIGHT JOIN menu_level ml ON m.id = ml.menu_id
            WHERE LOWER(ml.level) IN :levels
            ORDER BY m.parent_id NULLS FIRST, m.id
            """)
    List<MenuWithLevel> getMenuByLevel(List<String> levels);
}
