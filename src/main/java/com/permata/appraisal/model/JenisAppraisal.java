package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityReferenceBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_APPRAISAL")
public class JenisAppraisal extends EntityReferenceBase<Long> {

    private static final long serialVersionUID = -7423812851308152744L;

    private Long id;
    private String name;
    private Boolean external;

    public JenisAppraisal(){
        super();
    }

    public JenisAppraisal(Long id){
        super();
        this.setId(id);
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JENIS_APPRAISAL_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "JENIS_APPRAISAL_SEQ", sequenceName = "JENIS_APPRAISAL_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAMA", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EXTERNAL")
    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

}