package com.permata.appraisal.model;

public enum PersonLevel {

    KING("Super Admin"),
    ADMIN("Admin Aplikasi"),
    DCO,
    MARKETING("Marketing"),
    MONITOR("Monitoring"),
    APPRAISAL_ADMIN("Appraisal Admin"),
    APPRAISAL_VALUER("Appraisal Valuer"),
    APPRAISAL_APPROVAL("Appraisal Approval"),
    APPRAISAL_SURVEYOR("Appraisal Surveyor"),
    APPRAISAL_PANEL("Appraisal Panel"),
    VAULT_RWA("Vault RWA"),
    ROLE_911("911");

    private final String value;

    private PersonLevel() {
        this.value = toString();
    }

    private PersonLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}