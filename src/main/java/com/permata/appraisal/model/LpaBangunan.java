package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_DOC_BANGUNAN")
public class LpaBangunan extends EntityBase<Long> {

    private Long id;
    private LpaTanahBangunan common;
    private String nomorImb;
    private Date tanggalImb;
    private String ijinSesuaiImb;
    private Double luasBangunan;
    private Double jumlahLantai;
    private String readDocBangunan;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_BANGUNAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_BANGUNAN_SEQ", sequenceName = "LPA_BANGUNAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_UMUM", nullable = false)
    public LpaTanahBangunan getCommon() {
        return common;
    }

    public void setCommon(LpaTanahBangunan common) {
        this.common = common;
    }

    @Column(name = "NOMOR_IMB")
    public String getNomorImb() {
        return nomorImb;
    }

    public void setNomorImb(String nomorImb) {
        this.nomorImb = nomorImb;
    }

    @Column(name = "TANGGAL_IMB")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalImb() {
        return tanggalImb;
    }

    public void setTanggalImb(Date tanggalImb) {
        this.tanggalImb = tanggalImb;
    }

    @Column(name = "IJIN_SESUAI_IMB")
    public String getIjinSesuaiImb() {
        return ijinSesuaiImb;
    }

    public void setIjinSesuaiImb(String ijinSesuaiImb) {
        this.ijinSesuaiImb = ijinSesuaiImb;
    }

    @Column(name = "LUAS_BANGUNAN")
    public Double getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(Double luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    @Column(name = "JUMLAH_LANTAI")
    public Double getJumlahLantai() {
        return jumlahLantai;
    }

    public void setJumlahLantai(Double jumlahLantai) {
        this.jumlahLantai = jumlahLantai;
    }


    @Column(name = "STATUS_DOC")
    public String getReadDocBangunan() {
        return readDocBangunan;
    }

    public void setReadDocBangunan(String readDocBangunan) {
        this.readDocBangunan = readDocBangunan;
    }
}