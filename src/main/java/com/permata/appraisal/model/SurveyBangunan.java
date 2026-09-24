package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_BANGUNAN")
public class SurveyBangunan extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private Double luas;
    private Double lantai1;
    private Double lantai2;
    private Double lantai3;
    private Double lantai4;
    private Double lantai5;
    private Boolean manual;
    private Integer jumlahLantai;
    private Integer jumlahLantaiTampakDepan;
    private String peruntukan;
    private String kelas;
    private String jenis;
    private Integer tahunDibangun;
    private Integer tahunRenovasi;
    private String kondisiUmum;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_BANGUNAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_BANGUNAN_SEQ", sequenceName = "SURVEY_BANGUNAN_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "JENIS_BANGUNAN")
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Column(name = "LUAS")
    public Double getLuas() {
        return luas;
    }

    public void setLuas(Double luas) {
        this.luas = luas;
    }

    @Column(name = "JUMLAH_LANTAI")
    public Integer getJumlahLantai() {
        return jumlahLantai;
    }

    public void setJumlahLantai(Integer jumlahLantai) {
        this.jumlahLantai = jumlahLantai;
    }

    @Column(name = "PERUNTUKAN")
    public String getPeruntukan() {
        return peruntukan;
    }

    public void setPeruntukan(String peruntukan) {
        this.peruntukan = peruntukan;
    }

    @Column(name = "KELAS_BANGUNAN")
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Column(name = "TAHUN_DIBANGUN")
    public Integer getTahunDibangun() {
        return tahunDibangun;
    }

    public void setTahunDibangun(Integer tahunDibangun) {
        this.tahunDibangun = tahunDibangun;
    }

    @Column(name = "TAHUN_RENOVASI")
    public Integer getTahunRenovasi() {
        return tahunRenovasi;
    }

    public void setTahunRenovasi(Integer tahunRenovasi) {
        this.tahunRenovasi = tahunRenovasi;
    }

    @Column(name = "KONDISI_UMUM")
    public String getKondisiUmum() {
        return kondisiUmum;
    }

    public void setKondisiUmum(String kondisiUmum) {
        this.kondisiUmum = kondisiUmum;
    }

    @Column(name = "LUAS_LANTAI_1")
    public Double getLantai1() {
        return lantai1;
    }

    public void setLantai1(Double lantai1) {
        this.lantai1 = lantai1;
    }

    @Column(name = "LUAS_LANTAI_2")
    public Double getLantai2() {
        return lantai2;
    }

    public void setLantai2(Double lantai2) {
        this.lantai2 = lantai2;
    }

    @Column(name = "LUAS_LANTAI_3")
    public Double getLantai3() {
        return lantai3;
    }

    public void setLantai3(Double lantai3) {
        this.lantai3 = lantai3;
    }

    @Column(name = "LUAS_LANTAI_4")
    public Double getLantai4() {
        return lantai4;
    }

    public void setLantai4(Double lantai4) {
        this.lantai4 = lantai4;
    }

    @Column(name = "LUAS_LANTAI_5")
    public Double getLantai5() {
        return lantai5;
    }

    public void setLantai5(Double lantai5) {
        this.lantai5 = lantai5;
    }

    @Column(name = "HITUNG_MANUAL")
    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    @Column(name = "JUMLAH_LANTAI_DEPAN")
    public Integer getJumlahLantaiTampakDepan() {
        return jumlahLantaiTampakDepan;
    }

    public void setJumlahLantaiTampakDepan(Integer jumlahLantaiTampakDepan) {
        this.jumlahLantaiTampakDepan = jumlahLantaiTampakDepan;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SurveyBangunan{");
        sb.append("id=").append(id);
        sb.append(", detail=").append(detail);
        sb.append(", luas=").append(luas);
        sb.append(", lantai1=").append(lantai1);
        sb.append(", lantai2=").append(lantai2);
        sb.append(", lantai3=").append(lantai3);
        sb.append(", lantai4=").append(lantai4);
        sb.append(", lantai5=").append(lantai5);
        sb.append(", manual=").append(manual);
        sb.append(", jumlahLantai=").append(jumlahLantai);
        sb.append(", jumlahLantaiTampakDepan=").append(jumlahLantaiTampakDepan);
        sb.append(", peruntukan='").append(peruntukan).append('\'');
        sb.append(", kelas='").append(kelas).append('\'');
        sb.append(", jenis='").append(jenis).append('\'');
        sb.append(", tahunDibangun=").append(tahunDibangun);
        sb.append(", tahunRenovasi=").append(tahunRenovasi);
        sb.append(", kondisiUmum='").append(kondisiUmum).append('\'');
        sb.append('}');
        return sb.toString();
    }
}