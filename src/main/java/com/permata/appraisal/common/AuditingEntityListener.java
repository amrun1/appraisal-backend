package com.permata.appraisal.common;

import jakarta.persistence.*;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class AuditingEntityListener {


    @PrePersist
    public void prePersist(Object e) {
        log.debug("prePersist(TestEntity) - start"); //$NON-NLS-1$
        log.debug("prePersist(TestEntity) - end"); //$NON-NLS-1$
    }

    @PostPersist
    public void postPersist(Object e) {
        log.debug("postPersist(TestEntity) - start"); //$NON-NLS-1$
        log.debug("postPersist(TestEntity) - end"); //$NON-NLS-1$
    }

    @PostLoad
    public void postLoad(Object e) {
        log.debug("postLoad(TestEntity) - start"); //$NON-NLS-1$
        log.debug("postLoad(TestEntity) - end"); //$NON-NLS-1$
    }

    @PreUpdate
    public void preUpdate(Object e) {
        log.debug("preUpdate(TestEntity) - start"); //$NON-NLS-1$
        log.debug("preUpdate(TestEntity) - end"); //$NON-NLS-1$
    }

    @PostUpdate
    public void postUpdate(Object e) {
        log.debug("postUpdate(TestEntity) - start"); //$NON-NLS-1$
        log.debug("postUpdate(TestEntity) - end"); //$NON-NLS-1$
    }

    @PreRemove
    public void preRemove(Object e) {
        log.debug("preRemove(TestEntity) - start"); //$NON-NLS-1$
        log.debug("preRemove(TestEntity) - end"); //$NON-NLS-1$
    }

    @PostRemove
    public void postRemove(Object e) {
        log.debug("postRemove(TestEntity) - start"); //$NON-NLS-1$
        log.debug("postRemove(TestEntity) - end"); //$NON-NLS-1$
    }
}