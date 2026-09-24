package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityAuditrailBase;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_RV")
public class SurveyRv extends EntityAuditrailBase<Long> {

    private Long id;
    private DataDetail detail;
    private String alamat;
    private String vendor;
    private String umur;
    private String namaPasangan;
    private Boolean lokasiDitemukan;
    private Boolean sudahPindah;
    private String jam;

    // informasi 1 (S1)
    private Boolean s1Ditemukan;
    private String s1Nama;
    private String s1Kelamin;
    private String s1Hubungan;
    private Boolean s1Kooperatif;

    // informasi 2 (S2)
    private Boolean s2Ditemukan;
    private String s2Nama;
    private String s2Kelamin;
    private Boolean s2Kenal;
    private String s2Hubungan;
    private Boolean s2Kooperatif;

    // informasi 3 (S3)
    private Boolean s3Ditemukan;
    private String s3Nama;
    private String s3Kelamin;
    private Boolean s3Kenal;
    private String s3Hubungan;
    private Boolean s3Kooperatif;// informasi rumah
    private String surveyorDiterimaDi;
    private Boolean kondisiRumah;
    private String penghuni;
    private String lingkunganSekitar;
    private String luasBangunan;
    private String luasTanah;
    private String jenisBangunan;
    private String telepon;
    private Boolean garasi;
    private Boolean carport;
    private String lamaPenempatan;
    private String statusKepemilikan;

