package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_MESIN")
public class LpaMesin extends EntityBase<Long> {

    private Long id;
    private LpaUmum lpaUmum;

    private String rangkaian;
    private String tempat;
    private String kondisi;
    private String lingkungan;
    private String teknisi;
    private String cukuCadang;
    private String waktuPemakaian;

    private Double likuidasi;
    private Boolean manual;
    private Boolean beriNilaiDoc;
    private Boolean beriNilaiFisik;
    private BigDecimal nilaiDocPasar;
    private BigDecimal nilaiFisikPasar;
    private BigDecimal nilaiDocLikuidasi;
    private BigDecimal nilaiFisikLikuidasi;

    private Double likuidasiEks;
    private Boolean manualEks;
    private Boolean beriNilaiDocEks;
    private Boolean beriNilaiFisikEks;
    private BigDecimal nilaiDocPasarEks;
    private BigDecimal nilaiFisikPasarEks;
    private BigDecimal nilaiDocLikuidasiEks;
    private BigDecimal nilaiFisikLikuidasiEks;

    private List<LpaMesinLampiran> lampiran;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_MESIN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_MESIN_SEQ", sequenceName = "LPA_MESIN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = jakarta.persistence.CascadeType.ALL)
    @JoinColumn(name = "ID_LPA_UMUM")
    public LpaUmum getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(LpaUmum lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaMesin", cascade = {CascadeType.ALL})
    public List<LpaMesinLampiran> getLampiran() {
        return lampiran;
    }

    public void addLampiran(LpaMesinLampiran lampiran) {
        if (this.lampiran == null) {
            this.lampiran = new ArrayList<LpaMesinLampiran>();
        }
        lampiran.setLpaMesin(this);
        this.lampiran.add(lampiran);
    }

    public void setLampiran(List<LpaMesinLampiran> lampiran) {
        this.lampiran = lampiran;
    }

    @Column(name = "RANGKAIAN_MESIN", length = 50)
    public String getRangkaian() {
        return rangkaian;
    }

    public void setRangkaian(String rangkaian) {
        this.rangkaian = rangkaian;
    }

    @Column(name = "TEMPAT_OPERASIONAL", length = 50)
    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    @Column(name = "KONDISI_TEMPAT", length = 50)
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    @Column(name = "LINGKUGNAN_SEKITAR", length = 50)
    public String getLingkungan() {
        return lingkungan;
    }

    public void setLingkungan(String lingkungan) {
        this.lingkungan = lingkungan;
    }

    @Column(name = "TEKNISI", length = 50)
    public String getTeknisi() {
        return teknisi;
    }

    public void setTeknisi(String teknisi) {
        this.teknisi = teknisi;
    }

    @Column(name = "PENYEDIA_SUKU_CADANG", length = 50)
    public String getCukuCadang() {
        return cukuCadang;
    }

    public void setCukuCadang(String cukuCadang) {
        this.cukuCadang = cukuCadang;
    }

    @Column(name = "WAKTU_PEMAKAIAN", length = 50)
    public String getWaktuPemakaian() {
        return waktuPemakaian;
    }

    public void setWaktuPemakaian(String waktuPemakaian) {
        this.waktuPemakaian = waktuPemakaian;
    }

    @Column(name = "PROSENTASE_LIKUIDASI")
    public Double getLikuidasi() {
        return likuidasi;
    }

    public void setLikuidasi(Double likuidasi) {
        this.likuidasi = likuidasi;
    }

    @Column(name = "HITUNG_MANUAL")
    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    @Column(name = "BERI_NILAI_DOC")
    public Boolean getBeriNilaiDoc() {
        return beriNilaiDoc;
    }

    public void setBeriNilaiDoc(Boolean beriNilaiDoc) {
        this.beriNilaiDoc = beriNilaiDoc;
    }

    @Column(name = "BERI_NILAI_FISIK")
    public Boolean getBeriNilaiFisik() {
        return beriNilaiFisik;
    }

    public void setBeriNilaiFisik(Boolean beriNilaiFisik) {
        this.beriNilaiFisik = beriNilaiFisik;
    }

    @Column(name = "NILAI_DOC_PASAR")
    public BigDecimal getNilaiDocPasar() {
        return nilaiDocPasar;
    }

    public void setNilaiDocPasar(BigDecimal nilaiDocPasar) {
        this.nilaiDocPasar = nilaiDocPasar;
    }

    @Column(name = "NILAI_FISIK_PASAR")
    public BigDecimal getNilaiFisikPasar() {
        return nilaiFisikPasar;
    }

    public void setNilaiFisikPasar(BigDecimal nilaiFisikPasar) {
        this.nilaiFisikPasar = nilaiFisikPasar;
    }

    @Column(name = "NILAI_DOC_LIKUIDASI")
    public BigDecimal getNilaiDocLikuidasi() {
        return nilaiDocLikuidasi;
    }

    public void setNilaiDocLikuidasi(BigDecimal nilaiDocLikuidasi) {
        this.nilaiDocLikuidasi = nilaiDocLikuidasi;
    }

    @Column(name = "NILAI_FISIK_LIKUIDASI")
    public BigDecimal getNilaiFisikLikuidasi() {
        return nilaiFisikLikuidasi;
    }

    public void setNilaiFisikLikuidasi(BigDecimal nilaiFisikLikuidasi) {
        this.nilaiFisikLikuidasi = nilaiFisikLikuidasi;
    }

    @Column(name = "PROSENTASE_LIKUIDASI_EKS")
    public Double getLikuidasiEks() {
        return likuidasiEks;
    }

    public void setLikuidasiEks(Double likuidasiEks) {
        this.likuidasiEks = likuidasiEks;
    }

    @Column(name = "HITUNG_MANUAL_EKS")
    public Boolean getManualEks() {
        return manualEks;
    }

    public void setManualEks(Boolean manualEks) {
        this.manualEks = manualEks;
    }

    @Column(name = "BERI_NILAI_DOC_EKS")
    public Boolean getBeriNilaiDocEks() {
        return beriNilaiDocEks;
    }

    public void setBeriNilaiDocEks(Boolean beriNilaiDocEks) {
        this.beriNilaiDocEks = beriNilaiDocEks;
    }

    @Column(name = "BERI_NILAI_FISIK_EKS")
    public Boolean getBeriNilaiFisikEks() {
        return beriNilaiFisikEks;
    }

    public void setBeriNilaiFisikEks(Boolean beriNilaiFisikEks) {
        this.beriNilaiFisikEks = beriNilaiFisikEks;
    }

    @Column(name = "NILAI_DOC_PASAR_EKS")
    public BigDecimal getNilaiDocPasarEks() {
        return nilaiDocPasarEks;
    }

    public void setNilaiDocPasarEks(BigDecimal nilaiDocPasarEks) {
        this.nilaiDocPasarEks = nilaiDocPasarEks;
    }

    @Column(name = "NILAI_FISIK_PASAR_EKS")
    public BigDecimal getNilaiFisikPasarEks() {
        return nilaiFisikPasarEks;
    }

    public void setNilaiFisikPasarEks(BigDecimal nilaiFisikPasarEks) {
        this.nilaiFisikPasarEks = nilaiFisikPasarEks;
    }

    @Column(name = "NILAI_DOC_LIKUIDASI_EKS")
    public BigDecimal getNilaiDocLikuidasiEks() {
        return nilaiDocLikuidasiEks;
    }

    public void setNilaiDocLikuidasiEks(BigDecimal nilaiDocLikuidasiEks) {
        this.nilaiDocLikuidasiEks = nilaiDocLikuidasiEks;
    }

    @Column(name = "NILAI_FISIK_LIKUIDASI_EKS")
    public BigDecimal getNilaiFisikLikuidasiEks() {
        return nilaiFisikLikuidasiEks;
    }

    public void setNilaiFisikLikuidasiEks(BigDecimal nilaiFisikLikuidasiEks) {
        this.nilaiFisikLikuidasiEks = nilaiFisikLikuidasiEks;
    }
}