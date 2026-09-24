package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;

/**
 * Created by SB on 4/14/2018.
 */


@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_INSPEKSI_ITEM")
public class SurveyItemInspeksi extends EntityBase<Long> {
    private Long id;
    private SurveyInspeksi surveyInspeksi;
    private String type;
    private String name;
    private String totalDoc;
    private String totalFisik;

    public SurveyItemInspeksi() {
        super();
    }

    public SurveyItemInspeksi(SurveyInspeksi surveyInspeksi) {
        this.surveyInspeksi = surveyInspeksi;
    }


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_INSPEKSI_ITEM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_INSPEKSI_ITEM_SEQ", sequenceName = "SURVEY_INSPEKSI_ITEM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SURVEY_INSPEKSI")
    @Fetch(FetchMode.JOIN)
    public SurveyInspeksi getSurveyInspeksi() {
        return surveyInspeksi;
    }

    public void setSurveyInspeksi(SurveyInspeksi surveyInspeksi) {
        this.surveyInspeksi = surveyInspeksi;
    }

    @Column(name = "tipe")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "NAMA")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TOTAL_DOC")
    public String getTotalDoc() {
        return totalDoc;
    }

    public void setTotalDoc(String totalDoc) {
        this.totalDoc = totalDoc;
    }

    @Column(name = "TOTAL_FISIK")
    public String getTotalFisik() {
        return totalFisik;
    }

    public void setTotalFisik(String totalFisik) {
        this.totalFisik = totalFisik;
    }
}
