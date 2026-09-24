package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_PEMBANDING")
public class SurveyPembanding extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private String nama;
    private String telepon;
    private String jenisObject;
    private String alamat;
    private String kondisiBangunan;
    private String kondisiLingkungan;
    private String keterangan;
    private byte[] image;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_PEMBANDING_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_PEMBANDING_SEQ", sequenceName = "SURVEY_PEMBANDING_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "KONTAK_NAMA", nullable = false)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Column(name = "KONTAK_TELP")
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Column(name = "JENIS_OBJECT")
    public String getJenisObject() {
        return jenisObject;
    }

    public void setJenisObject(String jenisObject) {
        this.jenisObject = jenisObject;
    }

    @Column(name = "ALAMAT")
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Column(name = "KONDISI_BANGUNAN")
    public String getKondisiBangunan() {
        return kondisiBangunan;
    }

    public void setKondisiBangunan(String kondisiBangunan) {
        this.kondisiBangunan = kondisiBangunan;
    }

    @Column(name = "KONDISI_LINGKUNGAN")
    public String getKondisiLingkungan() {
        return kondisiLingkungan;
    }

    public void setKondisiLingkungan(String kondisiLingkungan) {
        this.kondisiLingkungan = kondisiLingkungan;
    }

    @Column(name = "KETERANGAN")
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Column(name = "IMAGE")
    @Lob
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}