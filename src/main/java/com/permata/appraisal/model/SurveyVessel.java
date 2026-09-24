package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityAuditrailBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_VESSEL")
public class SurveyVessel extends EntityAuditrailBase<Long> {

    private Long id;
    private DataDetail detail;

    private String nama;
    private String pemilik;
    private String kebangsaan;
    private String selar;
    private String galangan;
    private String kelas;
    private Integer tahun;
    private String manufaktur;
    private Double panjang;
    private Double lebar;
    private Double tinggi;
    private Double isiKotor;
    private Double isiBersih;
    private String statusAgunan;
    private String statusJaminanKapal;
    private String kondisiUmum;

    // data Mesin LpaKapal
    private String mesinMerk1;
    private String mesinMerk2;
    private String mesinMerk3;
    private String mesinNomor1;
    private String mesinNomor2;
    private String mesinNomor3;
    private String mesinKapasitas1;
    private String mesinKapasitas2;
    private String mesinKapasitas3;
    private String mesinBackupMerk1;
    private String mesinBackupMerk2;
    private String mesinBackupNomor1;
    private String mesinBackupNomor2;
    private String mesinBackupKapasitas1;
    private String mesinBackupKapasitas2;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_VESSEL_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_VESSEL_SEQ", sequenceName = "SURVEY_VESSEL_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(length = 150, name = "NAMA_KAPAL")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Column(length = 100, name = "NAMA_PEMILIK")
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Column(length = 100, name = "KEBANGSAAN")
    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }

    @Column(length = 10, name = "STATUS_AGUNAN")
    public String getStatusAgunan() {
        return statusAgunan;
    }

    public void setStatusAgunan(String statusAgunan) {
        this.statusAgunan = statusAgunan;
    }

    @Column(length = 50, name = "STATUS_JAMINAN")
    public String getStatusJaminanKapal() {
        return statusJaminanKapal;
    }

    public void setStatusJaminanKapal(String statusJaminanKapal) {
        this.statusJaminanKapal = statusJaminanKapal;
    }

    @Column(length = 50, name = "KONDISI_UMUM")
    public String getKondisiUmum() {
        return kondisiUmum;
    }

    public void setKondisiUmum(String kondisiUmum) {
        this.kondisiUmum = kondisiUmum;
    }

    @Column(length = 100, name = "SELAR")
    public String getSelar() {
        return selar;
    }

    public void setSelar(String selar) {
        this.selar = selar;
    }

    @Column(length = 100, name = "GALANGAN")
    public String getGalangan() {
        return galangan;
    }

    public void setGalangan(String galangan) {
        this.galangan = galangan;
    }

    @Column(length = 100, name = "KELAS")
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Column(length = 4, name = "TAHUN")
    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    @Column(length = 100, name = "MANUFAKTUR")
    public String getManufaktur() {
        return manufaktur;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    @Column(length = 10, name = "PANJANG")
    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    @Column(length = 10, name = "LEBAR")
    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    @Column(length = 10, name = "TINGGI")
    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    @Column(length = 10, name = "ISI_KOTOR")
    public Double getIsiKotor() {
        return isiKotor;
    }

    public void setIsiKotor(Double isiKotor) {
        this.isiKotor = isiKotor;
    }

    @Column(length = 10, name = "ISI_BERSIH")
    public Double getIsiBersih() {
        return isiBersih;
    }

    public void setIsiBersih(Double isiBersih) {
        this.isiBersih = isiBersih;
    }

    @Column(length = 100, name = "MESIN_MERK_1")
    public String getMesinMerk1() {
        return mesinMerk1;
    }

    public void setMesinMerk1(String mesinMerk1) {
        this.mesinMerk1 = mesinMerk1;
    }

    @Column(length = 100, name = "MESIN_MERK_2")
    public String getMesinMerk2() {
        return mesinMerk2;
    }

    public void setMesinMerk2(String mesinMerk2) {
        this.mesinMerk2 = mesinMerk2;
    }

    @Column(length = 100, name = "MESIN_MERK_3")
    public String getMesinMerk3() {
        return mesinMerk3;
    }

    public void setMesinMerk3(String mesinMerk3) {
        this.mesinMerk3 = mesinMerk3;
    }

    @Column(length = 100, name = "MESIN_NOMOR_1")
    public String getMesinNomor1() {
        return mesinNomor1;
    }

    public void setMesinNomor1(String mesinNomor1) {
        this.mesinNomor1 = mesinNomor1;
    }

    @Column(length = 100, name = "MESIN_NOMOR_2")
    public String getMesinNomor2() {
        return mesinNomor2;
    }

    public void setMesinNomor2(String mesinNomor2) {
        this.mesinNomor2 = mesinNomor2;
    }

    @Column(length = 100, name = "MESIN_NOMOR_3")
    public String getMesinNomor3() {
        return mesinNomor3;
    }

    public void setMesinNomor3(String mesinNomor3) {
        this.mesinNomor3 = mesinNomor3;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_1")
    public String getMesinKapasitas1() {
        return mesinKapasitas1;
    }

    public void setMesinKapasitas1(String mesinKapasitas1) {
        this.mesinKapasitas1 = mesinKapasitas1;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_2")
    public String getMesinKapasitas2() {
        return mesinKapasitas2;
    }

    public void setMesinKapasitas2(String mesinKapasitas2) {
        this.mesinKapasitas2 = mesinKapasitas2;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_3")
    public String getMesinKapasitas3() {
        return mesinKapasitas3;
    }

    public void setMesinKapasitas3(String mesinKapasitas3) {
        this.mesinKapasitas3 = mesinKapasitas3;
    }

    @Column(length = 100, name = "MESIN_BACKUP_MERK_1")
    public String getMesinBackupMerk1() {
        return mesinBackupMerk1;
    }

    public void setMesinBackupMerk1(String mesinBackupMerk1) {
        this.mesinBackupMerk1 = mesinBackupMerk1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_MERK_2")
    public String getMesinBackupMerk2() {
        return mesinBackupMerk2;
    }

    public void setMesinBackupMerk2(String mesinBackupMerk2) {
        this.mesinBackupMerk2 = mesinBackupMerk2;
    }

    @Column(length = 100, name = "MESIN_BACKUP_NOMOR_1")
    public String getMesinBackupNomor1() {
        return mesinBackupNomor1;
    }

    public void setMesinBackupNomor1(String mesinBackupNomor1) {
        this.mesinBackupNomor1 = mesinBackupNomor1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_NOMOR_2")
    public String getMesinBackupNomor2() {
        return mesinBackupNomor2;
    }

    public void setMesinBackupNomor2(String mesinBackupNomor2) {
        this.mesinBackupNomor2 = mesinBackupNomor2;
    }

    @Column(length = 100, name = "MESIN_BACKUP_KAPASITAS_1")
    public String getMesinBackupKapasitas1() {
        return mesinBackupKapasitas1;
    }

    public void setMesinBackupKapasitas1(String mesinBackupKapasitas1) {
        this.mesinBackupKapasitas1 = mesinBackupKapasitas1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_KAPASITAS_2")
    public String getMesinBackupKapasitas2() {
        return mesinBackupKapasitas2;
    }

    public void setMesinBackupKapasitas2(String mesinBackupKapasitas2) {
        this.mesinBackupKapasitas2 = mesinBackupKapasitas2;
    }
}