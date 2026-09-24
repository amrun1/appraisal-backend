package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "JENIS_PENILAIAN")
public class JenisPenilaian extends EntityBase<Long> {

    private Long id;
    private CategoryType categoryType;
    private String nama;
    private String kategori;
    private Integer sla;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JENIS_PENILAIAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "JENIS_PENILAIAN_SEQ", sequenceName = "JENIS_PENILAIAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KATEGORI_AKTIVA", nullable = false)
    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Column(name = "NAMA", length = 50)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Column(name = "KATEGORI", length = 50)
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Column(name = "SLA", length = 2)
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }
}