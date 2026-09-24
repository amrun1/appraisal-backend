package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.CascadeType;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_STOCK")
public class LpaStock extends EntityBase<Long> {

    private Long id;
    private LpaUmum lpaUmum;
    // data agunan
    private String jenisPersedian;
    private String asalPembuatan;
    private String penempatanBarang;
    private String kemasanBarang;
    private String kondisiBarang;
    private String metodePemeriksaan;
    private String jumlahPersedian;
    // tempat penyimpanan
    private String jenisPenyimpanan;
    private String kondisiPenyimpanan;
    private String lingkunganSekitar;
    private String peralatanGudang;
    // data dokumen
    private String jenisDokumen;
    private String nomorDokumen;
    private Date tanggalDokumen;
    // penilaian atas agunan Internal
    private BigDecimal nilaiDokumen;
    private Boolean berinilaiDokumen;
    private BigDecimal nilaiFisik;
    private Boolean berinilaiFisik;
    private Double persentase;
    private BigDecimal likuidasiDokumen;
    private BigDecimal likuidasiFisik;
    // penilaian atas agunan Eksternal
    private BigDecimal nilaiDokumenEks;
    private Boolean berinilaiDokumenEks;
    private BigDecimal nilaiFisikEks;
    private Boolean berinilaiFisikEks;
    private Double persentaseEks;
    private BigDecimal likuidasiDokumenEks;
    private BigDecimal likuidasiFisikEks;


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_STOCK_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_STOCK_SEQ", sequenceName = "LPA_STOCK_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_LPA_UMUM")
    public LpaUmum getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(LpaUmum lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    @Column (name = "JENIS_PERSEDIAAN", length = 50)
    public String getJenisPersedian() {
        return jenisPersedian;
    }

    public void setJenisPersedian(String jenisPersedian) {
        this.jenisPersedian = jenisPersedian;
    }

    @Column (name = "ASAL_PEMBUATAN", length = 50)
    public String getAsalPembuatan() {
        return asalPembuatan;
    }

    public void setAsalPembuatan(String asalPembuatan) {
        this.asalPembuatan = asalPembuatan;
    }

    @Column (name = "PENEMPATAN_BARANG", length = 50)
    public String getPenempatanBarang() {
        return penempatanBarang;
    }

    public void setPenempatanBarang(String penempatanBarang) {
        this.penempatanBarang = penempatanBarang;
    }

    @Column (name = "KEMASAN_BARANG", length = 50)
    public String getKemasanBarang() {
        return kemasanBarang;
    }

    public void setKemasanBarang(String kemasanBarang) {
        this.kemasanBarang = kemasanBarang;
    }

    @Column (name = "KONDISI_BARANG", length = 50)
    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }

    @Column (name = "METODE_PEMERIKSAAN", length = 50)
    public String getMetodePemeriksaan() {
        return metodePemeriksaan;
    }

    public void setMetodePemeriksaan(String metodePemeriksaan) {
        this.metodePemeriksaan = metodePemeriksaan;
    }

    @Column (name = "JUMLAH_PERSEDIAAN", length = 50)
    public String getJumlahPersedian() {
        return jumlahPersedian;
    }

    public void setJumlahPersedian(String jumlahPersedian) {
        this.jumlahPersedian = jumlahPersedian;
    }

    @Column (name = "JENIS_PENYIMPANAN", length = 50)
    public String getJenisPenyimpanan() {
        return jenisPenyimpanan;
    }

    public void setJenisPenyimpanan(String jenisPenyimpanan) {
        this.jenisPenyimpanan = jenisPenyimpanan;
    }

    @Column (name = "KONDISI_PENYIMPANAN", length = 50)
    public String getKondisiPenyimpanan() {
        return kondisiPenyimpanan;
    }

    public void setKondisiPenyimpanan(String kondisiPenyimpanan) {
        this.kondisiPenyimpanan = kondisiPenyimpanan;
    }

    @Column (name = "LINGKUNGAN_SEKITAR", length = 50)
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column (name = "PERALATAN_GUDANG", length = 50)
    public String getPeralatanGudang() {
        return peralatanGudang;
    }

    public void setPeralatanGudang(String peralatanGudang) {
        this.peralatanGudang = peralatanGudang;
    }

    @Column (name = "JENIS_DOKUMEN", length = 50)
    public String getJenisDokumen() {
        return jenisDokumen;
    }

    public void setJenisDokumen(String jenisDokumen) {
        this.jenisDokumen = jenisDokumen;
    }

