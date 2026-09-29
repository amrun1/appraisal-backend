package com.permata.appraisal.dto;

import com.permata.appraisal.model.PersonLevel;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DataCommonDto  implements Serializable {

    public class StatusData {
        public static final int NEW = 0;
        public static final int NO_DETAIL = 1;
        public static final int NO_ATTACTMENT = 2;
        public static final int COMPLETE = -1;
    }

    private Long id;
    @Size(max = 13)
    private String orderNumber;

    private String branchAppName;
    @NotNull private Long customerStatusId;
    private String customerStatusName;
    @NotNull private Long collateralStatusId;
    private String collateralStatusName;
    @NotNull private Long appraisalTypeId;
    private String appraisalTypeName;
    @Size(max = 9) @NotNull private String appraisalTypeCategory;
    @Size(max = 100) @NotNull private String name;
    @Size(max = 50) private String taskList;
    @Size(max = 50) private String position;
    @NotNull private String contactName;
    private String contactTelp;
    private String dateString;
    private String plafonMarketing;
    @NotNull private String typeReport;
    private String collateralId;
    private String eformCode;
    @Size(max = 255) private String catatan;
    private String adminBy;
    private Date adminDate;
    private String closedBy;
    private Date closedDate;
    private Date createdDate;
    private Date modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private String marketingTelp;
    private String marketingHp;
    private String branchBussinesName;
    private String message;
    private String rejectCategory;
    private Integer retention;

    private Long brancId;

    private Long branchId;



    public Long getBrancId() {
        return brancId;
    }

    public void setBrancId(Long brancId) {
        this.brancId = brancId;
    }

    private Long appBranchId;


    public String getBranchAppName() {
        return branchAppName;
    }

    public void setBranchAppName(String branchAppName) {
        this.branchAppName = branchAppName;
    }

    public Long getAppBranchId() {
        return appBranchId;
    }

    public void setAppBranchId(Long appBranchId) {
        this.appBranchId = appBranchId;
    }

    private DataDetailDto detail; // form
    private List<DataAttactmentDto> attactments;
    private DataMessageDto lastMessage = new DataMessageDto();

    private String valuerBy;
    private String surveyBy;
    private Integer timUser;
    private Integer param;

    private Date groupdate;
    private Long sizeNew;
    private Long sizeOld;
    private Integer countnew;
    private Integer countOld;
    private String cbng;
    private String stsjmnan;
    private BigDecimal countsjmnan;
    private String counts;
    private String groupdatetxt;


    // transient
    /**
     * 1 : belum memiliki detail
     * 2 : belum memiliki attactment
     * -1 : Complete
     */
    private int statusData;
    private Long dataDetailId;
    // is Copy data Debitur
    private boolean copyDebitur;
    private Long rwaId;
    private String source;
    private String sourceId;
    private boolean doubleAttactmen;

    private Date submitDate;

    private PersonLevel level;

    private Integer sourceStatus;

    // buat log PLUS

    private String plusTanggal;
    private String plusMessage;
    private String plusImageMessage;

    public String getPlusTanggal() {
        return plusTanggal;
    }

    public void setPlusTanggal(String plusTanggal) {
        this.plusTanggal = plusTanggal;
    }

    public String getPlusMessage() {
        return plusMessage;
    }

    public void setPlusMessage(String plusMessage) {
        this.plusMessage = plusMessage;
    }

    public String getPlusImageMessage() {
        return plusImageMessage;
    }

    public void setPlusImageMessage(String plusImageMessage) {
        this.plusImageMessage = plusImageMessage;
    }

    public Integer getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(Integer sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    public boolean isDoubleAttactmen() {
        return doubleAttactmen;
    }

    public void setDoubleAttactmen(boolean doubleAttactmen) {
        this.doubleAttactmen = doubleAttactmen;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Long getRwaId() {
        return rwaId;
    }

    public void setRwaId(Long rwaId) {
        this.rwaId = rwaId;
    }

    public boolean isCopyDebitur() {
        return copyDebitur;
    }

    public void setCopyDebitur(boolean copyDebitur) {
        this.copyDebitur = copyDebitur;
    }

    public String getAppraisalTypeCategory() {
        return appraisalTypeCategory;
    }

    public void setAppraisalTypeCategory(String appraisalTypeCategory) {
        this.appraisalTypeCategory = appraisalTypeCategory;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public DataMessageDto getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(DataMessageDto lastMessage) {
        this.lastMessage = lastMessage;
    }

    public Integer getRetention() {
        return retention;
    }

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataAttactmentDto> getAttactments() {
        return attactments;
    }

    public void setAttactments(List<DataAttactmentDto> attactments) {
        this.attactments = attactments;
    }

    public String getBranchBussinesName() {
        return branchBussinesName;
    }

    public void setBranchBussinesName(String branchBussinesName) {
        this.branchBussinesName = branchBussinesName;
    }

    public DataDetailDto getDetail() {
        return detail;
    }

    public void setDetail(DataDetailDto detail) {
        this.detail = detail;
    }

    public Long getDataDetailId() {
        return dataDetailId;
    }

    public void setDataDetailId(Long dataDetailId) {
        this.dataDetailId = dataDetailId;
    }



    public String getCustomerStatusName() {
        return customerStatusName;
    }

    public void setCustomerStatusName(String customerStatusName) {
        this.customerStatusName = customerStatusName;
    }

    public String getCollateralStatusName() {
        return collateralStatusName;
    }

    public void setCollateralStatusName(String collateralStatusName) {
        this.collateralStatusName = collateralStatusName;
    }

    public String getAppraisalTypeName() {
        return appraisalTypeName;
    }

    public void setAppraisalTypeName(String appraisalTypeName) {
        this.appraisalTypeName = appraisalTypeName;
    }

    public int getStatusData() {
        return statusData;
    }

    public void setStatusData(int statusData) {
        this.statusData = statusData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public Long getCustomerStatusId() {
        return customerStatusId;
    }

    public void setCustomerStatusId(Long customerStatusId) {
        this.customerStatusId = customerStatusId;
    }

    public Long getCollateralStatusId() {
        return collateralStatusId;
    }

    public void setCollateralStatusId(Long collateralStatusId) {
        this.collateralStatusId = collateralStatusId;
    }

    public Long getAppraisalTypeId() {
        return appraisalTypeId;
    }

    public void setAppraisalTypeId(Long appraisalTypeId) {
        this.appraisalTypeId = appraisalTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskList() {
        return taskList;
    }

    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTelp() {
        return contactTelp;
    }

    public void setContactTelp(String contactTelp) {
        this.contactTelp = contactTelp;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getPlafonMarketing() {
        return plafonMarketing;
    }

    public void setPlafonMarketing(String plafonMarketing) {
        this.plafonMarketing = plafonMarketing;
    }

    public String getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(String typeReport) {
        this.typeReport = typeReport;
    }

    public String getCollateralId() {
        return collateralId;
    }

    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }

    public String getEformCode() {
        return eformCode;
    }

    public void setEformCode(String eformCode) {
        this.eformCode = eformCode;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getAdminBy() {
        return adminBy;
    }

    public void setAdminBy(String adminBy) {
        this.adminBy = adminBy;
    }

    public Date getAdminDate() {
        return adminDate;
    }

    public void setAdminDate(Date adminDate) {
        this.adminDate = adminDate;
    }

    public String getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getMarketingTelp() {
        return marketingTelp;
    }

    public void setMarketingTelp(String marketingTelp) {
        this.marketingTelp = marketingTelp;
    }

    public String getMarketingHp() {
        return marketingHp;
    }

    public void setMarketingHp(String marketingHp) {
        this.marketingHp = marketingHp;
    }

    public String getRejectCategory() {
        return rejectCategory;
    }

    public void setRejectCategory(String rejectCategory) {
        this.rejectCategory = rejectCategory;
    }

    public String getValuerBy() {
        return valuerBy;
    }

    public void setValuerBy(String valuerBy) {
        this.valuerBy = valuerBy;
    }

    public String getSurveyBy() {
        return surveyBy;
    }

    public void setSurveyBy(String surveyBy) {
        this.surveyBy = surveyBy;
    }

    public Integer getTimUser() {
        return timUser;
    }

    public void setTimUser(Integer timUser) {
        this.timUser = timUser;
    }

    public Integer getParam() {
        return param;
    }

    public void setParam(Integer param) {
        this.param = param;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
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

    public Date getGroupdate() {
        return groupdate;
    }

    public void setGroupdate(Date groupdate) {
        this.groupdate = groupdate;
    }

    public Integer getCountnew() {
        return countnew;
    }

    public void setCountnew(Integer countnew) {
        this.countnew = countnew;
    }

    public Long getSizeNew() {
        return sizeNew;
    }

    public void setSizeNew(Long sizeNew) {
        this.sizeNew = sizeNew;
    }

    public Long getSizeOld() {
        return sizeOld;
    }

    public void setSizeOld(Long sizeOld) {
        this.sizeOld = sizeOld;
    }

    public Integer getCountOld() {
        return countOld;
    }

    public void setCountOld(Integer countOld) {
        this.countOld = countOld;
    }

    public String getCbng() {
        return cbng;
    }

    public void setCbng(String cbng) {
        this.cbng = cbng;
    }

    public String getStsjmnan() {
        return stsjmnan;
    }

    public void setStsjmnan(String stsjmnan) {
        this.stsjmnan = stsjmnan;
    }

    public BigDecimal getCountsjmnan() {
        return countsjmnan;
    }

    public void setCountsjmnan(BigDecimal countsjmnan) {
        this.countsjmnan = countsjmnan;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getGroupdatetxt() {
        return groupdatetxt;
    }

    public void setGroupdatetxt(String groupdatetxt) {
        this.groupdatetxt = groupdatetxt;
    }
}