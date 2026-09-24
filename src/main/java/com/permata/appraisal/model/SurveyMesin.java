package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityAuditrailBase;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_MESIN")
public class SurveyMesin extends EntityAuditrailBase<Long> {

    private Long id;
    private DataDetail detail;

    private String tempat;
    private String kondisi;
    private String lingkungan;
    private String teknisi;
    private String cukuCadang;
    private String catatan;

    private List<SurveyMesinLampiran> lampiran;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_MESIN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_MESIN_SEQ", sequenceName = "SURVEY_MESIN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDetail() {
        return detail;
    }

    public void setDetail(DataDetail detail) {
        this.detail = detail;
    }

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "surveyMesin")
    public List<SurveyMesinLampiran> getLampiran() {
        return lampiran;
    }

    public void setLampiran(List<SurveyMesinLampiran> lampiran) {
        this.lampiran = lampiran;
    }

    @Column(name = "TEMPAT_OPERASIONAL", length = 50)
    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    @Column(name = "KONDISI_TEMPAT", length = 50)
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    @Column(name = "LINGKUNGAN_SEKITAR", length = 50)
    public String getLingkungan() {
        return lingkungan;
    }

    public void setLingkungan(String lingkungan) {
        this.lingkungan = lingkungan;
    }

    @Column(name = "TEKNISI", length = 50)
    public String getTeknisi() {
        return teknisi;
    }

    public void setTeknisi(String teknisi) {
        this.teknisi = teknisi;
    }

    @Column(name = "SUKU_CADANG", length = 50)
    public String getCukuCadang() {
        return cukuCadang;
    }

    public void setCukuCadang(String cukuCadang) {
        this.cukuCadang = cukuCadang;
    }

    public String getCatatan() {
        return catatan;
    }

    @Column(name = "CATATAN", length = 200)
    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}
