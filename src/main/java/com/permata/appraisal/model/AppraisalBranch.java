package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.AuditingEntityListener;
import com.permata.appraisal.common.EntityReferenceBase;
import jakarta.persistence.*;


@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "APPRAISAL_CABANG")
@EntityListeners({AuditingEntityListener.class})
public class AppraisalBranch extends EntityReferenceBase<Long> {

    private static final long serialVersionUID = 1299830455038543632L;
    private Long id;
    private String name;

    @Id
    @GeneratedValue(generator = "APPRAISAL_CABANG_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "APPRAISAL_CABANG_SEQ", sequenceName = "APPRAISAL_CABANG_SEQ", initialValue = 1, allocationSize = 1)
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

}