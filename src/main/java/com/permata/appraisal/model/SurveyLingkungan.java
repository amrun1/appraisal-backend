package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_LINGKUNGAN")
public class SurveyLingkungan extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private String sekitar;
    private String kepadatan;
    private String kemacetan;
    private String rencanaJalan;
    private Integer lebarJalan;
    private Integer gsb;
    private Integer gss;
    private String roda4;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_LINGKUNGAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_LINGKUNGAN_SEQ", sequenceName = "SURVEY_LINGKUNGAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDetail() {
        return detail;
    }

    public void setDetail(DataDetail detail) {
        this.detail = detail;
    }

    @Column(name = "SEKITAR")
    public String getSekitar() {
        return sekitar;
    }

    public void setSekitar(String sekitar) {
        this.sekitar = sekitar;
    }

    @Column(name = "KEPADATAN")
    public String getKepadatan() {
        return kepadatan;
    }

    public void setKepadatan(String kepadatan) {
        this.kepadatan = kepadatan;
    }

    @Column(name = "KEMACETAN")
    public String getKemacetan() {
        return kemacetan;
    }

    public void setKemacetan(String kemacetan) {
        this.kemacetan = kemacetan;
    }

    @Column(name = "KENA_RENCANA_JALAN", length = 4)
    public String getRencanaJalan() {
        return rencanaJalan;
    }

    public void setRencanaJalan(String rencanaJalan) {
        this.rencanaJalan = rencanaJalan;
    }

    @Column(name = "LEBAR_JALAN")
    public Integer getLebarJalan() {
        return lebarJalan;
    }

    public void setLebarJalan(Integer lebarJalan) {
        this.lebarJalan = lebarJalan;
    }

    @Column(name = "GSB")
    public Integer getGsb() {
        return gsb;
    }

    public void setGsb(Integer gsb) {
        this.gsb = gsb;
    }

    @Column(name = "GSS")
    public Integer getGss() {
        return gss;
    }

    public void setGss(Integer gss) {
        this.gss = gss;
    }

    @Column(name = "DILALUI_RODA_4", length = 4)
    public String getRoda4() {
        return roda4;
    }

    public void setRoda4(String roda4) {
        this.roda4 = roda4;
    }
}