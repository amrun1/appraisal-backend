package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.Date;

/**
 * Created by SB on 4/14/2018.
 */

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "SURVEY_INSPEKSI")
public class SurveyInspeksi extends EntityBase<Long> {
    private Long id;
//    private LpaUmum lpaUmum;
    private DataDetail detail;
    private String jenisBarang;
    private String nomorDaftar;
    private Date tanggalDaftar;
    private String jenisTempat;
    private String infoAlamatTempat;
    private String alamatLain;
    private String statusTempat;
    private String kondisiTempat;
    private String aktifitasKerja;
    private String peralatanGudang;
    private String alatPemadam;
    private String keamanan;
    private String kondisiJalan;
    private String lingkunganSekitar;
    private String metodePeriksa;
    private String tempatPersediaan;
    private String susunanTempat;
    private String packing;
    private String subTotalGoods;
    private String subTotalHalfGoods;
    private String subTotalRawMaterial;
    private String subTotalGoodsFisik;
    private String subTotalHalfGoodsFisik;
    private String subTotalRawMaterialFisik;

    public SurveyInspeksi() {
        super();
    }

    public SurveyInspeksi(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "SURVEY_INSPEKSI_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SURVEY_INSPEKSI_SEQ", sequenceName = "SURVEY_INSPEKSI_SEQ", initialValue = 1, allocationSize = 1)
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

    @Column (name = "JENIS_BARANG")
    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    @Column (name = "NOMOR_DAFTAR")
    public String getNomorDaftar() {
        return nomorDaftar;
    }

    public void setNomorDaftar(String nomorDaftar) {
        this.nomorDaftar = nomorDaftar;
    }

    @Column (name = "TANGGAL_DAFTAR")
    public Date getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(Date tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    @Column (name = "JENIS_TEMPAT")
    public String getJenisTempat() {
        return jenisTempat;
    }

    public void setJenisTempat(String jenisTempat) {
        this.jenisTempat = jenisTempat;
    }

    @Column (name = "INFO_ALAMAT_TEMPAT")
    public String getInfoAlamatTempat() {
        return infoAlamatTempat;
    }

    public void setInfoAlamatTempat(String infoAlamatTempat) {
        this.infoAlamatTempat = infoAlamatTempat;
    }

    @Column (name = "ALAMAT_LAIN")
    public String getAlamatLain() {
        return alamatLain;
    }

    public void setAlamatLain(String alamatLain) {
        this.alamatLain = alamatLain;
    }

    @Column (name = "STATUS_TEMPAT")
    public String getStatusTempat() {
        return statusTempat;
    }

    public void setStatusTempat(String statusTempat) {
        this.statusTempat = statusTempat;
    }

    @Column (name = "KONDISI_TEMPAT")
    public String getKondisiTempat() {
        return kondisiTempat;
    }

    public void setKondisiTempat(String kondisiTempat) {
        this.kondisiTempat = kondisiTempat;
    }

    @Column (name = "AKTIFITAS_KERJA")
    public String getAktifitasKerja() {
        return aktifitasKerja;
    }

    public void setAktifitasKerja(String aktifitasKerja) {
        this.aktifitasKerja = aktifitasKerja;
    }

    @Column (name = "PERALATAN_GUDANG")
    public String getPeralatanGudang() {
        return peralatanGudang;
    }

    public void setPeralatanGudang(String peralatanGudang) {
        this.peralatanGudang = peralatanGudang;
    }

    @Column (name = "ALAT_PEMADAM")
    public String getAlatPemadam() {
        return alatPemadam;
    }

    public void setAlatPemadam(String alatPemadam) {
        this.alatPemadam = alatPemadam;
    }

    @Column (name = "KEAMANAN")
    public String getKeamanan() {
        return keamanan;
    }

    public void setKeamanan(String keamanan) {
        this.keamanan = keamanan;
    }

    @Column (name = "KONDISI_JALAN")
    public String getKondisiJalan() {
        return kondisiJalan;
    }

    public void setKondisiJalan(String kondisiJalan) {
        this.kondisiJalan = kondisiJalan;
    }

    @Column (name = "LINGKUNGAN_SEKITAR")
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column (name = "METODE_PERIKSA")
    public String getMetodePeriksa() {
        return metodePeriksa;
    }

    public void setMetodePeriksa(String metodePeriksa) {
        this.metodePeriksa = metodePeriksa;
    }

    @Column (name = "TEMPAT_PERSEDIAAN")
    public String getTempatPersediaan() {
        return tempatPersediaan;
    }

    public void setTempatPersediaan(String tempatPersediaan) {
        this.tempatPersediaan = tempatPersediaan;
    }

    @Column (name = "SUSUNAN_TEMPAT")
    public String getSusunanTempat() {
        return susunanTempat;
    }

    public void setSusunanTempat(String susunanTempat) {
        this.susunanTempat = susunanTempat;
    }

    @Column (name = "PACKING")
    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    @Column (name = "TOTAL_GOODS")
    public String getSubTotalGoods() {
        return subTotalGoods;
    }

    public void setSubTotalGoods(String subTotalGoods) {
        this.subTotalGoods = subTotalGoods;
    }

    @Column (name = "TOTAL_HALFGOODS")
    public String getSubTotalHalfGoods() {
        return subTotalHalfGoods;
    }

    public void setSubTotalHalfGoods(String subTotalHalfGoods) {
        this.subTotalHalfGoods = subTotalHalfGoods;
    }

    @Column (name = "TOTAL_RAWMATERIAL")
    public String getSubTotalRawMaterial() {
        return subTotalRawMaterial;
    }

    public void setSubTotalRawMaterial(String subTotalRawMaterial) {
        this.subTotalRawMaterial = subTotalRawMaterial;
    }

    @Column (name = "TOTAL_GOODS_FISIK")
    public String getSubTotalGoodsFisik() {
        return subTotalGoodsFisik;
    }

    public void setSubTotalGoodsFisik(String subTotalGoodsFisik) {
        this.subTotalGoodsFisik = subTotalGoodsFisik;
    }

    @Column (name = "TOTAL_HALFGOODS_FISIK")
    public String getSubTotalHalfGoodsFisik() {
        return subTotalHalfGoodsFisik;
    }

    public void setSubTotalHalfGoodsFisik(String subTotalHalfGoodsFisik) {
        this.subTotalHalfGoodsFisik = subTotalHalfGoodsFisik;
    }

    @Column (name = "TOTAL_RAWMATERIAL_FISIK")
    public String getSubTotalRawMaterialFisik() {
        return subTotalRawMaterialFisik;
    }

    public void setSubTotalRawMaterialFisik(String subTotalRawMaterialFisik) {
        this.subTotalRawMaterialFisik = subTotalRawMaterialFisik;
    }
}
