package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "GROUP_PARAMETER")

/**
 * tidak boleh di edit code, dikarenakan code hardcode di AppConstans.GroupParameter
 */
@Immutable
public class GroupParameter extends EntityBase<String> {

    private String code;
    private String desctiption;

    @Id
    @Column(name = "CODE", nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "DESCRIPTION", nullable = false)
    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }
}
