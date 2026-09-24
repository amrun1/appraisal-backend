package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_KAPAL")
public class LpaKapal extends EntityBase<Long> {

    private Long id;
    private LpaUmum lpaUmum;

    private String nama;
    private String pemilik;
    private String kebangsaan;
    private String selar;
    private String galangan;
    private String kelas;
    private Integer tahun;
    private String manufaktur;
    private Double panjang;
    private Double lebar;
    private Double tinggi;
    private Double isiKotor;
    private Double isiBersih;
    private String statusAgunan;
    private String statusJaminanKapal;
    private String kondisiUmum;

    // data Mesin LpaKapal
    private String mesinMerk1;
    private String mesinMerk2;
    private String mesinMerk3;
    private String mesinNomor1;
    private String mesinNomor2;
    private String mesinNomor3;
    private String mesinKapasitas1;
    private String mesinKapasitas2;
    private String mesinKapasitas3;
    private String mesinBackupMerk1;
    private String mesinBackupMerk2;
    private String mesinBackupNomor1;
    private String mesinBackupNomor2;
    private String mesinBackupKapasitas1;
    private String mesinBackupKapasitas2;

    // data Legalitas LpaKapal
    private String jenis;
    private String noGrossAkta;
    private Date tanggalGrossAkta;
    private String noSuratUkur;
    private Date tanggalSuratUkur;
    private String noSertifikatLambung;
    private Date tanggalSertifikatLambung;
    private Date expiredSertifikatLambung;
    private String noSertifikatGaris;
    private Date tanggalSertifikatGaris;
    private String noSertifikatMesin;
    private Date tanggalSertifikatMesin;
    private Date expiredSertifikatMesin;

    private Double likuidasi;
    private Boolean manual;
    private Boolean beriNilaiDoc;
    private Boolean beriNilaiFisik;
    private BigDecimal nilaiDocPasar;
    private BigDecimal nilaiFisikPasar;
    private BigDecimal nilaiDocLikuidasi;
    private BigDecimal nilaiFisikLikuidasi;

    private Double likuidasiEks;
    private Boolean manualEks;
    private Boolean beriNilaiDocEks;
    private Boolean beriNilaiFisikEks;
    private BigDecimal nilaiDocPasarEks;
    private BigDecimal nilaiFisikPasarEks;
    private BigDecimal nilaiDocLikuidasiEks;
    private BigDecimal nilaiFisikLikuidasiEks;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_KAPAL_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_KAPAL_SEQ", sequenceName = "LPA_KAPAL_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_LPA_UMUM")
    public LpaUmum getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(LpaUmum lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    @Column(length = 150, name = "NAMA_KAPAL")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Column(length = 100, name = "NAMA_PEMILIK")
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Column(length = 100, name = "KEBANGSAAN")
    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }

    @Column(length = 10, name = "STATUS_AGUNAN")
    public String getStatusAgunan() {
        return statusAgunan;
    }

    public void setStatusAgunan(String statusAgunan) {
        this.statusAgunan = statusAgunan;
    }

    @Column(length = 50, name = "STATUS_JAMINAN")
    public String getStatusJaminanKapal() {
        return statusJaminanKapal;
    }

    public void setStatusJaminanKapal(String statusJaminanKapal) {
        this.statusJaminanKapal = statusJaminanKapal;
    }

    @Column(length = 50, name = "KONDISI_UMUM")
    public String getKondisiUmum() {
        return kondisiUmum;
    }

    public void setKondisiUmum(String kondisiUmum) {
        this.kondisiUmum = kondisiUmum;
    }

    @Column(length = 100, name = "SELAR")
    public String getSelar() {
        return selar;
    }

    public void setSelar(String selar) {
        this.selar = selar;
    }

    @Column(length = 100, name = "GALANGAN")
    public String getGalangan() {
        return galangan;
    }

    public void setGalangan(String galangan) {
        this.galangan = galangan;
    }

