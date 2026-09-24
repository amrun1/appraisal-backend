package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "PARAMETER")
public class Parameter extends EntityBase<Long> {

    private Long id;
    private String code;
    private GroupParameter group;
    private String value;
    private Integer sorting;
    private Boolean active;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "PARAMETER_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "PARAMETER_SEQ", sequenceName = "PARAMETER_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_GROUP")
    public GroupParameter getGroup() {
        return group;
    }

    public void setGroup(GroupParameter group) {
        this.group = group;
    }

    @Column(name = "CODE", length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "VALUE")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "SORTING")
    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    @Column(name = "AKTIF")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
