package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_KENDARAAN")
public class SurveyKendaraan extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private String category;
    private String jenisKendaraan;
    private String merkKendaraan;
    private String modelType;
    private Integer isiSilinder;
    private Integer tahunPembuatan;
    private String warna;
    private String penggunaan;
    private Double kilometer;
    private String noPolisi;
    private String noRangka;
    private String noMesin;
    private String bahanBakar;
    private String catatan;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_KENDARAAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_KENDARAAN_SEQ", sequenceName = "SURVEY_KENDARAAN_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "KATEGORI")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "JENIS")
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @Column(name = "MERK")
    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    @Column(name = "MODEL")
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Column(name = "SILINDER")
    public Integer getIsiSilinder() {
        return isiSilinder;
    }

    public void setIsiSilinder(Integer isiSilinder) {
        this.isiSilinder = isiSilinder;
    }

    @Column(name = "TAHUN_PEMBUATAN")
    public Integer getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(Integer tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    @Column(name = "WARNA")
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Column(name = "PENGGUNAAN")
    public String getPenggunaan() {
        return penggunaan;
    }

    public void setPenggunaan(String penggunaan) {
        this.penggunaan = penggunaan;
    }

    @Column(name = "KILOMETER")
    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    @Column(name = "NO_POLISI")
    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    @Column(name = "NO_RANGKA")
    public String getNoRangka() {
        return noRangka;
    }

    public void setNoRangka(String noRangka) {
        this.noRangka = noRangka;
    }

    @Column(name = "NO_MESIN")
    public String getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    @Column(name = "BAHAN_BAKAR")
    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Column(name = "CATATAN")
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}