package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "STATUS_JAMINAN")
public class StatusJaminan extends EntityBase<Long> {

    private static final long serialVersionUID = 8907812504339966986L;
    private Long id;
    private String name;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "STATUS_JAMINAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "STATUS_JAMINAN_SEQ", sequenceName = "STATUS_JAMINAN_SEQ", initialValue = 1, allocationSize = 1)
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