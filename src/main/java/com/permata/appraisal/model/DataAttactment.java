package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "DATA_ATTACT")
public class DataAttactment extends EntityBase<Long> {

    private Long id;
    private String name;
    private String extension;
    private byte[] file;
    private DataDetail dataDetail;
    private DocumentType documentType;

    @Id
    @GeneratedValue(generator = "DATA_ATTACT_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "DATA_ATTACT_SEQ", sequenceName = "DATA_ATTACT_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAMA")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EXT", length = 5)
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getFile() {
        return file;
    }

    @Column(name = "FILE_LAMPIRAN")
    @Lob
    public void setFile(byte[] file) {
        this.file = file;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDataDetail() {
        return dataDetail;
    }

    public void setDataDetail(DataDetail dataDetail) {
        this.dataDetail = dataDetail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_DOKUMEN")
    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
}