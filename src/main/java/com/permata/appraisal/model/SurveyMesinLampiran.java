package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_MESIN_LAMPIRAN")
public class SurveyMesinLampiran extends EntityBase<Long> {

    private Long id;
    private SurveyMesin surveyMesin;

    private String jenis;
    private String merk;
    private String typeModel;
    private String noSeri;
    private String tahun;
    private String asal;
    private Integer jumlah;
    private String kegunaan;
    private String kondisi;
    private String rangkaian;
    private String penggunaan;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_MESIN_LAMPIRAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_MESIN_LAMPIRAN_SEQ", sequenceName = "SURVEY_MESIN_LAMPIRAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SURVEY_MESIN", nullable = false)
    public SurveyMesin getSurveyMesin() {
        return surveyMesin;
    }

    public void setSurveyMesin(SurveyMesin surveyMesin) {
        this.surveyMesin = surveyMesin;
    }

    @Column(name = "JENIS_MESIN", length = 50)
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Column(name = "MERK_MESIN", length = 50)
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Column(name = "TYPE_MESIN", length = 50)
    public String getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(String typeModel) {
        this.typeModel = typeModel;
    }

    @Column(name = "NO_SERI", length = 50)
    public String getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(String noSeri) {
        this.noSeri = noSeri;
    }

    @Column(name = "TAHUN_PEMBUATAN", length = 4)
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    @Column(name = "ASAL_PEMBUATAN", length = 50)
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Column(name = "JUMLAH_UNIT")
    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    @Column(name = "KEGUNAAN", length = 50)
    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }

    @Column(name = "KONDISI_MESIN", length = 50)
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    @Column(name = "RANGKAIAN_MESIN", length = 50)
    public String getRangkaian() {
        return rangkaian;
    }

    public void setRangkaian(String rangkaian) {
        this.rangkaian = rangkaian;
    }

    @Column(name = "WAKTU_PENGGUNAAN", length = 50)
    public String getPenggunaan() {
        return penggunaan;
    }

    public void setPenggunaan(String penggunaan) {
        this.penggunaan = penggunaan;
    }
}