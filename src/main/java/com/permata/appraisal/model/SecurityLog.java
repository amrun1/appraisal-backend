package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SECURITY_LOG")
public class SecurityLog {

    private Long id;
    private Person person;
    private Date dateTime;
    private String ipAddress;
    private Long logCode;
    private String keterangan;
    private String computerName;
    private String detail;
    private String userAffected;
    private String appName;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SECURITY_LOG_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SECURITY_LOG_SEQ", sequenceName = "SECURITY_LOG_SEQ", allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_USERID")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Column(name = "IPADDRESS")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Column(name = "LOG_CODE")
    public Long getLogCode() {
        return logCode;
    }

    public void setLogCode(Long logCode) {
        this.logCode = logCode;
    }

    @Column(name = "KETERANGAN")
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Column(name = "COMPUTER_NAME")
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Column(name = "DETAIL_EVENT")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Column(name = "USER_AFFECTED")
    public String getUserAffected() {
        return userAffected;
    }

    public void setUserAffected(String userAffected) {
        this.userAffected = userAffected;
    }

    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}