package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SYSTEM_PARAMS")
public class SystemParam extends EntityBase<String> {

    private String code;
    private String value;
    private String description;

    @Id
    @Column (name = "CODE", nullable = false, length = 30)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "VALUE", nullable = false)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "DESCRIPTION", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}