package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_TANAH")
public class SurveyTanah extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private Double luas;
    private String bentuk;
    private String kontur;
    private String ketinggian;
    private String batas;
    private String posisi;
    private String kondisi;
    private String jenis;
    private String utara;
    private String selatan;
    private String timur;
    private String barat;
    private String peruntukanTanah;




    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_TANAH_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_TANAH_SEQ", sequenceName = "SURVEY_TANAH_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "LUAS")
    public Double getLuas() {
        return luas;
    }

    public void setLuas(Double luas) {
        this.luas = luas;
    }

    @Column(name = "BENTUK")
    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    @Column(name = "KONTUR")
    public String getKontur() {
        return kontur;
    }

    public void setKontur(String kontur) {
        this.kontur = kontur;
    }

    @Column(name = "KETINGGIAN")
    public String getKetinggian() {
        return ketinggian;
    }

    public void setKetinggian(String ketinggian) {
        this.ketinggian = ketinggian;
    }

    @Column(name = "KESESUAIAN_BATAS")
    public String getBatas() {
        return batas;
    }

    public void setBatas(String batas) {
        this.batas = batas;
    }

    @Column(name = "POSISI")
    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    @Column(name = "KONDISI")
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    @Column(name = "JENIS")
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Column(name = "BATAS_UTARA")
    public String getUtara() {
        return utara;
    }

    public void setUtara(String utara) {
        this.utara = utara;
    }

    @Column(name = "BATAS_SELATAN")
    public String getSelatan() {
        return selatan;
    }

    public void setSelatan(String selatan) {
        this.selatan = selatan;
    }

    @Column(name = "BATAS_TIMUR")
    public String getTimur() {
        return timur;
    }

    public void setTimur(String timur) {
        this.timur = timur;
    }

    @Column(name = "BATAS_BARAT")
    public String getBarat() {
        return barat;
    }

    public void setBarat(String barat) {
        this.barat = barat;
    }


    @Column(name = "PERUNTUKAN")
    public String getPeruntukanTanah() {
        return peruntukanTanah;
    }

    public void setPeruntukanTanah(String peruntukanTanah) {
        this.peruntukanTanah = peruntukanTanah;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SurveyTanah{");
        sb.append("id=").append(id);
        sb.append(", detail=").append(detail);
        sb.append(", luas=").append(luas);
        sb.append(", bentuk='").append(bentuk).append('\'');
        sb.append(", kontur='").append(kontur).append('\'');
        sb.append(", ketinggian='").append(ketinggian).append('\'');
        sb.append(", batas='").append(batas).append('\'');
        sb.append(", posisi='").append(posisi).append('\'');
        sb.append(", kondisi='").append(kondisi).append('\'');
        sb.append(", jenis='").append(jenis).append('\'');
        sb.append(", utara='").append(utara).append('\'');
        sb.append(", selatan='").append(selatan).append('\'');
        sb.append(", timur='").append(timur).append('\'');
        sb.append(", barat='").append(barat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}