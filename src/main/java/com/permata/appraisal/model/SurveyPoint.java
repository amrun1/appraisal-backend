package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_POINT")
public class SurveyPoint extends EntityBase<Long> {

    private Long id;
    private DataDetail detail;
    private String positif;
    private String catatan;
    private List<Parameter> negatif;
    private List<Parameter> pertimbangan;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_POINT_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_POINT_SEQ", sequenceName = "SURVEY_POINT_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column(name = "POSITIF")
    public String getPositif() {
        return positif;
    }

    public void setPositif(String positif) {
        this.positif = positif;
    }

    @Column(name = "CATATAN")
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "SURVEY_NEGATIF_POINT", joinColumns = @JoinColumn(name = "ID_PARAMETER"),
            inverseJoinColumns = @JoinColumn(name = "ID_SURVEY_POINT"))
    public List<Parameter> getNegatif() {
        return negatif;
    }

    public void setNegatif(List<Parameter> negatif) {
        this.negatif = negatif;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "SURVEY_PERTIMBANGAN_KHUSUS", joinColumns = @JoinColumn(name = "ID_PARAMETER"),
            inverseJoinColumns = @JoinColumn(name = "ID_SURVEY_POINT"))
    public List<Parameter> getPertimbangan() {
        return pertimbangan;
    }

    public void setPertimbangan(List<Parameter> pertimbangan) {
        this.pertimbangan = pertimbangan;
    }
}