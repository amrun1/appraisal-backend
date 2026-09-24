package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityAuditrailBase;
import com.permata.appraisal.util.ListUtils;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "DATA_UMUM")
public class DataCommon extends EntityAuditrailBase<Long> {

    private Long id;
    private String orderNumber;
    private Branch marketingBranch;
    private AppraisalBranch branch;
    private StatusNasabah customerStatus;
    private StatusJaminan collateralStatus;
    private JenisAppraisal appraisalType;
    private String appraisalTypeCategory;
    private DataDetail dataDetail;
    private String name;
    private String taskList;
    private String position;
    private String lastPosition; // posisi pengirim task, di isi pada waktu SUBMIT TO
    private String contactName;
    private String contactTelp;
    private String dateString;
    private String plafonMarketing;
    private String typeReport;
    private String collateralId;
    private String catatan;
    private Date submitDate;
    private String adminBy;
    private Date adminDate;
    private String closedBy;
    private Date closedDate;
    private String valueBy;
    private Date valueDate;
    private String surveyBy;
    private Date surveyDate;
    private String pendingBy;
    private Date pendingDate;
    private String pendingPosition;
    private String unpendingBy;
    private Date unpendingDate;
    private List<DataMessage> messages;
    private List<TaskHistory> histories;
    private List<DataReject> rejectList;



    // source id koneksi ke system lain
    private String source;
    private String sourceId;
    private Integer sourceStatus;

    // Appraisal Admin field
    private Integer retention;
    private Kjpp kjpp;

    private List<IloanProgres> iloan;

    @Id
    @GeneratedValue(generator = "DATA_UMUM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "DATA_UMUM_SEQ", sequenceName = "DATA_UMUM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dataCommon", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<IloanProgres> getIloan() {
        return iloan;
    }

    public void setIloan(List<IloanProgres> iloan) {
        this.iloan = iloan;
    }

