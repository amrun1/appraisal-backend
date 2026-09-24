package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_LAPORAN_DOKUMEN")
public class DocumentLpaType extends EntityBase<Long> {

    private Long id;
    private String name;
    private AssetType assetType;
    private JenisAppraisal appraisal;
    private Boolean mandatory;
    private Boolean surveyYn;
    private Boolean readFileYn;
    private String jenisData;



    @Id
    @GeneratedValue(generator = "JENIS_LAPORAN_DOKUMEN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "JENIS_LAPORAN_DOKUMEN_SEQ", sequenceName = "JENIS_LAPORAN_DOKUMEN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAMA", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_AKTIVA")
    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_APPRAISAL")
    public JenisAppraisal getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(JenisAppraisal appraisal) {
        this.appraisal = appraisal;
    }

    @Column(name = "MANDATORY")
    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Column(name = "FORM_SURVEY")
    public Boolean getSurveyYn() {
        return surveyYn;
    }

    public void setSurveyYn(Boolean surveyYn) {
        this.surveyYn = surveyYn;
    }

    @Column(name = "READ_FILE")
    public Boolean getReadFileYn() {
        return readFileYn;
    }

    public void setReadFileYn(Boolean readFileYn) {
        this.readFileYn = readFileYn;
    }


    @Column(name = "JENIS_DATA")
    public String getJenisData() {
        return jenisData;
    }

    public void setJenisData(String jenisData) {
        this.jenisData = jenisData;
    }

}