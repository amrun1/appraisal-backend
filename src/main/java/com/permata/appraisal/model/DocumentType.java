package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityAuditrailBase;
import com.permata.appraisal.util.SoftDeleteSupport;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_DOKUMEN")
public class DocumentType extends EntityAuditrailBase<Long> implements SoftDeleteSupport {

    private Long id;
    private String name;
    private AssetType assetType;
    private Boolean jatuhTempo;
    private Integer deleted;

    @Id
    @GeneratedValue(generator = "JENIS_DOKUMEN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "JENIS_DOKUMEN_SEQ", sequenceName = "JENIS_DOKUMEN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Column(name = "NAMA", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_AKTIVA")
    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    @Column(name = "ADA_JATUH_TEMPO")
    public Boolean getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(Boolean jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }
}