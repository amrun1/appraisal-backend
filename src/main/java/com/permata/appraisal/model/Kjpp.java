package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityAuditrailBase;
import com.permata.appraisal.util.SoftDeleteSupport;

import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "KJPP")
public class Kjpp extends EntityAuditrailBase<Long> implements SoftDeleteSupport {

    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private Integer deleted;

    @Override
    @Column(name = "DELETED")
    public Integer getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(Integer deleted) {
        this.deleted =  deleted;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "KJPP_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "KJPP_SEQ", sequenceName = "KJPP_SEQ", initialValue = 1, allocationSize = 1)
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}