package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_DOC_TANAH")
public class LpaTanah extends EntityBase<Long> {

    private Long id;
    private LpaTanahBangunan common;
    private DocumentType jenisDokumen;
    private String namaDokumen;
    private Date tanggalSertipikat;
    private String namaJalan;
    private String blockGangLantai;
    private String nomor;
    private String rt;
    private String rw;
    private String kelurahan;
    private String kecamatan;
    private String kota;
    private String propinsi;
    private String namaPemegangHak;
    private Date tanggalBerakhirHak;
    private String suratUkur;
    private Date tanggalSuratUkur;
    private Double luasTanah;
    private String readDocTanah;



    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_TANAH_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_TANAH_SEQ", sequenceName = "LPA_TANAH_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LPA_LNB", nullable = false)
    public LpaTanahBangunan getCommon() {
        return common;
    }

    public void setCommon(LpaTanahBangunan common) {
        this.common = common;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_DOKUMEN")
    public DocumentType getJenisDokumen() {
        return jenisDokumen;
    }

    public void setJenisDokumen(DocumentType jenisDokumen) {
        this.jenisDokumen = jenisDokumen;
    }

    @Column(name = "NAMA_DOKUMEN")
    public String getNamaDokumen() {
        return namaDokumen;
    }

    public void setNamaDokumen(String namaDokumen) {
        this.namaDokumen = namaDokumen;
    }

    @Column(name = "TANGGAL_SERTIFIKAT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSertipikat() {
        return tanggalSertipikat;
    }

    public void setTanggalSertipikat(Date tanggalSertipikat) {
        this.tanggalSertipikat = tanggalSertipikat;
    }

    @Column(name = "NAMA_JALAN")
    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    @Column(name = "BLOCK")
    public String getBlockGangLantai() {
        return blockGangLantai;
    }

    public void setBlockGangLantai(String blockGangLantai) {
        this.blockGangLantai = blockGangLantai;
    }

    @Column(name = "NOMOR")
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Column(name = "RT")
    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    @Column(name = "RW")
    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    @Column(name = "KELURAHAN")
    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    @Column(name = "KECAMATAN")
    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    @Column(name = "KOTA")
    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Column(name = "PROPINSI")
    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    @Column(name = "NAMA_PEMEGANG_HAK")
    public String getNamaPemegangHak() {
        return namaPemegangHak;
    }

    public void setNamaPemegangHak(String namaPemegangHak) {
        this.namaPemegangHak = namaPemegangHak;
    }

    @Column(name = "TANGGAL_AKHIR_HAK")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalBerakhirHak() {
        return tanggalBerakhirHak;
    }

    public void setTanggalBerakhirHak(Date tanggalBerakhirHak) {
        this.tanggalBerakhirHak = tanggalBerakhirHak;
    }

    @Column(name = "SURAT_UKUR")
    public String getSuratUkur() {
        return suratUkur;
    }

    public void setSuratUkur(String suratUkur) {
        this.suratUkur = suratUkur;
    }

    @Column(name = "TANGGAL_SURAT_UKUR")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSuratUkur() {
        return tanggalSuratUkur;
    }

    public void setTanggalSuratUkur(Date tanggalSuratUkur) {
        this.tanggalSuratUkur = tanggalSuratUkur;
    }

    @Column(name = "LUAS_TANAH")
    public Double getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(Double luasTanah) {
        this.luasTanah = luasTanah;
    }


    @Column(name = "STATUS_DOC")
    public String getReadDocTanah() {
        return readDocTanah;
    }


    public void setReadDocTanah(String readDocTanah) {
        this.readDocTanah = readDocTanah;
    }

}