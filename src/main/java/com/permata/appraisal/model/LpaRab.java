package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import org.hibernate.annotations.Cascade;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_RAB")
public class LpaRab extends EntityBase<Long> {

    private Long id;
    private LpaUmum lpaUmum;

    private BigDecimal biayaDilampirkan;
    private String tidakDiperhitungkan1txt;
    private String tidakDiperhitungkan2txt;
    private String tidakDiperhitungkan3txt;
    private String tidakDiperhitungkan4txt;
    private String tidakDiperhitungkan5txt;
    private BigDecimal tidakDiperhitungkan1;
    private BigDecimal tidakDiperhitungkan2;
    private BigDecimal tidakDiperhitungkan3;
    private BigDecimal tidakDiperhitungkan4;
    private BigDecimal tidakDiperhitungkan5;
    private BigDecimal biayaTidakDiperhitungkan;
    private BigDecimal biayaDiperhitungkan;
    private Double luasBangungan;
    private BigDecimal hargaBangunanRab;
    private BigDecimal hargaBangunanInternal;
    private BigDecimal nilaiReviewCustomer;
    private BigDecimal nilaiReviewInternal;
    private String kewajaranNilai;


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_RAB_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_RAB_SEQ", sequenceName = "LPA_RAB_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "BIAYA_DI_LAMPIRKAN")
    public BigDecimal getBiayaDilampirkan() {
        return biayaDilampirkan;
    }

    public void setBiayaDilampirkan(BigDecimal biayaDilampirkan) {
        this.biayaDilampirkan = biayaDilampirkan;
    }

    @Column(name = "BIAYA_TIDAK_DI_PERHITUNGKAN")
    public BigDecimal getBiayaTidakDiperhitungkan() {
        return biayaTidakDiperhitungkan;
    }

    public void setBiayaTidakDiperhitungkan(BigDecimal biayaTidakDiperhitungkan) {
        this.biayaTidakDiperhitungkan = biayaTidakDiperhitungkan;
    }

    @Column(name = "BIAYA_DI_PERHITUNGKAN")
    public BigDecimal getBiayaDiperhitungkan() {
        return biayaDiperhitungkan;
    }

    public void setBiayaDiperhitungkan(BigDecimal biayaDiperhitungkan) {
        this.biayaDiperhitungkan = biayaDiperhitungkan;
    }

    @Column(name = "LUAS_BANGUNAN")
    public Double getLuasBangungan() {
        return luasBangungan;
    }

    public void setLuasBangungan(Double luasBangungan) {
        this.luasBangungan = luasBangungan;
    }

    @Column(name = "HARGA_BANGUNAN_RAB")
    public BigDecimal getHargaBangunanRab() {
        return hargaBangunanRab;
    }

    public void setHargaBangunanRab(BigDecimal hargaBangunanRab) {
        this.hargaBangunanRab = hargaBangunanRab;
    }

    @Column(name = "HARGA_BANGUNAN_INTERNAL")
    public BigDecimal getHargaBangunanInternal() {
        return hargaBangunanInternal;
    }

    public void setHargaBangunanInternal(BigDecimal hargaBangunanInternal) {
        this.hargaBangunanInternal = hargaBangunanInternal;
    }

    @Column(name = "NILAI_REVIEW_CUSTOMER")
    public BigDecimal getNilaiReviewCustomer() {
        return nilaiReviewCustomer;
    }

    public void setNilaiReviewCustomer(BigDecimal nilaiReviewCustomer) {
        this.nilaiReviewCustomer = nilaiReviewCustomer;
    }

    @Column(name = "NILAI_REVIEW_INTERNAL")
    public BigDecimal getNilaiReviewInternal() {
        return nilaiReviewInternal;
    }

    public void setNilaiReviewInternal(BigDecimal nilaiReviewInternal) {
        this.nilaiReviewInternal = nilaiReviewInternal;
    }

    @Column(name = "KEWAJARAN_NILAI")
    public String getKewajaranNilai() {
        return kewajaranNilai;
    }

    public void setKewajaranNilai(String kewajaranNilai) {
        this.kewajaranNilai = kewajaranNilai;
    }

    @Column(name = "TIDAK_DIPERHITUNGAN_1")
    public BigDecimal getTidakDiperhitungkan1() {
        return tidakDiperhitungkan1;
    }

    public void setTidakDiperhitungkan1(BigDecimal tidakDiperhitungkan1) {
        this.tidakDiperhitungkan1 = tidakDiperhitungkan1;
    }

    @Column(name = "TIDAK_DIPERHITUNGAN_2")
    public BigDecimal getTidakDiperhitungkan2() {
        return tidakDiperhitungkan2;
    }

    public void setTidakDiperhitungkan2(BigDecimal tidakDiperhitungkan2) {
        this.tidakDiperhitungkan2 = tidakDiperhitungkan2;
    }

    @Column(name = "TIDAK_DIPERHITUNGAN_3")
    public BigDecimal getTidakDiperhitungkan3() {
        return tidakDiperhitungkan3;
    }

    public void setTidakDiperhitungkan3(BigDecimal tidakDiperhitungkan3) {
        this.tidakDiperhitungkan3 = tidakDiperhitungkan3;
    }

    @Column(name = "TIDAK_DIPERHITUNGAN_4")
    public BigDecimal getTidakDiperhitungkan4() {
        return tidakDiperhitungkan4;
    }

    public void setTidakDiperhitungkan4(BigDecimal tidakDiperhitungkan4) {
        this.tidakDiperhitungkan4 = tidakDiperhitungkan4;
    }

    @Column(name = "TIDAK_DIPERHITUNGAN_5")
    public BigDecimal getTidakDiperhitungkan5() {
        return tidakDiperhitungkan5;
    }

    public void setTidakDiperhitungkan5(BigDecimal tidakDiperhitungkan5) {
        this.tidakDiperhitungkan5 = tidakDiperhitungkan5;
    }

    @Column(name = "TXT_TIDAK_DIPERHITUNGAN_1", length = 50)
    public String getTidakDiperhitungkan1txt() {
        return tidakDiperhitungkan1txt;
    }

    public void setTidakDiperhitungkan1txt(String tidakDiperhitungkan1txt) {
        this.tidakDiperhitungkan1txt = tidakDiperhitungkan1txt;
    }

    @Column(name = "TXT_TIDAK_DIPERHITUNGAN_2", length = 50)
    public String getTidakDiperhitungkan2txt() {
        return tidakDiperhitungkan2txt;
    }

    public void setTidakDiperhitungkan2txt(String tidakDiperhitungkan2txt) {
        this.tidakDiperhitungkan2txt = tidakDiperhitungkan2txt;
    }

    @Column(name = "TXT_TIDAK_DIPERHITUNGAN_3", length = 50)
    public String getTidakDiperhitungkan3txt() {
        return tidakDiperhitungkan3txt;
    }

    public void setTidakDiperhitungkan3txt(String tidakDiperhitungkan3txt) {
        this.tidakDiperhitungkan3txt = tidakDiperhitungkan3txt;
    }

    @Column(name = "TXT_TIDAK_DIPERHITUNGAN_4", length = 50)
    public String getTidakDiperhitungkan4txt() {
        return tidakDiperhitungkan4txt;
    }

    public void setTidakDiperhitungkan4txt(String tidakDiperhitungkan4txt) {
        this.tidakDiperhitungkan4txt = tidakDiperhitungkan4txt;
    }

    @Column(name = "TXT_TIDAK_DIPERHITUNGAN_5", length = 50)
    public String getTidakDiperhitungkan5txt() {
        return tidakDiperhitungkan5txt;
    }

    public void setTidakDiperhitungkan5txt(String tidakDiperhitungkan5txt) {
        this.tidakDiperhitungkan5txt = tidakDiperhitungkan5txt;
    }
}