    @Column(length = 100, name = "KELAS")
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Column(length = 4, name = "TAHUN")
    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    @Column(length = 100, name = "MANUFAKTUR")
    public String getManufaktur() {
        return manufaktur;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    @Column(length = 10, name = "PANJANG")
    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    @Column(length = 10, name = "LEBAR")
    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    @Column(length = 10, name = "TINGGI")
    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    @Column(length = 10, name = "ISI_KOTOR")
    public Double getIsiKotor() {
        return isiKotor;
    }

    public void setIsiKotor(Double isiKotor) {
        this.isiKotor = isiKotor;
    }

    @Column(length = 10, name = "ISI_BERSIH")
    public Double getIsiBersih() {
        return isiBersih;
    }

    public void setIsiBersih(Double isiBersih) {
        this.isiBersih = isiBersih;
    }

    @Column(length = 100, name = "MESIN_MERK_1")
    public String getMesinMerk1() {
        return mesinMerk1;
    }

    public void setMesinMerk1(String mesinMerk1) {
        this.mesinMerk1 = mesinMerk1;
    }

    @Column(length = 100, name = "MESIN_MERK_2")
    public String getMesinMerk2() {
        return mesinMerk2;
    }

    public void setMesinMerk2(String mesinMerk2) {
        this.mesinMerk2 = mesinMerk2;
    }

    @Column(length = 100, name = "MESIN_MERK_3")
    public String getMesinMerk3() {
        return mesinMerk3;
    }

    public void setMesinMerk3(String mesinMerk3) {
        this.mesinMerk3 = mesinMerk3;
    }

    @Column(length = 100, name = "MESIN_NOMOR_1")
    public String getMesinNomor1() {
        return mesinNomor1;
    }

    public void setMesinNomor1(String mesinNomor1) {
        this.mesinNomor1 = mesinNomor1;
    }

    @Column(length = 100, name = "MESIN_NOMOR_2")
    public String getMesinNomor2() {
        return mesinNomor2;
    }

    public void setMesinNomor2(String mesinNomor2) {
        this.mesinNomor2 = mesinNomor2;
    }

    @Column(length = 100, name = "MESIN_NOMOR_3")
    public String getMesinNomor3() {
        return mesinNomor3;
    }

    public void setMesinNomor3(String mesinNomor3) {
        this.mesinNomor3 = mesinNomor3;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_1")
    public String getMesinKapasitas1() {
        return mesinKapasitas1;
    }

    public void setMesinKapasitas1(String mesinKapasitas1) {
        this.mesinKapasitas1 = mesinKapasitas1;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_2")
    public String getMesinKapasitas2() {
        return mesinKapasitas2;
    }

    public void setMesinKapasitas2(String mesinKapasitas2) {
        this.mesinKapasitas2 = mesinKapasitas2;
    }

    @Column(length = 100, name = "MESIN_KAPASITAS_3")
    public String getMesinKapasitas3() {
        return mesinKapasitas3;
    }

    public void setMesinKapasitas3(String mesinKapasitas3) {
        this.mesinKapasitas3 = mesinKapasitas3;
    }

    @Column(length = 100, name = "MESIN_BACKUP_MERK_1")
    public String getMesinBackupMerk1() {
        return mesinBackupMerk1;
    }

    public void setMesinBackupMerk1(String mesinBackupMerk1) {
        this.mesinBackupMerk1 = mesinBackupMerk1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_MERK_2")
    public String getMesinBackupMerk2() {
        return mesinBackupMerk2;
    }

    public void setMesinBackupMerk2(String mesinBackupMerk2) {
        this.mesinBackupMerk2 = mesinBackupMerk2;
    }

    @Column(length = 100, name = "MESIN_BACKUP_NOMOR_1")
    public String getMesinBackupNomor1() {
        return mesinBackupNomor1;
    }

    public void setMesinBackupNomor1(String mesinBackupNomor1) {
        this.mesinBackupNomor1 = mesinBackupNomor1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_NOMOR_2")
    public String getMesinBackupNomor2() {
        return mesinBackupNomor2;
    }

    public void setMesinBackupNomor2(String mesinBackupNomor2) {
        this.mesinBackupNomor2 = mesinBackupNomor2;
    }

    @Column(length = 100, name = "MESIN_BACKUP_KAPASITAS_1")
    public String getMesinBackupKapasitas1() {
        return mesinBackupKapasitas1;
    }

    public void setMesinBackupKapasitas1(String mesinBackupKapasitas1) {
        this.mesinBackupKapasitas1 = mesinBackupKapasitas1;
    }

    @Column(length = 100, name = "MESIN_BACKUP_KAPASITAS_2")
    public String getMesinBackupKapasitas2() {
        return mesinBackupKapasitas2;
    }

    public void setMesinBackupKapasitas2(String mesinBackupKapasitas2) {
        this.mesinBackupKapasitas2 = mesinBackupKapasitas2;
    }

    @Column(length = 100, name = "JENIS_KAPAL")
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Column(length = 50, name = "NO_GROSS_AKTA")
    public String getNoGrossAkta() {
        return noGrossAkta;
    }

    public void setNoGrossAkta(String noGrossAkta) {
        this.noGrossAkta = noGrossAkta;
    }

    @Column(name = "TANGGAL_GROSS_AKTA")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalGrossAkta() {
        return tanggalGrossAkta;
    }

    public void setTanggalGrossAkta(Date tanggalGrossAkta) {
        this.tanggalGrossAkta = tanggalGrossAkta;
    }

    @Column(length = 50, name = "NO_SURAT_UKUR")
    public String getNoSuratUkur() {
        return noSuratUkur;
    }

    public void setNoSuratUkur(String noSuratUkur) {
        this.noSuratUkur = noSuratUkur;
    }

    @Column(name = "TANGGAL_SURAT_UKUR")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSuratUkur() {
        return tanggalSuratUkur;
    }

    public void setTanggalSuratUkur(Date tanggalSuratUkur) {
        this.tanggalSuratUkur = tanggalSuratUkur;
    }

    @Column(length = 50, name = "NO_SERT_LAMBUNG")
    public String getNoSertifikatLambung() {
        return noSertifikatLambung;
    }

    public void setNoSertifikatLambung(String noSertifikatLambung) {
        this.noSertifikatLambung = noSertifikatLambung;
    }

    @Column(name = "TANGGAL_SERT_LAMBUNG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSertifikatLambung() {
        return tanggalSertifikatLambung;
    }

    public void setTanggalSertifikatLambung(Date tanggalSertifikatLambung) {
        this.tanggalSertifikatLambung = tanggalSertifikatLambung;
    }

    @Column(name = "EXPIRED_SERT_LAMBUNG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getExpiredSertifikatLambung() {
        return expiredSertifikatLambung;
    }

    public void setExpiredSertifikatLambung(Date expiredSertifikatLambung) {
        this.expiredSertifikatLambung = expiredSertifikatLambung;
    }

    @Column(length = 50, name = "NO_SERT_GARIS")
    public String getNoSertifikatGaris() {
        return noSertifikatGaris;
    }

    public void setNoSertifikatGaris(String noSertifikatGaris) {
        this.noSertifikatGaris = noSertifikatGaris;
    }

    @Column(name = "TANGGAL_SERT_GARIS")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSertifikatGaris() {
        return tanggalSertifikatGaris;
    }

    public void setTanggalSertifikatGaris(Date tanggalSertifikatGaris) {
        this.tanggalSertifikatGaris = tanggalSertifikatGaris;
    }

    @Column(length = 50, name = "NO_SERT_MESIN")
    public String getNoSertifikatMesin() {
        return noSertifikatMesin;
    }

    public void setNoSertifikatMesin(String noSertifikatMesin) {
        this.noSertifikatMesin = noSertifikatMesin;
    }

    @Column(name = "TANGGAL_SERT_MESIN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalSertifikatMesin() {
        return tanggalSertifikatMesin;
    }

    public void setTanggalSertifikatMesin(Date tanggalSertifikatMesin) {
        this.tanggalSertifikatMesin = tanggalSertifikatMesin;
    }

    @Column(name = "EXPIRED_SERT_MESIN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getExpiredSertifikatMesin() {
        return expiredSertifikatMesin;
    }

    public void setExpiredSertifikatMesin(Date expiredSertifikatMesin) {
        this.expiredSertifikatMesin = expiredSertifikatMesin;
    }

    @Column(name = "PROSENTASE_LIKUIDASI")
    public Double getLikuidasi() {
        return likuidasi;
    }

    public void setLikuidasi(Double likuidasi) {
        this.likuidasi = likuidasi;
    }

    @Column(name = "HITUNG_MANUAL")
    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    @Column(name = "BERI_NILAI_DOC")
    public Boolean getBeriNilaiDoc() {
        return beriNilaiDoc;
    }

    public void setBeriNilaiDoc(Boolean beriNilaiDoc) {
        this.beriNilaiDoc = beriNilaiDoc;
    }

    @Column(name = "BERI_NILAI_FISIK")
    public Boolean getBeriNilaiFisik() {
        return beriNilaiFisik;
    }

    public void setBeriNilaiFisik(Boolean beriNilaiFisik) {
        this.beriNilaiFisik = beriNilaiFisik;
    }

    @Column(name = "NILAI_DOC_PASAR")
    public BigDecimal getNilaiDocPasar() {
        return nilaiDocPasar;
    }

    public void setNilaiDocPasar(BigDecimal nilaiDocPasar) {
        this.nilaiDocPasar = nilaiDocPasar;
    }

    @Column(name = "NILAI_FISIK_PASAR")
    public BigDecimal getNilaiFisikPasar() {
        return nilaiFisikPasar;
    }

    public void setNilaiFisikPasar(BigDecimal nilaiFisikPasar) {
        this.nilaiFisikPasar = nilaiFisikPasar;
    }

    @Column(name = "NILAI_DOC_LIKUIDASI")
    public BigDecimal getNilaiDocLikuidasi() {
        return nilaiDocLikuidasi;
    }

    public void setNilaiDocLikuidasi(BigDecimal nilaiDocLikuidasi) {
        this.nilaiDocLikuidasi = nilaiDocLikuidasi;
    }

    @Column(name = "NILAI_FISIK_LIKUIDASI")
    public BigDecimal getNilaiFisikLikuidasi() {
        return nilaiFisikLikuidasi;
    }

    public void setNilaiFisikLikuidasi(BigDecimal nilaiFisikLikuidasi) {
        this.nilaiFisikLikuidasi = nilaiFisikLikuidasi;
    }

    @Column(name = "PROSENTASE_LIKUIDASI_EKS")
    public Double getLikuidasiEks() {
        return likuidasiEks;
    }

    public void setLikuidasiEks(Double likuidasiEks) {
        this.likuidasiEks = likuidasiEks;
    }

    @Column(name = "HITUNG_MANUAL_EKS")
    public Boolean getManualEks() {
        return manualEks;
    }

    public void setManualEks(Boolean manualEks) {
        this.manualEks = manualEks;
    }

    @Column(name = "BERI_NILAI_DOC_EKS")
    public Boolean getBeriNilaiDocEks() {
        return beriNilaiDocEks;
    }

    public void setBeriNilaiDocEks(Boolean beriNilaiDocEks) {
        this.beriNilaiDocEks = beriNilaiDocEks;
    }

    @Column(name = "BERI_NILAI_FISIK_EKS")
    public Boolean getBeriNilaiFisikEks() {
        return beriNilaiFisikEks;
    }

    public void setBeriNilaiFisikEks(Boolean beriNilaiFisikEks) {
        this.beriNilaiFisikEks = beriNilaiFisikEks;
    }

    @Column(name = "NILAI_DOC_PASAR_EKS")
    public BigDecimal getNilaiDocPasarEks() {
        return nilaiDocPasarEks;
    }

    public void setNilaiDocPasarEks(BigDecimal nilaiDocPasarEks) {
        this.nilaiDocPasarEks = nilaiDocPasarEks;
    }

    @Column(name = "NILAI_FISIK_PASAR_EKS")
    public BigDecimal getNilaiFisikPasarEks() {
        return nilaiFisikPasarEks;
    }

    public void setNilaiFisikPasarEks(BigDecimal nilaiFisikPasarEks) {
        this.nilaiFisikPasarEks = nilaiFisikPasarEks;
    }

    @Column(name = "NILAI_DOC_LIKUIDASI_EKS")
    public BigDecimal getNilaiDocLikuidasiEks() {
        return nilaiDocLikuidasiEks;
    }

    public void setNilaiDocLikuidasiEks(BigDecimal nilaiDocLikuidasiEks) {
        this.nilaiDocLikuidasiEks = nilaiDocLikuidasiEks;
    }

    @Column(name = "NILAI_FISIK_LIKUIDASI_EKS")
    public BigDecimal getNilaiFisikLikuidasiEks() {
        return nilaiFisikLikuidasiEks;
    }

    public void setNilaiFisikLikuidasiEks(BigDecimal nilaiFisikLikuidasiEks) {
        this.nilaiFisikLikuidasiEks = nilaiFisikLikuidasiEks;
    }
}