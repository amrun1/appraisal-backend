package com.permata.appraisal.model.projection;

import org.springframework.beans.factory.annotation.Value;

public interface MenuWithLevel {
    long getId();

    Long getParentId();

    @Value("#{target.level}")
    String getRole();

    String getName();

    String getUri();
}