    // informasi tambahan
    private Boolean dikenalNamaSama;
    private String namaPanggilan;
    private String didatangiDebtCollector;
    private List<String> fotoPada;
    private String infoS1;
    private String infoS2;
    private String infoS3;
    private String note;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_RV_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_RV_SEQ", sequenceName = "SURVEY_RV_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "ALAMAT", length = 100)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Column(name = "NAMA_VENDOR", length = 100)
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Column(name = "UMUR", length = 50)
    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    @Column(name = "NAMA_PASANGAN", length = 100)
    public String getNamaPasangan() {
        return namaPasangan;
    }

    public void setNamaPasangan(String namaPasangan) {
        this.namaPasangan = namaPasangan;
    }

    @Column(name = "LOKASI_DITEMUKAN")
    public Boolean getLokasiDitemukan() {
        return lokasiDitemukan;
    }

    public void setLokasiDitemukan(Boolean lokasiDitemukan) {
        this.lokasiDitemukan = lokasiDitemukan;
    }

    @Column(name = "SUDAH_PINDAH")
    public Boolean getSudahPindah() {
        return sudahPindah;
    }

    public void setSudahPindah(Boolean sudahPindah) {
        this.sudahPindah = sudahPindah;
    }

    @Column(name = "JAM", length = 30)
    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Column(name = "S1_DITEMUKAN")
    public Boolean getS1Ditemukan() {
        return s1Ditemukan;
    }

    public void setS1Ditemukan(Boolean s1Ditemukan) {
        this.s1Ditemukan = s1Ditemukan;
    }

    @Column(name = "S1_NAMA", length = 100)
    public String getS1Nama() {
        return s1Nama;
    }

    public void setS1Nama(String s1Nama) {
        this.s1Nama = s1Nama;
    }

    @Column(name = "S1_KELAMIN", length = 1)
    public String getS1Kelamin() {
        return s1Kelamin;
    }

    public void setS1Kelamin(String s1Kelamin) {
        this.s1Kelamin = s1Kelamin;
    }

    @Column(name = "S1_HUBUNGAN", length = 50)
    public String getS1Hubungan() {
        return s1Hubungan;
    }

    public void setS1Hubungan(String s1Hubungan) {
        this.s1Hubungan = s1Hubungan;
    }

    @Column(name = "S1_KOOPERATIF")
    public Boolean getS1Kooperatif() {
        return s1Kooperatif;
    }

    public void setS1Kooperatif(Boolean s1Kooperatif) {
        this.s1Kooperatif = s1Kooperatif;
    }

    @Column(name = "S2_DITEMUKAN")
    public Boolean getS2Ditemukan() {
        return s2Ditemukan;
    }

    public void setS2Ditemukan(Boolean s2Ditemukan) {
        this.s2Ditemukan = s2Ditemukan;
    }

    @Column(name = "S2_NAMA", length = 100)
    public String getS2Nama() {
        return s2Nama;
    }

    public void setS2Nama(String s2Nama) {
        this.s2Nama = s2Nama;
    }

    @Column(name = "S2_KELAMIN", length = 1)
    public String getS2Kelamin() {
        return s2Kelamin;
    }

    public void setS2Kelamin(String s2Kelamin) {
        this.s2Kelamin = s2Kelamin;
    }

    @Column(name = "S2_KENAL")
    public Boolean getS2Kenal() {
        return s2Kenal;
    }

    public void setS2Kenal(Boolean s2Kenal) {
        this.s2Kenal = s2Kenal;
    }

    @Column(name = "S2_HUBUNGAN", length = 50)
    public String getS2Hubungan() {
        return s2Hubungan;
    }

    public void setS2Hubungan(String s2Hubungan) {
        this.s2Hubungan = s2Hubungan;
    }

    @Column(name = "S2_KOOPERATIF")
    public Boolean getS2Kooperatif() {
        return s2Kooperatif;
    }

    public void setS2Kooperatif(Boolean s2Kooperatif) {
        this.s2Kooperatif = s2Kooperatif;
    }

    @Column(name = "S3_DITEMUKAN")
    public Boolean getS3Ditemukan() {
        return s3Ditemukan;
    }

    public void setS3Ditemukan(Boolean s3Ditemukan) {
        this.s3Ditemukan = s3Ditemukan;
    }

    @Column(name = "S3_NAMA", length = 100)
    public String getS3Nama() {
        return s3Nama;
    }

    public void setS3Nama(String s3Nama) {
        this.s3Nama = s3Nama;
    }

    @Column(name = "S3_KELAMIN", length = 1)
    public String getS3Kelamin() {
        return s3Kelamin;
    }

    public void setS3Kelamin(String s3Kelamin) {
        this.s3Kelamin = s3Kelamin;
    }

    @Column(name = "S3_KENAL")
    public Boolean getS3Kenal() {
        return s3Kenal;
    }

    public void setS3Kenal(Boolean s3Kenal) {
        this.s3Kenal = s3Kenal;
    }

    @Column(name = "S3_HUBUNGAN", length = 50)
    public String getS3Hubungan() {
        return s3Hubungan;
    }

    public void setS3Hubungan(String s3Hubungan) {
        this.s3Hubungan = s3Hubungan;
    }

    @Column(name = "S3_KOOPERATIF")
    public Boolean getS3Kooperatif() {
        return s3Kooperatif;
    }

    public void setS3Kooperatif(Boolean s3Kooperatif) {
        this.s3Kooperatif = s3Kooperatif;
    }

    @Column(name = "DITERIMA_DI", length = 50)
    public String getSurveyorDiterimaDi() {
        return surveyorDiterimaDi;
    }

    public void setSurveyorDiterimaDi(String surveyorDiterimaDi) {
        this.surveyorDiterimaDi = surveyorDiterimaDi;
    }

    @Column(name = "KONDISI_RUMAH", length = 50)
    public Boolean getKondisiRumah() {
        return kondisiRumah;
    }

    public void setKondisiRumah(Boolean kondisiRumah) {
        this.kondisiRumah = kondisiRumah;
    }

    @Column(name = "PENGHUNI", length = 50)
    public String getPenghuni() {
        return penghuni;
    }

    public void setPenghuni(String penghuni) {
        this.penghuni = penghuni;
    }

    @Column(name = "LINGKUNGAN_SEKITAR", length = 50)
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column(name = "LUAS_BANGUNAN", length = 50)
    public String getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(String luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    @Column(name = "LUAS_TANAH", length = 50)
    public String getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(String luasTanah) {
        this.luasTanah = luasTanah;
    }

    @Column(name = "JENIS_BANGUNAN", length = 50)
    public String getJenisBangunan() {
        return jenisBangunan;
    }

    public void setJenisBangunan(String jenisBangunan) {
        this.jenisBangunan = jenisBangunan;
    }

    @Column(name = "TELEPON", length = 50)
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Column(name = "ADA_GARASI")
    public Boolean getGarasi() {
        return garasi;
    }

    public void setGarasi(Boolean garasi) {
        this.garasi = garasi;
    }

    @Column(name = "ADA_CAR_PORT")
    public Boolean getCarport() {
        return carport;
    }

    public void setCarport(Boolean carport) {
        this.carport = carport;
    }

    @Column(name = "LAMA__PENEMPATAN", length = 50)
    public String getLamaPenempatan() {
        return lamaPenempatan;
    }

    public void setLamaPenempatan(String lamaPenempatan) {
        this.lamaPenempatan = lamaPenempatan;
    }

    @Column(name = "STATUS_KEPEMILIKAN", length = 50)
    public String getStatusKepemilikan() {
        return statusKepemilikan;
    }

    public void setStatusKepemilikan(String statusKepemilikan) {
        this.statusKepemilikan = statusKepemilikan;
    }

    @Column(name = "DIKENAL_NAMA_SAMA")
    public Boolean getDikenalNamaSama() {
        return dikenalNamaSama;
    }

    public void setDikenalNamaSama(Boolean dikenalNamaSama) {
        this.dikenalNamaSama = dikenalNamaSama;
    }

    @Column(name = "NAMA_PANGGILAN", length = 50)
    public String getNamaPanggilan() {
        return namaPanggilan;
    }

    public void setNamaPanggilan(String namaPanggilan) {
        this.namaPanggilan = namaPanggilan;
    }

    @Column(name = "DIDATANGI_DEBT_COLLECTOR", length = 50)
    public String getDidatangiDebtCollector() {
        return didatangiDebtCollector;
    }

    public void setDidatangiDebtCollector(String didatangiDebtCollector) {
        this.didatangiDebtCollector = didatangiDebtCollector;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    public List<String> getFotoPada() {
        return fotoPada;
    }

    public void setFotoPada(List<String> fotoPada) {
        this.fotoPada = fotoPada;
    }

    public void addFotoPada(String fotoPada){
        if(this.fotoPada == null){
            this.fotoPada = new ArrayList<String>();
        }
        this.fotoPada.add(fotoPada);
    }

    @Column(name = "INFO_S1", length = 1000)
    public String getInfoS1() {
        return infoS1;
    }

    public void setInfoS1(String infoS1) {
        this.infoS1 = infoS1;
    }

    @Column(name = "INFO_S2", length = 1000)
    public String getInfoS2() {
        return infoS2;
    }

    public void setInfoS2(String infoS2) {
        this.infoS2 = infoS2;
    }

    @Column(name = "INFO_S3", length = 1000)
    public String getInfoS3() {
        return infoS3;
    }

    public void setInfoS3(String infoS3) {
        this.infoS3 = infoS3;
    }

    @Column(name = "NOTE", length = 1000)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}