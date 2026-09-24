package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "ILOAN_PROGRES")
public class IloanProgres extends EntityBase<Long> {

    public static final int STATUS_SAVE = 0;
    public static final int STATUS_SEND_PROGRES = 1;
    public static final int STATUS_SEND_SUKSES = 2;
    public static final int STATUS_SEND_GAGAL = 3;
    public static final int STATUS_SEND_MANUAL = 4;

    private Long id;
    private DataCommon dataCommon;

    // progress field
    private Integer status;
    private Date waktuKirim;
    private Date waktuSimpan;
    private String respon;
    private Long headId;

    // RWA field
    private Long rwaId;
    private Date downDate;
    private String accountNo;
    private String cifJha;
    private String name;
    private BigDecimal plafond;
    private BigDecimal outstanding;
    private Date maturDate;
    private String collateralId;
    private String groupVal;
    private String collateralCode;
    private String collateralCategory;
    private String buildingOwner;
    private Boolean sertificateStatus;
    private String titleNumber;
    private String sertificateType;
    private String picNumber;
    private String location;
    private String locationCode;
    private BigDecimal aprExt;
    private Date aprExtDate;
    private String extValCode;
    private BigDecimal aprInt;
    private Date aprIntDate;
    private String intValCode;
    private BigDecimal extLandAprDoc;
    private BigDecimal extBldAprDoc;
    private BigDecimal extTotDoc;
    private BigDecimal extLandAprFisik;
    private BigDecimal extBldAprFisik;
    private BigDecimal extTotFisik;
    private BigDecimal intLandAprDoc;
    private BigDecimal intBldAprDoc;
    private BigDecimal intTotDoc;
    private BigDecimal intLandAprFisik;
    private BigDecimal intBldAprFisik;
    private BigDecimal intTotFisik;
    private String noSht;
    private String noApht;
    private Date aphtDate;
    private String noSuratIjin;
    private String appNumber;
    private String facilityCode;
    private Long seqNumber;
    private String facilityNumber;
    private String mainFacilityAa;
    private String mainFacilityCode;
    private Long mainFacilitySeq;
    private String facilityNo;
    private Date createdDate;
    private Long priority;


    @Id
    @GeneratedValue(generator = "ILOAN_PROGRES_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "ILOAN_PROGRES_SEQ", sequenceName = "ILOAN_PROGRES_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "ID_DATA_UMUM", nullable = false)
    public DataCommon getDataCommon() {
        return dataCommon;
    }

    public void setDataCommon(DataCommon dataCommon) {
        this.dataCommon = dataCommon;
    }

    @Column(name = "HEAD_ID")
    public Long getHeadId() {
        return headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    @Column(name = "STATUS_DATA", length = 1)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "WAKTU_KIRIM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getWaktuKirim() {
        return waktuKirim;
    }

    public void setWaktuKirim(Date waktuKirim) {
        this.waktuKirim = waktuKirim;
    }

    @Column(name = "WAKTU_SIMPAN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getWaktuSimpan() {
        return waktuSimpan;
    }

    public void setWaktuSimpan(Date waktuSimpan) {
        this.waktuSimpan = waktuSimpan;
    }

