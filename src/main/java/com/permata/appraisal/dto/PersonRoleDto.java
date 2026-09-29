package com.permata.appraisal.dto;

import com.permata.appraisal.model.PersonLevel;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

public class PersonRoleDto  implements Serializable {

    private Long id;
    @NotNull
    private String userId;
    @NotNull
    private PersonLevel level;
    private Long groupId;
    private String groupName;
    private Long branchId;
    private String branchName;
    private Long appBranchId;
    private String appBranchName;
    private BigDecimal limitApproval;





    public PersonRoleDto(){

    }

    public PersonRoleDto(String userId){
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonLevel getLevel() {
        return level;
    }

    public void setLevel(PersonLevel level) {
        this.level = level;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Long getAppBranchId() {
        return appBranchId;
    }

    public void setAppBranchId(Long appBranchId) {
        this.appBranchId = appBranchId;
    }

    public String getAppBranchName() {
        return appBranchName;
    }

    public void setAppBranchName(String appBranchName) {
        this.appBranchName = appBranchName;
    }

    public BigDecimal getLimitApproval() {
        return limitApproval;
    }

    public void setLimitApproval(BigDecimal limitApproval) {
        this.limitApproval = limitApproval;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonRoleDto{");
        sb.append("id=").append(id);
        sb.append(", level=").append(level);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append(", branchId=").append(branchId);
        sb.append(", branchName='").append(branchName).append('\'');
        sb.append(", appBranchId=").append(appBranchId);
        sb.append(", appBranchName='").append(appBranchName).append('\'');
        sb.append(", limitApproval=").append(limitApproval);
        sb.append('}');
        return sb.toString();
    }



    public String toStringProf() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append("LEVEL=").append(level);
        sb.append(", CABANG_BISNIS='").append(branchName==null?"":branchName).append('\'');
        sb.append(", CABANG_APPRAISAL='").append(appBranchName==null?"":appBranchName).append('\'');
        sb.append(", LIMIT_APPROVE=").append(limitApproval==null?"":limitApproval);
        sb.append(')');
        return sb.toString();
    }
}