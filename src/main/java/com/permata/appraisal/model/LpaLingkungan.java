package com.permata.appraisal.model;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

//@Entity
//@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_LINGKUNGAN")
public class LpaLingkungan extends EntityBase<Long> {

    private Long id;
    private LpaTanahBangunan common;
//    private String sekitar;
//    private String kepadatan;
//    private String kemacetan;
//    private String rencanaJalan;
//    private Double lebarJalan;
//    private Double gsb;
//    private Double gss;
//    private String kendaraanRoda4;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_LINGKUNGAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_LINGKUNGAN_SEQ", sequenceName = "LLPA_LINGKUNGAN_SEQ", initialValue = 1, allocationSize = 1)
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