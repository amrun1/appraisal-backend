package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_MESIN_LAMPIRAN")
public class LpaMesinLampiran extends EntityBase<Long> {

    private Long id;
    private LpaMesin lpaMesin;

    private String jenis;
    private String merk;
    private String typeModel;
    private String noSeri;
    private String asal;
    private String tahun;
    private String kegunaan;
    private String kondisi;
    private String rangkaian;

    private String noInvoice;
    private Date tanggal;
    private String pemilik;


    private BigDecimal nilaiDoc;
    private BigDecimal nilaiFisik;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_MESIN_LAMPIRAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_MESIN_LAMPIRAN_SEQ", sequenceName = "LPA_MESIN_LAMPIRAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_MESIN", nullable = false)
    public LpaMesin getLpaMesin() {
        return lpaMesin;
    }

    public void setLpaMesin(LpaMesin lpaMesin) {
        this.lpaMesin = lpaMesin;
    }

    @Column(name = "RANGKAIAN", length = 50)
    public String getRangkaian() {
        return rangkaian;
    }

    public void setRangkaian(String rangkaian) {
        this.rangkaian = rangkaian;
    }

    @Column(name = "JENIS", length = 50)
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Column(name = "MERK", length = 50)
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Column(name = "TYPE_MODEL", length = 50)
    public String getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(String typeModel) {
        this.typeModel = typeModel;
    }

    @Column(name = "NO_SERI", length = 50)
    public String getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(String noSeri) {
        this.noSeri = noSeri;
    }

    @Column(name = "ASAL_PEMBUATAN", length = 50)
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Column(name = "TAHUN_PEMBUATAN", length = 4)
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    @Column(name = "KEGUNAAN", length = 50)
    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }

    @Column(name = "KONDISI", length = 50)
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    @Column(name = "NO_INVOICE", length = 50)
    public String getNoInvoice() {
        return noInvoice;
    }

    public void setNoInvoice(String noInvoice) {
        this.noInvoice = noInvoice;
    }

    @Column(name = "TANGGAL")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Column(name = "PEMILIK", length = 50)
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Column(name = "NILAI_DOKUMEN")
    public BigDecimal getNilaiDoc() {
        return nilaiDoc;
    }

    public void setNilaiDoc(BigDecimal nilaiDoc) {
        this.nilaiDoc = nilaiDoc;
    }

    @Column(name = "NILAI_FISIK")
    public BigDecimal getNilaiFisik() {
        return nilaiFisik;
    }

    public void setNilaiFisik(BigDecimal nilaiFisik) {
        this.nilaiFisik = nilaiFisik;
    }
}