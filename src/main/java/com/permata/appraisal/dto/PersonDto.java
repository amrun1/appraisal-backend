package com.permata.appraisal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class PersonDto implements Serializable{

    @NotNull
    private String userId;
    private String password;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String name;
    private String phone;
    private String hp;
    private String hpAtasan;
    private boolean update;
    private Boolean inactive;
    private Date lastLogin;
    private Date lastFail;
    private Integer errorCount;
    private String statusAktif;
    private String dateJsonDate;
    private Integer deleted;

    private String statusDelete;


    private String deletedBy;
    private String undeletedBy;
    private String inActivatedBy;
    private String activatedBy;


    private Date deletedDate;
    private String deletedDateString;



    private Date inActiveDate;
    private Date unDeletedDate;
    private Date activatedDate;

    private String userRole;


    public String toStringProfile() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append("USER_ID='").append(userId).append('\'');
        sb.append(", EMAIL='").append(email).append('\'');
        sb.append(", NAME='").append(name).append('\'');
        sb.append(", PHONE='").append(phone).append('\'');
        sb.append(", HP='").append(hp).append('\'');
        sb.append(", HP_ATASAN='").append(hpAtasan).append('\'');
        sb.append(')');
        return sb.toString();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getDeletedDateString() {
        return deletedDateString;
    }

    public void setDeletedDateString(String deletedDateString) {
        this.deletedDateString = deletedDateString;
    }
    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public String getUndeletedBy() {
        return undeletedBy;
    }

    public void setUndeletedBy(String undeletedBy) {
        this.undeletedBy = undeletedBy;
    }

    public String getInActivatedBy() {
        return inActivatedBy;
    }

    public void setInActivatedBy(String inActivatedBy) {
        this.inActivatedBy = inActivatedBy;
    }

    public String getActivatedBy() {
        return activatedBy;
    }

    public void setActivatedBy(String activatedBy) {
        this.activatedBy = activatedBy;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public Date getInActiveDate() {
        return inActiveDate;
    }

    public void setInActiveDate(Date inActiveDate) {
        this.inActiveDate = inActiveDate;
    }

    public Date getUnDeletedDate() {
        return unDeletedDate;
    }

    public void setUnDeletedDate(Date unDeletedDate) {
        this.unDeletedDate = unDeletedDate;
    }

    public Date getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    public String getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(String statusDelete) {
        this.statusDelete = statusDelete;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDateJsonDate() {
        return dateJsonDate;
    }

    public void setDateJsonDate(String dateJsonDate) {
        this.dateJsonDate = dateJsonDate;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHpAtasan() {
        return hpAtasan;
    }

    public void setHpAtasan(String hpAtasan) {
        this.hpAtasan = hpAtasan;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastFail() {
        return lastFail;
    }

    public void setLastFail(Date lastFail) {
        this.lastFail = lastFail;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(String statusAktif) {
        this.statusAktif = statusAktif;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonDto{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", hp='").append(hp).append('\'');
        sb.append(", hpAtasan='").append(hpAtasan).append('\'');
        sb.append(", update=").append(update);
        sb.append(", inactive=").append(inactive);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", lastFail=").append(lastFail);
        sb.append(", errorCount=").append(errorCount);
        sb.append(", statusAktif='").append(statusAktif).append('\'');
        sb.append(", dateJsonDate='").append(dateJsonDate).append('\'');
        sb.append(", deleted=").append(deleted);
        sb.append(", statusDelete='").append(statusDelete).append('\'');
        sb.append(", deletedBy='").append(deletedBy).append('\'');
        sb.append(", undeletedBy='").append(undeletedBy).append('\'');
        sb.append(", inActivatedBy='").append(inActivatedBy).append('\'');
        sb.append(", activatedBy='").append(activatedBy).append('\'');
        sb.append(", deletedDate=").append(deletedDate);
        sb.append(", inActiveDate=").append(inActiveDate);
        sb.append(", unDeletedDate=").append(unDeletedDate);
        sb.append(", activatedDate=").append(activatedDate);
        sb.append('}');
        return sb.toString();
    }
}