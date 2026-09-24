package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_KATEGORI")
public class CategoryType extends EntityBase<String> {

    private String code;
    private String name;
    private List<AssetType> assetTypes;

    @Id
    @Column(name = "KODE", length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "nama", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // cascade none
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryType")
    public List<AssetType> getAssetTypes() {
        return assetTypes;
    }

    public void setAssetTypes(List<AssetType> assetTypes) {
        this.assetTypes = assetTypes;
    }
}