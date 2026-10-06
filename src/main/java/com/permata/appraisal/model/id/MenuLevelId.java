package com.permata.appraisal.model.id;

import java.io.Serializable;
import com.permata.appraisal.model.PersonLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuLevelId implements Serializable {
    private long menuId;
    private PersonLevel level;
}