    @Column(name = "NO_ORDER", unique = true, length = 15)
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dataCommon", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @OrderBy("date desc")
    public List<DataMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<DataMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(DataMessage message) {
        message.setDataCommon(this);
        if (ListUtils.isEmpty(messages)) {
            messages = new ArrayList<DataMessage>();
        }
        messages.add(message);
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dataCommon", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @OrderBy("date desc")
    public List<TaskHistory> getHistories() {
        return histories;
    }

    public void setHistories(List<TaskHistory> histories) {
        this.histories = histories;
    }

    public void addHistory(TaskHistory history) {
        history.setDataCommon(this);
        if (ListUtils.isEmpty(histories)) {
            histories = new ArrayList<TaskHistory>();
        }
        histories.add(history);
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dataCommon", cascade = CascadeType.ALL)
    public List<DataReject> getRejectList() {
        return rejectList;
    }

    public void setRejectList(List<DataReject> rejectList) {
        this.rejectList = rejectList;
    }

    @Column(name = "RETENTION", length = 2)
    public Integer getRetention() {
        return retention;
    }

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CABANG_ID")
    public Branch getMarketingBranch() {
        return marketingBranch;
    }

    public void setMarketingBranch(Branch marketingBranch) {
        this.marketingBranch = marketingBranch;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPRAISAL_CABANG_ID")

    public AppraisalBranch getBranch() {
        return branch;
    }

    public void setBranch(AppraisalBranch branch) {
        this.branch = branch;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_NASABAH_ID")
    public StatusNasabah getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(StatusNasabah customerStatus) {
        this.customerStatus = customerStatus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_JAMINAN_ID")
    public StatusJaminan getCollateralStatus() {
        return collateralStatus;
    }

    public void setCollateralStatus(StatusJaminan collateralStatus) {
        this.collateralStatus = collateralStatus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JENIS_APPRAISAL_ID")
    public JenisAppraisal getAppraisalType() {
        return appraisalType;
    }

    public void setAppraisalType(JenisAppraisal appraisalType) {
        this.appraisalType = appraisalType;
    }

    @Column(name = "KATEGORI_APPRAISAL", length = 15)
    public String getAppraisalTypeCategory() {
        return appraisalTypeCategory;
    }

    public void setAppraisalTypeCategory(String appraisalTypeCategory) {
        this.appraisalTypeCategory = appraisalTypeCategory;
    }

    @Column(name = "NAMA", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TASK_LIST", length = 50)
    public String getTaskList() {
        return taskList;
    }

    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }

    @Column(name = "POSISI", length = 15)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Column(name = "POSISI_TERAKHIR", length = 15)
    public String getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(String lastPosition) {
        this.lastPosition = lastPosition;
    }

    @Column(name = "NAMA_CONTACT_PERSON", length = 100)
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Column(name = "TELP_CONTACT_PERSON")
    public String getContactTelp() {
        return contactTelp;
    }

    public void setContactTelp(String contactTelp) {
        this.contactTelp = contactTelp;
    }

    @Column(name = "WAKTU")
    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    @Column(name = "PLAFOND_MARKETING")
    public String getPlafonMarketing() {
        return plafonMarketing;
    }

    public void setPlafonMarketing(String plafonMarketing) {
        this.plafonMarketing = plafonMarketing;
    }

    @Column(name = "JENIS_LAPORAN", length = 100)
    public String getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(String typeReport) {
        this.typeReport = typeReport;
    }

    @Column(name = "COLLATERAL_ID")
    public String getCollateralId() {
        return collateralId;
    }

    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }

    @Column(name = "SOURCE")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Column(name = "ID_SOURCE")
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Column(name = "CATATAN")
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @Column(name = "ADMIN_BY", length = 50)
    public String getAdminBy() {
        return adminBy;
    }

    public void setAdminBy(String adminBy) {
        this.adminBy = adminBy;
    }

    @Column(name = "ADMIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAdminDate() {
        return adminDate;
    }

    public void setAdminDate(Date adminDate) {
        this.adminDate = adminDate;
    }

    @Column(name = "CLOSED_BY", length = 50)
    public String getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    @Column(name = "CLOSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    @OneToOne(mappedBy = "dataCommon", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public DataDetail getDataDetail() {
        return dataDetail;
    }

    public void setDataDetail(DataDetail dataDetail) {
        if(dataDetail != null) {
            dataDetail.setDataCommon(this);
        }
        this.dataDetail = dataDetail;
    }

    @Column(name = "VALUE_BY", length = 50)
    public String getValueBy() {
        return valueBy;
    }

    public void setValueBy(String valueBy) {
        this.valueBy = valueBy;
    }

    @Column(name = "VALUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    @Column(name = "SURVEY_BY", length = 50)
    public String getSurveyBy() {
        return surveyBy;
    }

    public void setSurveyBy(String surveyBy) {
        this.surveyBy = surveyBy;
    }

    @Column(name = "SURVEY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KJPP")
    public Kjpp getKjpp() {
        return kjpp;
    }

    public void setKjpp(Kjpp kjpp) {
        this.kjpp = kjpp;
    }

    @Column(name = "SUBMIT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    @Column(name = "PENDING_BY")
    public String getPendingBy() {
        return pendingBy;
    }

    public void setPendingBy(String pendingBy) {
        this.pendingBy = pendingBy;
    }

    @Column(name = "PENDING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getPendingDate() {
        return pendingDate;
    }

    public void setPendingDate(Date pendingDate) {
        this.pendingDate = pendingDate;
    }

    @Column(name = "UNPENDING_BY")
    public String getUnpendingBy() {
        return unpendingBy;
    }

    public void setUnpendingBy(String unpendingBy) {
        this.unpendingBy = unpendingBy;
    }

    @Column(name = "UNPENDING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUnpendingDate() {
        return unpendingDate;
    }

    public void setUnpendingDate(Date unpendingDate) {
        this.unpendingDate = unpendingDate;
    }

    @Column(name = "PENDING_POSITION", length = 15)
    public String getPendingPosition() {
        return pendingPosition;
    }

    public void setPendingPosition(String pendingPosition) {
        this.pendingPosition = pendingPosition;
    }

    @Column(name = "SOURCE_STATUS")
    public Integer getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(Integer sourceStatus) {
        this.sourceStatus = sourceStatus;
    }
}