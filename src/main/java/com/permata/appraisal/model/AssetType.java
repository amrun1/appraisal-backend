package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityAuditrailBase;
import com.permata.appraisal.util.SoftDeleteSupport;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_AKTIVA")
public class AssetType extends EntityAuditrailBase<Long> implements SoftDeleteSupport {

    private static final long serialVersionUID = 6670801309261230776L;
    private Long id;
    private CategoryType categoryType;
    private String name;
    private String yesNo;
    private Integer deleted;

    public AssetType() {
        super();
    }

    public AssetType(Long id) {
        super();
        this.id = id;
    }


    @Override
    @Column(name = "DELETED")
    public Integer getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Id
    @GeneratedValue(generator = "JENIS_AKTIVA_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "JENIS_AKTIVA_SEQ", sequenceName = "JENIS_AKTIVA_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KODE_KATEGORI")
    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Column(name = "NAMA", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "SLA")
//    public Integer getSla() {
//        return sla;
//    }
//
//    public void setSla(Integer sla) {
//        this.sla = sla;
//    }

    @Column(name = "YES_NO", length = 2)
    public String getYesNo() {
        return yesNo;
    }

    public void setYesNo(String yesNo) {
        this.yesNo = yesNo;
    }

}