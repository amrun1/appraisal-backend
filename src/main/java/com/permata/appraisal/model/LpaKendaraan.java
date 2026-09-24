package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import com.permata.appraisal.util.ListUtils;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_KENDARAAN")
public class LpaKendaraan extends EntityBase<Long> {

    private Long id;
    private LpaUmum lpaUmum;

    // penilaian agunan internal
    private Double persenLikuidasi;
    private BigDecimal totalDokumen;
    private BigDecimal totalFisik;
    private BigDecimal likuidasiDokumen;
    private Boolean beriNilaiDokumen;
    private Boolean beriNilaiFisik;
    private BigDecimal likuidasiFisik;

    // penilaian agunan eksternal
    private Double persenLikuidasiEks;
    private BigDecimal totalDokumenEks;
    private BigDecimal totalFisikEks;
    private BigDecimal likuidasiDokumenEks;
    private Boolean beriNilaiDokumenEks;
    private Boolean beriNilaiFisikEks;
    private BigDecimal likuidasiFisikEks;

    private List<LpaItemKendaraan> kendaraan;

    public LpaKendaraan() {
        super();
    }

    public LpaKendaraan(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_KENDARAAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_KENDARAAN_SEQ", sequenceName = "LPA_KENDARAAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_LPA_UMUM")
    public LpaUmum getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(LpaUmum lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaKendaraan", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<LpaItemKendaraan> getKendaraan() {
        return kendaraan;
    }

    public void addKendaraan(LpaItemKendaraan item) {
        item.setLpaKendaraan(this);
        if (ListUtils.isEmpty(kendaraan)) {
            kendaraan = new ArrayList<LpaItemKendaraan>();
        }
        kendaraan.add(item);
    }

    public void setKendaraan(List<LpaItemKendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }

    @Column(name = "PERSEN_LIKUIDASI")
    public Double getPersenLikuidasi() {
        return persenLikuidasi;
    }

    public void setPersenLikuidasi(Double persenLikuidasi) {
        this.persenLikuidasi = persenLikuidasi;
    }

    @Column(name = "TOTAL_DOC")
    public BigDecimal getTotalDokumen() {
        return totalDokumen;
    }

    public void setTotalDokumen(BigDecimal totalDokumen) {
        this.totalDokumen = totalDokumen;
    }

    @Column(name = "TOTAL_FISIK")
    public BigDecimal getTotalFisik() {
        return totalFisik;
    }

    public void setTotalFisik(BigDecimal totalFisik) {
        this.totalFisik = totalFisik;
    }

    @Column(name = "LIKUIDASI_DOC")
    public BigDecimal getLikuidasiDokumen() {
        return likuidasiDokumen;
    }

    public void setLikuidasiDokumen(BigDecimal likuidasiDokumen) {
        this.likuidasiDokumen = likuidasiDokumen;
    }

    @Column(name = "BERI_NILAI_DOC")
    public Boolean getBeriNilaiDokumen() {
        return beriNilaiDokumen;
    }

    public void setBeriNilaiDokumen(Boolean beriNilaiDokumen) {
        this.beriNilaiDokumen = beriNilaiDokumen;
    }

    @Column(name = "BERI_NILAI_FISIK")
    public Boolean getBeriNilaiFisik() {
        return beriNilaiFisik;
    }

    public void setBeriNilaiFisik(Boolean beriNilaiFisik) {
        this.beriNilaiFisik = beriNilaiFisik;
    }

    @Column(name = "LIKUIDASI_FISIK")
    public BigDecimal getLikuidasiFisik() {
        return likuidasiFisik;
    }

    public void setLikuidasiFisik(BigDecimal likuidasiFisik) {
        this.likuidasiFisik = likuidasiFisik;
    }

    @Column(name = "PERSEN_LIKUIDASI_EKS")
    public Double getPersenLikuidasiEks() {
        return persenLikuidasiEks;
    }

    public void setPersenLikuidasiEks(Double persenLikuidasiEks) {
        this.persenLikuidasiEks = persenLikuidasiEks;
    }

    @Column(name = "TOTAL_DOC_EKS")
    public BigDecimal getTotalDokumenEks() {
        return totalDokumenEks;
    }

    public void setTotalDokumenEks(BigDecimal totalDokumenEks) {
        this.totalDokumenEks = totalDokumenEks;
    }

    @Column(name = "TOTAL_FISIK_EKS")
    public BigDecimal getTotalFisikEks() {
        return totalFisikEks;
    }

    public void setTotalFisikEks(BigDecimal totalFisikEks) {
        this.totalFisikEks = totalFisikEks;
    }

    @Column(name = "LIKUIDASI_DOC_EKS")
    public BigDecimal getLikuidasiDokumenEks() {
        return likuidasiDokumenEks;
    }

    public void setLikuidasiDokumenEks(BigDecimal likuidasiDokumenEks) {
        this.likuidasiDokumenEks = likuidasiDokumenEks;
    }

    @Column(name = "BERI_NILAI_DOC_EKS")
    public Boolean getBeriNilaiDokumenEks() {
        return beriNilaiDokumenEks;
    }

    public void setBeriNilaiDokumenEks(Boolean beriNilaiDokumenEks) {
        this.beriNilaiDokumenEks = beriNilaiDokumenEks;
    }

    @Column(name = "BERI_NILAI_FISIK_EKS")
    public Boolean getBeriNilaiFisikEks() {
        return beriNilaiFisikEks;
    }

    public void setBeriNilaiFisikEks(Boolean beriNilaiFisikEks) {
        this.beriNilaiFisikEks = beriNilaiFisikEks;
    }

    public BigDecimal getLikuidasiFisikEks() {
        return likuidasiFisikEks;
    }

    @Column(name = "LIKUIDASI_FISIK_EKS")
    public void setLikuidasiFisikEks(BigDecimal likuidasiFisikEks) {
        this.likuidasiFisikEks = likuidasiFisikEks;
    }

}