package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "PERSON")
public class Person {

    private String userId;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String hp;
    private String hpAtasan;
    private Boolean inactive;
    private Date lastLogin;
    private Date lastFail;
    private Integer errorCount;
    private Integer deleted;
    private List<PersonRole> roles = new ArrayList<>();

    @Id
    @Column(name = "USER_ID", nullable = false, length = 30)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "NAMA", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "HP")
    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Column(name = "HP_ATASAN")
    public String getHpAtasan() {
        return hpAtasan;
    }

    public void setHpAtasan(String hpAtasan) {
        this.hpAtasan = hpAtasan;
    }

    @Column(name = "INACTIVE")
    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    @Column(name = "LAST_LOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Column(name = "SUM_FAILURE")
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    @Column(name = "DATE_FAILURE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastFail() {
        return lastFail;
    }

    public void setLastFail(Date lastFail) {
        this.lastFail = lastFail;
    }

    @Column(name = "DELETED", length = 1)
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true)
    public List<PersonRole> getRoles() {
        return roles;
    }

    public void setRoles(List<PersonRole> roles) {
        this.roles = roles;
    }

    public void addRole(PersonRole role) {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        role.setPerson(this);
        roles.add(role);
    }
}