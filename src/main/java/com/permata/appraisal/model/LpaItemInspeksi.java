package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;

/**
 * Created by SB on 4/14/2018.
 */


@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_INSPEKSI_ITEM")
public class LpaItemInspeksi extends EntityBase<Long> {
    private Long id;
    private LpaInspeksi lpaInspeksi;
    private String type;
    private String name;
    private String totalDoc;
    private String totalFisik;

    public LpaItemInspeksi() {
        super();
    }

    public LpaItemInspeksi(LpaInspeksi lpaInspeksi) {
        this.lpaInspeksi = lpaInspeksi;
    }


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_INSPEKSI_ITEM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_INSPEKSI_ITEM_SEQ", sequenceName = "LPA_INSPEKSI_ITEM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_INSPEKSI")
    @Fetch(FetchMode.JOIN)
    public LpaInspeksi getLpaInspeksi() {
        return lpaInspeksi;
    }

    public void setLpaInspeksi(LpaInspeksi lpaInspeksi) {
        this.lpaInspeksi = lpaInspeksi;
    }

    @Column(name = "tipe")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "NAMA")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TOTAL_DOC")
    public String getTotalDoc() {
        return totalDoc;
    }

    public void setTotalDoc(String totalDoc) {
        this.totalDoc = totalDoc;
    }

    @Column(name = "TOTAL_FISIK")
    public String getTotalFisik() {
        return totalFisik;
    }

    public void setTotalFisik(String totalFisik) {
        this.totalFisik = totalFisik;
    }
}
