package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_UMUM")
public class SurveyCommon extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private JenisPenilaian jenisPenilaian;
    private String hasil;
    private String jenisObject;
    private String lokasi;
    private String dipergunakan;
    private String dihuni;
    private String ditemui;
    private String ditinjau;
    private Date tanggal;
    private String catatanSurvey;
    private String catatan;

    private List<SurveyImage> lisImage;


    @OneToMany (fetch = FetchType.LAZY, mappedBy = "common", cascade = {CascadeType.ALL})
    public List<SurveyImage> getLisImage() {
        return lisImage;
    }

    public void setLisImage(List<SurveyImage> lisImage) {
        this.lisImage = lisImage;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_UMUM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_UMUM_SEQ", sequenceName = "SURVEY_UMUM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDetail() {
        return detail;
    }

    public void setDetail(DataDetail detail) {
        this.detail = detail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PENILAIAN")
    public JenisPenilaian getJenisPenilaian() {
        return jenisPenilaian;
    }

    public void setJenisPenilaian(JenisPenilaian jenisPenilaian) {
        this.jenisPenilaian = jenisPenilaian;
    }

    @Column(name = "HASIL_SURVEY")
    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    @Column(name = "JENIS_OBJEK")
    public String getJenisObject() {
        return jenisObject;
    }

    public void setJenisObject(String jenisObject) {
        this.jenisObject = jenisObject;
    }

    @Column(name = "LOKASI")
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @Column(name = "DIGUNAKAN")
    public String getDipergunakan() {
        return dipergunakan;
    }

    public void setDipergunakan(String dipergunakan) {
        this.dipergunakan = dipergunakan;
    }

    @Column(name = "DIHUNI")
    public String getDihuni() {
        return dihuni;
    }

    public void setDihuni(String dihuni) {
        this.dihuni = dihuni;
    }

    @Column(name = "DITEMUI")
    public String getDitemui() {
        return ditemui;
    }

    public void setDitemui(String ditemui) {
        this.ditemui = ditemui;
    }

    @Column(name = "DITINJAU")
    public String getDitinjau() {
        return ditinjau;
    }

    public void setDitinjau(String ditinjau) {
        this.ditinjau = ditinjau;
    }

    @Column(name = "TANGGAL")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Column(name = "CATATAN_SURVEY")
    public String getCatatanSurvey() {
        return catatanSurvey;
    }

    public void setCatatanSurvey(String catatanSurvey) {
        this.catatanSurvey = catatanSurvey;
    }

    @Column(name = "CATATAN")
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}