    @Column (name = "NOMOR_DOKUMEN", length = 50)
    public String getNomorDokumen() {
        return nomorDokumen;
    }

    public void setNomorDokumen(String nomorDokumen) {
        this.nomorDokumen = nomorDokumen;
    }

    @Column (name = "TANGGAL_DOKUMEN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalDokumen() {
        return tanggalDokumen;
    }

    public void setTanggalDokumen(Date tanggalDokumen) {
        this.tanggalDokumen = tanggalDokumen;
    }

    @Column (name = "NILAI_DOKUMEN")
    public BigDecimal getNilaiDokumen() {
        return nilaiDokumen;
    }

    public void setNilaiDokumen(BigDecimal nilaiDokumen) {
        this.nilaiDokumen = nilaiDokumen;
    }

    @Column (name = "BERI_NILAI_DOKUMEN")
    public Boolean getBerinilaiDokumen() {
        return berinilaiDokumen;
    }

    public void setBerinilaiDokumen(Boolean berinilaiDokumen) {
        this.berinilaiDokumen = berinilaiDokumen;
    }

    @Column (name = "NILAI_FISIK")
    public BigDecimal getNilaiFisik() {
        return nilaiFisik;
    }

    public void setNilaiFisik(BigDecimal nilaiFisik) {
        this.nilaiFisik = nilaiFisik;
    }

    @Column (name = "BERI_NILAI_FISIK")
    public Boolean getBerinilaiFisik() {
        return berinilaiFisik;
    }

    public void setBerinilaiFisik(Boolean berinilaiFisik) {
        this.berinilaiFisik = berinilaiFisik;
    }

    @Column (name = "PERSENTASE")
    public Double getPersentase() {
        return persentase;
    }

    public void setPersentase(Double persentase) {
        this.persentase = persentase;
    }

    @Column (name = "LIKUIDASI_DOKUMEN")
    public BigDecimal getLikuidasiDokumen() {
        return likuidasiDokumen;
    }

    public void setLikuidasiDokumen(BigDecimal likuidasiDokumen) {
        this.likuidasiDokumen = likuidasiDokumen;
    }

    @Column (name = "LIKUIDASI_FISIK")
    public BigDecimal getLikuidasiFisik() {
        return likuidasiFisik;
    }

    public void setLikuidasiFisik(BigDecimal likuidasiFisik) {
        this.likuidasiFisik = likuidasiFisik;
    }

    @Column (name = "NILAI_DOKUMEN_EKS")
    public BigDecimal getNilaiDokumenEks() {
        return nilaiDokumenEks;
    }

    public void setNilaiDokumenEks(BigDecimal nilaiDokumenEks) {
        this.nilaiDokumenEks = nilaiDokumenEks;
    }

    @Column (name = "BERI_NILAI_DOKUMEN_EKS")
    public Boolean getBerinilaiDokumenEks() {
        return berinilaiDokumenEks;
    }

    public void setBerinilaiDokumenEks(Boolean berinilaiDokumenEks) {
        this.berinilaiDokumenEks = berinilaiDokumenEks;
    }

    @Column (name = "NILAI_FISIK_EKS")
    public BigDecimal getNilaiFisikEks() {
        return nilaiFisikEks;
    }

    public void setNilaiFisikEks(BigDecimal nilaiFisikEks) {
        this.nilaiFisikEks = nilaiFisikEks;
    }

    @Column (name = "BERI_NILAI_FISIK_EKS")
    public Boolean getBerinilaiFisikEks() {
        return berinilaiFisikEks;
    }

    public void setBerinilaiFisikEks(Boolean berinilaiFisikEks) {
        this.berinilaiFisikEks = berinilaiFisikEks;
    }

    @Column (name = "PERSENTASE_EKS")
    public Double getPersentaseEks() {
        return persentaseEks;
    }

    public void setPersentaseEks(Double persentaseEks) {
        this.persentaseEks = persentaseEks;
    }

    @Column (name = "LIKUIDASI_DOKUMEN_EKS")
    public BigDecimal getLikuidasiDokumenEks() {
        return likuidasiDokumenEks;
    }

    public void setLikuidasiDokumenEks(BigDecimal likuidasiDokumenEks) {
        this.likuidasiDokumenEks = likuidasiDokumenEks;
    }

    @Column (name = "LIKUIDASI_FISIK_EKS")
    public BigDecimal getLikuidasiFisikEks() {
        return likuidasiFisikEks;
    }

    public void setLikuidasiFisikEks(BigDecimal likuidasiFisikEks) {
        this.likuidasiFisikEks = likuidasiFisikEks;
    }
}