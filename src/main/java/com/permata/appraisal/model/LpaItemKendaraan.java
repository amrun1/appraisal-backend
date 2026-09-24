package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_KENDARAAN_ITEM")
public class LpaItemKendaraan extends EntityBase<Long> {

    private Long id;
    private LpaKendaraan lpaKendaraan;
    private String jenisKendaraan;
    private String merkKendaraan;
    private String modelType;
    private Integer isiSilinder;
    private Integer tahunPembuatan;
    private String asalPembuatan;
    private String warna;
    private String noPolisi;
    private String noRangka;
    private String noMesin;
    private String bahanBakar;

    // dokumen kendaraan
    private String pajakStnk;
    private Date jatuhTempoStnk;
    private Date jatuhTempoPajak;
    private String noFaktur;
    private String noBpkb;
    private Date tanggalBpkb;
    private String atasNamaBpkb;
    private String alamatBpkb;

    // fungsi dan kondisi kendaraan
    private String penggunaan;
    private String pemakaian;
    private Double kilometer;
    private String body;
    private String bumper;
    private String cat;
    private String interior;
    private String eksterior;
    private String mesin;
    private String ban;
    private String catatan;

    // penilaian agunan
    private BigDecimal nilaiPasar;
    private BigDecimal nilaiDokumen;

    public LpaItemKendaraan() {
        super();
    }

    public LpaItemKendaraan(LpaKendaraan lpaKendaraan) {
        this.lpaKendaraan = lpaKendaraan;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_KENDARAAN_ITEM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_KENDARAAN_ITEM_SEQ", sequenceName = "LPA_KENDARAAN_ITEM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_KENDARAAN")
    @Fetch(FetchMode.JOIN)
    public LpaKendaraan getLpaKendaraan() {
        return lpaKendaraan;
    }

    public void setLpaKendaraan(LpaKendaraan lpaKendaraan) {
        this.lpaKendaraan = lpaKendaraan;
    }

    @Column(name = "JENIS_KENDARAAN", length = 50)
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @Column(name = "MERK", length = 50)
    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    @Column(name = "MODEL", length = 50)
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Column(name = "SILINDER", length = 50)
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

    @Column(name = "ASAL_PEMBUATAN", length = 50)
    public String getAsalPembuatan() {
        return asalPembuatan;
    }

    public void setAsalPembuatan(String asalPembuatan) {
        this.asalPembuatan = asalPembuatan;
    }

    @Column(name = "WARNA", length = 50)
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Column(name = "NO_POLISI", length = 50)
    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    @Column(name = "NO_RANGKA", length = 50)
    public String getNoRangka() {
        return noRangka;
    }

    public void setNoRangka(String noRangka) {
        this.noRangka = noRangka;
    }

    @Column(name = "NO_MESIN", length = 50)
    public String getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    @Column(name = "BAHAN_BAKAR", length = 50)
    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Column(name = "NO_BPKB", length = 50)
    public String getNoBpkb() {
        return noBpkb;
    }

    public void setNoBpkb(String noBpkb) {
        this.noBpkb = noBpkb;
    }

    @Column(name = "PAJAK_STNK", length = 50)
    public String getPajakStnk() {
        return pajakStnk;
    }

    public void setPajakStnk(String pajakStnk) {
        this.pajakStnk = pajakStnk;
    }

    @Column(name = "PENGGUNAAN", length = 50)
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

    @Column(name = "BODY", length = 50)
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Column(name = "INTERIOR", length = 50)
    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Column(name = "MESIN", length = 50)
    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    @Column(name = "CATATAN", length = 200)
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @Column(name = "NILAI_PASAR")
    public BigDecimal getNilaiPasar() {
        return nilaiPasar;
    }

    public void setNilaiPasar(BigDecimal nilaiPasar) {
        this.nilaiPasar = nilaiPasar;
    }

    @Column(name = "NILAI_DOKUMEN")
    public BigDecimal getNilaiDokumen() {
        return nilaiDokumen;
    }

    public void setNilaiDokumen(BigDecimal nilaiDokumen) {
        this.nilaiDokumen = nilaiDokumen;
    }

    @Column(name = "JATUH_TEMPO_STNK")
    public Date getJatuhTempoStnk() {
        return jatuhTempoStnk;
    }

    public void setJatuhTempoStnk(Date jatuhTempoStnk) {
        this.jatuhTempoStnk = jatuhTempoStnk;
    }

    @Column(name = "JATUH_TEMPO_PAJAK")
    public Date getJatuhTempoPajak() {
        return jatuhTempoPajak;
    }

    public void setJatuhTempoPajak(Date jatuhTempoPajak) {
        this.jatuhTempoPajak = jatuhTempoPajak;
    }

    @Column(name = "NO_FAKTUR", length = 50)
    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    @Column(name = "TANGGAL_TERBIT_BPKB")
    public Date getTanggalBpkb() {
        return tanggalBpkb;
    }

    public void setTanggalBpkb(Date tanggalBpkb) {
        this.tanggalBpkb = tanggalBpkb;
    }

    @Column(name = "ATAS_NAMA_BPKN", length = 100)
    public String getAtasNamaBpkb() {
        return atasNamaBpkb;
    }

    public void setAtasNamaBpkb(String atasNamaBpkb) {
        this.atasNamaBpkb = atasNamaBpkb;
    }

    @Column(name = "ALAMAT_BPKB", length = 100)
    public String getAlamatBpkb() {
        return alamatBpkb;
    }

    public void setAlamatBpkb(String alamatBpkb) {
        this.alamatBpkb = alamatBpkb;
    }

    @Column(name = "PEMAKAIAN", length = 50)
    public String getPemakaian() {
        return pemakaian;
    }

    public void setPemakaian(String pemakaian) {
        this.pemakaian = pemakaian;
    }

    @Column(name = "BUMPER", length = 50)
    public String getBumper() {
        return bumper;
    }

    public void setBumper(String bumper) {
        this.bumper = bumper;
    }

    @Column(name = "CAT", length = 50)
    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Column(name = "EKSTERIOR", length = 50)
    public String getEksterior() {
        return eksterior;
    }

    public void setEksterior(String eksterior) {
        this.eksterior = eksterior;
    }

    @Column(name = "BAN", length = 50)
    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }
}