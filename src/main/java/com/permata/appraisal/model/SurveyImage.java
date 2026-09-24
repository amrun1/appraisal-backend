package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_IMAGE")
public class SurveyImage extends EntityBase<Long> {

    private Long id;
    private SurveyCommon common;
    private Long lpaId;
    private DocumentLpaType documentLpaType;
    private String contentType;
    private String catatan;
    private byte[] image;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_IMAGE_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_IMAGE_SEQ", sequenceName = "SURVEY_IMAGE_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SURVEY_UMUM", nullable = true)
    public SurveyCommon getCommon() {
        return common;
    }

    public void setCommon(SurveyCommon common) {
        this.common = common;
    }

    @Column(name = "ID_LPA", nullable = true)
    public Long getLpaId() {
        return lpaId;
    }

    public void setLpaId(Long lpaId) {
        this.lpaId = lpaId;
    }

//    @Column(name = "KATEGORI")
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LAPORAN_DOKUMEN", nullable = true)
    public DocumentLpaType getDocumentLpaType() {
        return documentLpaType;
    }

    public void setDocumentLpaType(DocumentLpaType documentLpaType) {
        this.documentLpaType = documentLpaType;
    }

    @Column(name = "CONTENT_TYPE")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Column(name = "CATATAN")
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @Column(name = "IMAGE")
    @Lob
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}