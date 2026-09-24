package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;


@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_STOCK")
public class SurveyStock extends EntityBase<Long> {
    private Long id;
    private DataDetail detail;
    private String jenisPersedian;
    private String penempatanBarang;
    private String kemasanBarang;
    private String kondisiBarang;
    private String metodePemeriksaan;
    private String jumlahPersedian;
    private String asalPembuatan;
    private String kondisiPenyimpanan;
    private String lingkunganSekitar;
    private String peralatanGudang;
    private String catatan;


    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_STOCK_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_STOCK_SEQ", sequenceName = "SURVEY_STOCK_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDetail() {
        return detail;
    }

    public void setDetail(DataDetail detail) {
        this.detail = detail;
    }


    @Column (name = "JENIS_PERSEDIAAN", length = 50)
    public String getJenisPersedian() {
        return jenisPersedian;
    }

    public void setJenisPersedian(String jenisPersedian) {
        this.jenisPersedian = jenisPersedian;
    }

    @Column (name = "PENEMPATAN_BARANG", length = 50)
    public String getPenempatanBarang() {
        return penempatanBarang;
    }

    public void setPenempatanBarang(String penempatanBarang) {
        this.penempatanBarang = penempatanBarang;
    }


    @Column (name = "KEMASAN_BARANG", length = 50)
    public String getKemasanBarang() {
        return kemasanBarang;
    }

    public void setKemasanBarang(String kemasanBarang) {
        this.kemasanBarang = kemasanBarang;
    }


    @Column (name = "KONDISI_BARANG", length = 50)
    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }


    @Column (name = "METODE_PEMERIKSAAN", length = 50)
    public String getMetodePemeriksaan() {
        return metodePemeriksaan;
    }

    public void setMetodePemeriksaan(String metodePemeriksaan) {
        this.metodePemeriksaan = metodePemeriksaan;
    }


    @Column (name = "JUMLAH_PERSEDIAAN", length = 50)
    public String getJumlahPersedian() {
        return jumlahPersedian;
    }

    public void setJumlahPersedian(String jumlahPersedian) {
        this.jumlahPersedian = jumlahPersedian;
    }


    @Column (name = "ASAL_PEMBUATAN", length = 50)
    public String getAsalPembuatan() {
        return asalPembuatan;
    }

    public void setAsalPembuatan(String asalPembuatan) {
        this.asalPembuatan = asalPembuatan;
    }


    @Column (name = "KONDISI_PENYIMPANAN", length = 50)
    public String getKondisiPenyimpanan() {
        return kondisiPenyimpanan;
    }

    public void setKondisiPenyimpanan(String kondisiPenyimpanan) {
        this.kondisiPenyimpanan = kondisiPenyimpanan;
    }

    @Column (name = "LINGKUNGAN_SEKITAR", length = 50)
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column (name = "PERALATAN_GUDANG", length = 50)
    public String getPeralatanGudang() {
        return peralatanGudang;
    }

    public void setPeralatanGudang(String peralatanGudang) {
        this.peralatanGudang = peralatanGudang;
    }

    @Column (name = "CATATAN", length = 50)
    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SurveyStock{");
        sb.append("id=").append(id);
        sb.append(", detail=").append(detail);
        sb.append(", jenisPersedian='").append(jenisPersedian).append('\'');
        sb.append(", penempatanBarang='").append(penempatanBarang).append('\'');
        sb.append(", kemasanBarang='").append(kemasanBarang).append('\'');
        sb.append(", kondisiBarang='").append(kondisiBarang).append('\'');
        sb.append(", metodePemeriksaan='").append(metodePemeriksaan).append('\'');
        sb.append(", jumlahPersedian='").append(jumlahPersedian).append('\'');
        sb.append(", asalPembuatan='").append(asalPembuatan).append('\'');
        sb.append(", kondisiPenyimpanan='").append(kondisiPenyimpanan).append('\'');
        sb.append(", lingkunganSekitar='").append(lingkunganSekitar).append('\'');
        sb.append(", peralatanGudang='").append(peralatanGudang).append('\'');
        sb.append(", catatan='").append(catatan).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
