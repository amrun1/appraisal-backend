package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityAuditrailBase;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_BV")
public class SurveyBv extends EntityAuditrailBase<Long> {

    private Long id;
    private DataDetail detail;

    // data umum
    private String vendor;
    private Boolean lokasiDitemukan;
    private Boolean sudahPindah;
    private String jam;
    private Boolean papanNama;
    private String kegiatanUsaha;

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
    private Boolean s3Kooperatif;

    // tempat usaha
    private String surveyorDiterimaDi;
    private String jumlahKaryawan;
    private String omzetPenjualan;
    private BigDecimal detailOmzet;
    private Boolean kondisiUsaha;
    private String jenisUsaha;
    private String bidangUsaha;
    private String lamaPenempatan;
    private String lingkunganSekitar;
    private String jalanTempatUsaha;
    private Boolean masukMobil;
    private Boolean bertingkat;
    private String luasBangunan;
    private String luasTanah;
    private String jenisBangunan;
    private List<String> fasilitas;
    private Integer jumlahMotor;
    private Integer jumlahMobil;
    private Integer jumlahTruk;
    private String statusLokasi;
    private String statusUsaha;

    // informasi tambahan
    private List<String> fotoPada;
    private String infoS1;
    private String infoS2;
    private String infoS3;
    private String note;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_BV_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_BV_SEQ", sequenceName = "SURVEY_BV_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "LOKASI_DITEMUKAN")
    public Boolean getLokasiDitemukan() {
        return lokasiDitemukan;
    }

    public void setLokasiDitemukan(Boolean lokasiDitemukan) {
        this.lokasiDitemukan = lokasiDitemukan;
    }

    @Column(name = "ADA_PAPAN_NAMA")
    public Boolean getPapanNama() {
        return papanNama;
    }

    public void setPapanNama(Boolean papanNama) {
        this.papanNama = papanNama;
    }

    @Column(name = "KEGIATAN_USAHA", length = 50)
    public String getKegiatanUsaha() {
        return kegiatanUsaha;
    }

    public void setKegiatanUsaha(String kegiatanUsaha) {
        this.kegiatanUsaha = kegiatanUsaha;
    }

    @Column(name = "SUDAH_PINDAH")
    public Boolean getSudahPindah() {
        return sudahPindah;
    }

    public void setSudahPindah(Boolean sudahPindah) {
        this.sudahPindah = sudahPindah;
    }

    @Column(name = "S1_DITEMUKAN")
    public Boolean getS1Ditemukan() {
        return s1Ditemukan;
    }

    public void setS1Ditemukan(Boolean s1Ditemukan) {
        this.s1Ditemukan = s1Ditemukan;
    }

    @Column(name = "S1_NAMA", length = 50)
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

    @Column(name = "S2_NAMA", length = 50)
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

    @Column(name = "S3_NAMA", length = 50)
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

    @Column(name = "JUMLAH_KARYAWAN", length = 50)
    public String getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public void setJumlahKaryawan(String jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    @Column(name = "OMZET_PENJUALAN", length = 50)
    public String getOmzetPenjualan() {
        return omzetPenjualan;
    }

    public void setOmzetPenjualan(String omzetPenjualan) {
        this.omzetPenjualan = omzetPenjualan;
    }

    @Column(name = "DETAIL_OMZET")
    public BigDecimal getDetailOmzet() {
        return detailOmzet;
    }

    public void setDetailOmzet(BigDecimal detailOmzet) {
        this.detailOmzet = detailOmzet;
    }

    @Column(name = "KONDISI_USAHA", length = 50)
    public Boolean getKondisiUsaha() {
        return kondisiUsaha;
    }

    public void setKondisiUsaha(Boolean kondisiUsaha) {
        this.kondisiUsaha = kondisiUsaha;
    }

    @Column(name = "JENIS_USAHA", length = 50)
    public String getJenisUsaha() {
        return jenisUsaha;
    }

    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    @Column(name = "BIDANG_USAHA", length = 50)
    public String getBidangUsaha() {
        return bidangUsaha;
    }

    public void setBidangUsaha(String bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
    }

    @Column(name = "LAMA_PENEMPATAN", length = 50)
    public String getLamaPenempatan() {
        return lamaPenempatan;
    }

    public void setLamaPenempatan(String lamaPenempatan) {
        this.lamaPenempatan = lamaPenempatan;
    }

    @Column(name = "LINGKUNGAN_SEKITAR", length = 50)
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column(name = "JALAN_TEMPAT_USAHA", length = 50)
    public String getJalanTempatUsaha() {
        return jalanTempatUsaha;
    }

    public void setJalanTempatUsaha(String jalanTempatUsaha) {
        this.jalanTempatUsaha = jalanTempatUsaha;
    }

    @Column(name = "MASUK_MOBIL")
    public Boolean getMasukMobil() {
        return masukMobil;
    }

    public void setMasukMobil(Boolean masukMobil) {
        this.masukMobil = masukMobil;
    }

    @Column(name = "BERTINGKAT")
    public Boolean getBertingkat() {
        return bertingkat;
    }

    public void setBertingkat(Boolean bertingkat) {
        this.bertingkat = bertingkat;
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

    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<String> getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(List<String> fasilitas) {
        this.fasilitas = fasilitas;
    }

    public void addFasilitas(String fasilitas){
        if(this.fasilitas == null){
            this.fasilitas = new ArrayList<String>();
        }
        this.fasilitas.add(fasilitas);
    }

    @Column(name = "JUMLAH_MOTOR")
    public Integer getJumlahMotor() {
        return jumlahMotor;
    }

    public void setJumlahMotor(Integer jumlahMotor) {
        this.jumlahMotor = jumlahMotor;
    }

    @Column(name = "JUMLAH_MOBIL")
    public Integer getJumlahMobil() {
        return jumlahMobil;
    }

    public void setJumlahMobil(Integer jumlahMobil) {
        this.jumlahMobil = jumlahMobil;
    }

    @Column(name = "JUMLAH_TRUK")
    public Integer getJumlahTruk() {
        return jumlahTruk;
    }

    public void setJumlahTruk(Integer jumlahTruk) {
        this.jumlahTruk = jumlahTruk;
    }

    @Column(name = "STATUS_LOKASI", length = 50)
    public String getStatusLokasi() {
        return statusLokasi;
    }

    public void setStatusLokasi(String statusLokasi) {
        this.statusLokasi = statusLokasi;
    }

    @Column(name = "STATUS_USAHA", length = 50)
    public String getStatusUsaha() {
        return statusUsaha;
    }

    public void setStatusUsaha(String statusUsaha) {
        this.statusUsaha = statusUsaha;
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

    @Column(name = "NAMA_VENDOR", length = 50)
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Column(name = "JAM", length = 50)
    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}