    @Column(name = "RESPON_STATUS")
    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
    }

    @Column(name = "ID_RWA", nullable = false)
    public Long getRwaId() {
        return rwaId;
    }

    public void setRwaId(Long rwaId) {
        this.rwaId = rwaId;
    }

    @Column(name = "DOWN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDownDate() {
        return downDate;
    }

    public void setDownDate(Date downDate) {
        this.downDate = downDate;
    }

    @Column(name = "ACCOUNT_NO", length = 19, nullable = false)
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Column(name = "CIF_JHA", length = 7, nullable = false)
    public String getCifJha() {
        return cifJha;
    }

    public void setCifJha(String cifJha) {
        this.cifJha = cifJha;
    }

    @Column(name = "NAME", length = 40, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PLAFOND")
    public BigDecimal getPlafond() {
        return plafond;
    }

    public void setPlafond(BigDecimal plafond) {
        this.plafond = plafond;
    }

    @Column(name = "OUTSTANDING", nullable = false)
    public BigDecimal getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(BigDecimal outstanding) {
        this.outstanding = outstanding;
    }

    @Column(name = "MATUR_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getMaturDate() {
        return maturDate;
    }

    public void setMaturDate(Date maturDate) {
        this.maturDate = maturDate;
    }

    @Column(name = "COLLATERAL_ID", length = 35, nullable = false)
    public String getCollateralId() {
        return collateralId;
    }

    public void setCollateralId(String collateralId) {
        this.collateralId = collateralId;
    }

    @Column(name = "GROUP_VAL", length = 35, nullable = false)
    public String getGroupVal() {
        return groupVal;
    }

    public void setGroupVal(String groupVal) {
        this.groupVal = groupVal;
    }

    @Column(name = "COLLATERAL_CODE", length = 3)
    public String getCollateralCode() {
        return collateralCode;
    }

    public void setCollateralCode(String collateralCode) {
        this.collateralCode = collateralCode;
    }

    @Column(name = "COLLATERAL_CATEGORY", length = 5)
    public String getCollateralCategory() {
        return collateralCategory;
    }

    public void setCollateralCategory(String collateralCategory) {
        this.collateralCategory = collateralCategory;
    }

    @Column(name = "BUILDING_OWNER")
    public String getBuildingOwner() {
        return buildingOwner;
    }

    public void setBuildingOwner(String buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    @Column(name = "SERTIFICATE_STATUS")
    public Boolean getSertificateStatus() {
        return sertificateStatus;
    }

    public void setSertificateStatus(Boolean sertificateStatus) {
        this.sertificateStatus = sertificateStatus;
    }

    @Column(name = "TITLE_NUMBER")
    public String getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(String titleNumber) {
        this.titleNumber = titleNumber;
    }

    @Column(name = "SERTIFICATE_TYPE")
    public String getSertificateType() {
        return sertificateType;
    }

    public void setSertificateType(String sertificateType) {
        this.sertificateType = sertificateType;
    }

    @Column(name = "PIC_NUMBER")
    public String getPicNumber() {
        return picNumber;
    }

    public void setPicNumber(String picNumber) {
        this.picNumber = picNumber;
    }

    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "LOCATION_CODE")
    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    @Column(name = "APR_EXT")
    public BigDecimal getAprExt() {
        return aprExt;
    }

    public void setAprExt(BigDecimal aprExt) {
        this.aprExt = aprExt;
    }

    @Column(name = "APR_EXT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAprExtDate() {
        return aprExtDate;
    }

    public void setAprExtDate(Date aprExtDate) {
        this.aprExtDate = aprExtDate;
    }

    @Column(name = "EXT_VAL_CODE")
    public String getExtValCode() {
        return extValCode;
    }

    public void setExtValCode(String extValCode) {
        this.extValCode = extValCode;
    }

    @Column(name = "APR_INT")
    public BigDecimal getAprInt() {
        return aprInt;
    }

    public void setAprInt(BigDecimal aprInt) {
        this.aprInt = aprInt;
    }

    @Column(name = "APR_INT_DATE")
    public Date getAprIntDate() {
        return aprIntDate;
    }

    public void setAprIntDate(Date aprIntDate) {
        this.aprIntDate = aprIntDate;
    }

    @Column(name = "INT_VAL_CODE")
    public String getIntValCode() {
        return intValCode;
    }

    public void setIntValCode(String intValCode) {
        this.intValCode = intValCode;
    }

    @Column(name = "EXT_LAND_APR_DOC")
    public BigDecimal getExtLandAprDoc() {
        return extLandAprDoc;
    }

    public void setExtLandAprDoc(BigDecimal extLandAprDoc) {
        this.extLandAprDoc = extLandAprDoc;
    }

    @Column(name = "EXT_BLD_APR_DOC")
    public BigDecimal getExtBldAprDoc() {
        return extBldAprDoc;
    }

    public void setExtBldAprDoc(BigDecimal extBldAprDoc) {
        this.extBldAprDoc = extBldAprDoc;
    }

    @Column(name = "EXT_TOT_DOC")
    public BigDecimal getExtTotDoc() {
        return extTotDoc;
    }

    public void setExtTotDoc(BigDecimal extTotDoc) {
        this.extTotDoc = extTotDoc;
    }

    @Column(name = "EXT_LAND_APR_FISIK")
    public BigDecimal getExtLandAprFisik() {
        return extLandAprFisik;
    }

    public void setExtLandAprFisik(BigDecimal extLandAprFisik) {
        this.extLandAprFisik = extLandAprFisik;
    }

    @Column(name = "EXT_BLD_APR_FISIK")
    public BigDecimal getExtBldAprFisik() {
        return extBldAprFisik;
    }

    public void setExtBldAprFisik(BigDecimal extBldAprFisik) {
        this.extBldAprFisik = extBldAprFisik;
    }

    @Column(name = "EXT_TOT_FISIK")
    public BigDecimal getExtTotFisik() {
        return extTotFisik;
    }

    public void setExtTotFisik(BigDecimal extTotFisik) {
        this.extTotFisik = extTotFisik;
    }

    @Column(name = "INT_LAND_APR_DOC")
    public BigDecimal getIntLandAprDoc() {
        return intLandAprDoc;
    }

    public void setIntLandAprDoc(BigDecimal intLandAprDoc) {
        this.intLandAprDoc = intLandAprDoc;
    }

    @Column(name = "INT_BLD_APR_DOC")
    public BigDecimal getIntBldAprDoc() {
        return intBldAprDoc;
    }

    public void setIntBldAprDoc(BigDecimal intBldAprDoc) {
        this.intBldAprDoc = intBldAprDoc;
    }

    @Column(name = "INT_TOT_DOC")
    public BigDecimal getIntTotDoc() {
        return intTotDoc;
    }

    public void setIntTotDoc(BigDecimal intTotDoc) {
        this.intTotDoc = intTotDoc;
    }

    @Column(name = "INT_LAND_APR_FISIK")
    public BigDecimal getIntLandAprFisik() {
        return intLandAprFisik;
    }

    public void setIntLandAprFisik(BigDecimal intLandAprFisik) {
        this.intLandAprFisik = intLandAprFisik;
    }

    @Column(name = "INT_BLD_APR_FISIK")
    public BigDecimal getIntBldAprFisik() {
        return intBldAprFisik;
    }

    public void setIntBldAprFisik(BigDecimal intBldAprFisik) {
        this.intBldAprFisik = intBldAprFisik;
    }

    @Column(name = "INT_TOT_FISIK")
    public BigDecimal getIntTotFisik() {
        return intTotFisik;
    }

    public void setIntTotFisik(BigDecimal intTotFisik) {
        this.intTotFisik = intTotFisik;
    }

    @Column(name = "NO_SHT")
    public String getNoSht() {
        return noSht;
    }

    public void setNoSht(String noSht) {
        this.noSht = noSht;
    }

    @Column(name = "NO_APHT")
    public String getNoApht() {
        return noApht;
    }

    public void setNoApht(String noApht) {
        this.noApht = noApht;
    }

    @Column(name = "APHT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAphtDate() {
        return aphtDate;
    }

    public void setAphtDate(Date aphtDate) {
        this.aphtDate = aphtDate;
    }

    @Column(name = "NO_SURAT_IJIN")
    public String getNoSuratIjin() {
        return noSuratIjin;
    }

    public void setNoSuratIjin(String noSuratIjin) {
        this.noSuratIjin = noSuratIjin;
    }

    @Column(name = "APP_NUMBER")
    public String getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    @Column(name = "FACILITY_CODE")
    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    @Column(name = "SEQ_NUMBER")
    public Long getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(Long seqNumber) {
        this.seqNumber = seqNumber;
    }

    @Column(name = "FACILITY_NUMBER")
    public String getFacilityNumber() {
        return facilityNumber;
    }

    public void setFacilityNumber(String facilityNumber) {
        this.facilityNumber = facilityNumber;
    }

    @Column(name = "MAIN_FACILITY_AA")
    public String getMainFacilityAa() {
        return mainFacilityAa;
    }

    public void setMainFacilityAa(String mainFacilityAa) {
        this.mainFacilityAa = mainFacilityAa;
    }

    @Column(name = "MAIN_FACILITY_CODE")
    public String getMainFacilityCode() {
        return mainFacilityCode;
    }

    public void setMainFacilityCode(String mainFacilityCode) {
        this.mainFacilityCode = mainFacilityCode;
    }

    @Column(name = "MAIN_FACILITY_SEQ")
    public Long getMainFacilitySeq() {
        return mainFacilitySeq;
    }

    public void setMainFacilitySeq(Long mainFacilitySeq) {
        this.mainFacilitySeq = mainFacilitySeq;
    }

    @Column(name = "FACILITY_NO")
    public String getFacilityNo() {
        return facilityNo;
    }

    public void setFacilityNo(String facilityNo) {
        this.facilityNo = facilityNo;
    }

    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "PRIORITY")
    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }
}