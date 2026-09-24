package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "DATA_REJECT")
public class DataReject extends EntityBase<Long> {

    private Long id;
    private DataCommon dataCommon;
    private Person person;
    private Date date;
    private String message;

    @Id
    @GeneratedValue(generator = "DATA_REJECT_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "DATA_REJECT_SEQ", sequenceName = "DATA_REJECT_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @JoinColumn(name = "REJECT_BY")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "REJECT_DATE")
    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "PESAN")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
