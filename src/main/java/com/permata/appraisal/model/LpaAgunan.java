package com.permata.appraisal.model;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

//@Entity
//@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_AGUNAN")
public class LpaAgunan extends EntityBase<Long> {

    private Long id;
    private LpaTanahBangunan common;
//    private BigDecimal hargaTanah;
//    private BigDecimal hargaBangunan;
//    private String uraian1;
//    private BigDecimal nilaiDokumen1;
//    private Boolean diberiNilaiDokumen1;
//    private BigDecimal nilaiFisik1;
//    private Boolean diberiNilaiFisik1;
//    private Double prosentase1;
//    private String uraian2;
//    private BigDecimal nilaiDokumen2;
//    private Boolean diberiNilaiDokumen2;
//    private BigDecimal nilaiFisik2;
//    private Boolean diberiNilaiFisik2;
//    private Double prosentase2;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_AGUNAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_AGUNAN_SEQ", sequenceName = "LPA_AGUNAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_UMUM", nullable = false)
    public LpaTanahBangunan getCommon() {
        return common;
    }

    public void setCommon(LpaTanahBangunan common) {
        this.common = common;
    }


}