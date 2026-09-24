package com.permata.appraisal.common;

import com.permata.appraisal.util.SoftDeleteSupport;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public abstract class EntityReferenceBase<ID extends Serializable> extends EntityBase<ID> implements SoftDeleteSupport {

    private Integer deleted;

    @Override
    @Column(name = "DELETED")
    public Integer getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}