package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "TASK_FLOW_HISTORY")
public class TaskHistory extends EntityBase<Long> {

    private Long id;
    private DataCommon dataCommon;
    private String description;
    private Person person;
    private Date date;
    private Integer param;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "TASK_FLOW_HISTORY_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "TASK_FLOW_HISTORY_SEQ", sequenceName = "TASK_FLOW_HISTORY_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TANGGAL")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_UMUM")
    public DataCommon getDataCommon() {
        return dataCommon;
    }

    public void setDataCommon(DataCommon dataCommon) {
        this.dataCommon = dataCommon;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DARI_PERSON")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "CATATAN")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "PARAM")

    public Integer getParam() {
        return param;
    }

    public void setParam(Integer param) {
        this.param = param;
    }
}