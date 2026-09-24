package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import com.permata.appraisal.util.ListUtils;
import jakarta.persistence.CascadeType;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_TANAH_BANGUNAN")
public class LpaTanahBangunan extends EntityBase<Long> {

    private Long id;
    private String appraisalTypeCategory;
    //    private String lpaNumber;
//    private DataDetail detail;
    private LpaUmum lpaUmum;

//    private Long commonId;
//    private Long branchId;
//    private Long jenisAktiva;
//    private Long statusJaminan;
//    private Long surveyId;
//    private String jenisAppraisal;
//    private String orderNumber;
//    private String contactPerson;
//    private String namaDebitur;
//    private String jenisObjectPenilain;
//    private String namaPerumahan;
//    private String namaCluster;
//    private String block;
//    private String nomor;
//    private String rt;
//    private String rw;
//    private String kodePos;
//    private String propinsi;
//    private String kota;
//    private String kecamatan;
//    private String kelurahan;
//    private Date tanggalOrder;
//    private Long kategoriSla;
//    private String ditujuke;
//    private String jenisObjectPenilaiFisik;
//    private String lokasiFisik;
//    private String posisiLokasiAgunan;
//    private Date tanggalSurvey;
//    private String ditinjau;
//    private String ditemui;
//    private String catatanSurvey;
//    private String mataUang;
//    private Date tanggalRate;
//    private BigDecimal nilaiRate;
//    private Boolean draft;

    // data Faktor Market
//    private String faktorMarketability;
//    private String faktorMarketCatatan;

    // data Negative List
//    private List<Parameter> listNegative;
//    private List<Parameter> listPertimbangan;
//    private String positifPoint;
//    private String catatanPoint;

    // data perbandingan
//    private String pembanding1;
//    private String pembanding2;
//    private String pembanding3;

    // data agunan internal
    private BigDecimal hargaTanah;
    private BigDecimal hargaBangunan;
    private String uraian1;
    private Boolean hitungManual1;
    private BigDecimal nilaiDokumen1;
    private Boolean diberiNilaiDokumen1;
    private BigDecimal nilaiFisik1;
    private Boolean diberiNilaiFisik1;
    private Double prosentase1;
    private Boolean hitungManual2;
    private String uraian2;
    private BigDecimal nilaiDokumen2;
    private Boolean diberiNilaiDokumen2;
    private BigDecimal nilaiFisik2;
    private Boolean diberiNilaiFisik2;
    private Double prosentase2;
    private BigDecimal totalSesuaiDokumen;
    private BigDecimal totalSesuaiFisik;
    private BigDecimal likuidasiDokumen1;
    private BigDecimal likuidasiFisik1;
    private BigDecimal likuidasiDokumen2;
    private BigDecimal likuidasiFisik2;
    private BigDecimal totalLikuidasiDokumen;
    private BigDecimal totalLikuidasiFisik;
    private BigDecimal toleransi1;
    private BigDecimal toleransi2;

    // data agunan Eksternal
    private BigDecimal hargaTanahEks;
    private BigDecimal hargaBangunanEks;
    private Boolean hitungManualEks;
    private String uraian1Eks;
    private BigDecimal nilaiDokumen1Eks;
    private Boolean diberiNilaiDokumen1Eks;
    private BigDecimal nilaiFisik1Eks;
    private Boolean diberiNilaiFisik1Eks;
    private Double prosentase1Eks;
    private String uraian2Eks;
    private BigDecimal nilaiDokumen2Eks;
    private Boolean diberiNilaiDokumen2Eks;
    private BigDecimal nilaiFisik2Eks;
    private Boolean diberiNilaiFisik2Eks;
    private Double prosentase2Eks;
    private BigDecimal totalSesuaiDokumenEks;
    private BigDecimal totalSesuaiFisikEks;
    private BigDecimal likuidasiDokumen1Eks;
    private BigDecimal likuidasiFisik1Eks;
    private BigDecimal likuidasiDokumen2Eks;
    private BigDecimal likuidasiFisik2Eks;
    private BigDecimal totalLikuidasiDokumenEks;
    private BigDecimal totalLikuidasiFisikEks;
    private BigDecimal toleransi1Eks;
    private BigDecimal toleransi2Eks;

    // data tanah
    private Double totalLuasTanahDokumen;
    private String bentukTanah;
    private String konturTanah;
    private String ketinggianTanah;
    private String peruntukanTanah;
    private String batasTanah;
    private String batasUtaraTanah;
    private String batasSelatanTanah;
    private String batasBaratTanah;
    private String batasTimurTanah;
    private String posisiTanah;
    private String kondisiTanah;
    private String jenisTanah;
    private Double luasTanahSesuaiTataKota;

    // data bangunan fisik
    private Double luasBangunanImb;
    private Double luasLantai1;
    private Double luasLantai2;
    private Double luasLantai3;
    private Double luasLantai4;
    private Double luasLantai5;
    private Double luasBangunan;
    private Integer jumlahLantaiFisik;
    private Integer jumlahLantaiTampakDepan;
    private String jenisBangunan;
    private String digunakanSebagai;
    private String dihuniOleh;
    private String statusAgunanDisewakan;
    private Integer tahunDibangun;
    private Integer tahunDirenov;
    private String kelasBangunan;
    private String kondisiUmum;
    private String prosesPembangunan;
    private String statusBangunan;
    private Double prosesKonstruksi;
    private Date tanggalProsesKonstruksi;
    private Boolean hitungManual;
    private String peruntukanBangunan;

    // data lingkungan
    private String lingkunganSekitar;
    private String tingkatKepadatan;
    private String tingkatKemacetan;
    private String rencanaJalan;
    private Double lebarJalan;
    private Double gsb;
    private Double gss;
    private String kendaraanRoda4;

    private String readDocTanah;
    private String readDocBangunan;



    private List<LpaTanah> documentTanah;
    private List<LpaBangunan> documentBangunan;

    public LpaTanahBangunan() {
    }

    public LpaTanahBangunan(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_TANAH_BANGUNAN_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_TANAH_BANGUNAN_SEQ", sequenceName = "LPA_TANAH_BANGUNAN_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ID_DATA_DETAIL")
//    public DataDetail getDetail() {
//        return detail;
//    }
//
//    public void setDetail(DataDetail detail) {
//        this.detail = detail;
//    }


    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_LPA_UMUM")
    public LpaUmum getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(LpaUmum lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "common", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<LpaTanah> getDocumentTanah() {
        return documentTanah;
    }

    public void addDocumentTanah(LpaTanah docTanah) {
        if (ListUtils.isEmpty(documentTanah)) {
            documentTanah = new ArrayList<LpaTanah>();
        }
        docTanah.setCommon(this);
        documentTanah.add(docTanah);
    }

    public void setDocumentTanah(List<LpaTanah> documentTanah) {
        this.documentTanah = documentTanah;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "common", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<LpaBangunan> getDocumentBangunan() {
        return documentBangunan;
    }

    public void addDocumentBangunan(LpaBangunan docTanah) {
        if (ListUtils.isEmpty(documentBangunan)) {
            documentBangunan = new ArrayList<LpaBangunan>();
        }
        docTanah.setCommon(this);
        documentBangunan.add(docTanah);
    }

    public void setDocumentBangunan(List<LpaBangunan> documentBangunan) {
        this.documentBangunan = documentBangunan;
    }

    @Column(name = "TOTAL_LUAS_TANAH_DOC")
    public Double getTotalLuasTanahDokumen() {
        return totalLuasTanahDokumen;
    }

    public void setTotalLuasTanahDokumen(Double totalLuasTanahDokumen) {
        this.totalLuasTanahDokumen = totalLuasTanahDokumen;
    }

    @Column(name = "KATEGORI_JENIS_APPRAISAL", length = 50)
    public String getAppraisalTypeCategory() {
        return appraisalTypeCategory;
    }

    public void setAppraisalTypeCategory(String appraisalTypeCategory) {
        this.appraisalTypeCategory = appraisalTypeCategory;
    }

//    @Column(name = "ID_SURVEY", nullable = true)
//    public Long getSurveyId() {
//        return surveyId;
//    }
//
//    public void setSurveyId(Long surveyId) {
//        this.surveyId = surveyId;
//    }
//
//    @Column(name = "NO_LPA")
//    public String getLpaNumber() {
//        return lpaNumber;
//    }
//
//    public void setLpaNumber(String lpaNumber) {
//        this.lpaNumber = lpaNumber;
//    }
//
//    @Column(name = "ID_DATA_UMUM")
//    public Long getCommonId() {
//        return commonId;
//    }
//
//    public void setCommonId(Long commonId) {
//        this.commonId = commonId;
//    }
//
//    @Column(name = "JENIS_OBJECT_FISIK")
//    public String getJenisObjectPenilaiFisik() {
//        return jenisObjectPenilaiFisik;
//    }
//
//    public void setJenisObjectPenilaiFisik(String jenisObjectPenilaiFisik) {
//        this.jenisObjectPenilaiFisik = jenisObjectPenilaiFisik;
//    }
//
//    @Column(name = "ID_APP_CABANG")
//    public Long getBranchId() {
//        return branchId;
//    }
//
//    public void setBranchId(Long branchId) {
//        this.branchId = branchId;
//    }
//
//    @Column(name = "LOKASI_FISIK")
//    public String getLokasiFisik() {
//        return lokasiFisik;
//    }
//
//    public void setLokasiFisik(String lokasiFisik) {
//        this.lokasiFisik = lokasiFisik;
//    }
//
//    @Column(name = "POSISI_LOKASI_AGUNAN")
//    public String getPosisiLokasiAgunan() {
//        return posisiLokasiAgunan;
//    }
//
//    public void setPosisiLokasiAgunan(String posisiLokasiAgunan) {
//        this.posisiLokasiAgunan = posisiLokasiAgunan;
//    }
//
//    @Column(name = "TANGGAL_SURVEY")
//    public Date getTanggalSurvey() {
//        return tanggalSurvey;
//    }
//
//    public void setTanggalSurvey(Date tanggalSurvey) {
//        this.tanggalSurvey = tanggalSurvey;
//    }
//
//    @Column(name = "DITINJAU")
//    public String getDitinjau() {
//        return ditinjau;
//    }
//
//    public void setDitinjau(String ditinjau) {
//        this.ditinjau = ditinjau;
//    }
//
//    @Column(name = "DITEMUI")
//    public String getDitemui() {
//        return ditemui;
//    }
//
//    public void setDitemui(String ditemui) {
//        this.ditemui = ditemui;
//    }
//
//    @Column(name = "CATATAN_SURVEY")
//    public String getCatatanSurvey() {
//        return catatanSurvey;
//    }
//
//    public void setCatatanSurvey(String catatanSurvey) {
//        this.catatanSurvey = catatanSurvey;
//    }
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @Cascade({CascadeType.SAVE_UPDATE})
//    @JoinTable(name = "LPA_NEGATIF_POINT", joinColumns = @JoinColumn(name = "ID_PARAMETER"),
//            inverseJoinColumns = @JoinColumn(name = "ID_LPA"))
//    public List<Parameter> getListNegative() {
//        return listNegative;
//    }
//
//    public void addListNegative(Parameter param) {
//        if (ListUtils.isEmpty(listNegative)) {
//            listNegative = new ArrayList<Parameter>();
//        }
//        listNegative.add(param);
//    }
//
//    public void setListNegative(List<Parameter> listNegative) {
//        this.listNegative = listNegative;
//    }
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @Cascade({CascadeType.SAVE_UPDATE})
//    @JoinTable(name = "LPA_PERTIMBANGAN_KHUSUS", joinColumns = @JoinColumn(name = "ID_PARAMETER"),
//            inverseJoinColumns = @JoinColumn(name = "ID_LPA"))
//    public List<Parameter> getListPertimbangan() {
//        return listPertimbangan;
//    }
//
//    public void addPertimbangan(Parameter param) {
//        if (ListUtils.isEmpty(listPertimbangan)) {
//            listPertimbangan = new ArrayList<Parameter>();
//        }
//        listPertimbangan.add(param);
//    }
//
//    public void setListPertimbangan(List<Parameter> listPertimbangan) {
//        this.listPertimbangan = listPertimbangan;
//    }
//
//    @Column(name = "POSITIF_POINT")
//    public String getPositifPoint() {
//        return positifPoint;
//    }
//
//    public void setPositifPoint(String positifPoint) {
//        this.positifPoint = positifPoint;
//    }
//
//    @Column(name = "CATATAN_POINT")
//    public String getCatatanPoint() {
//        return catatanPoint;
//    }
//
//    public void setCatatanPoint(String catatanPoint) {
//        this.catatanPoint = catatanPoint;
//    }
//
//    @Column(name = "FAKTOR_MARKETABILITY")
//    public String getFaktorMarketability() {
//        return faktorMarketability;
//    }
//
//    public void setFaktorMarketability(String faktorMarketability) {
//        this.faktorMarketability = faktorMarketability;
//    }
//
//    @Column(name = "FAKTOR_MARKET_CATATAN")
//    public String getFaktorMarketCatatan() {
//        return faktorMarketCatatan;
//    }
//
//    public void setFaktorMarketCatatan(String faktorMarketCatatan) {
//        this.faktorMarketCatatan = faktorMarketCatatan;
//    }
//
//    @Column(name = "PEMBANDING_1")
//    public String getPembanding1() {
//        return pembanding1;
//    }
//
//    public void setPembanding1(String pembanding1) {
//        this.pembanding1 = pembanding1;
//    }
//
//    @Column(name = "PEMBANDING_2")
//    public String getPembanding2() {
//        return pembanding2;
//    }
//
//    public void setPembanding2(String pembanding2) {
//        this.pembanding2 = pembanding2;
//    }
//
//    @Column(name = "PEMBANDING_3")
//    public String getPembanding3() {
//        return pembanding3;
//    }
//
//    public void setPembanding3(String pembanding3) {
//        this.pembanding3 = pembanding3;
//    }
//
//    @Column(name = "IS_DRAFT")
//    public Boolean getDraft() {
//        return draft;
//    }
//
//    public void setDraft(Boolean draft) {
//        this.draft = draft;
//    }

    @Column(name = "HARGA_TANAH")
    public BigDecimal getHargaTanah() {
        return hargaTanah;
    }

    public void setHargaTanah(BigDecimal hargaTanah) {
        this.hargaTanah = hargaTanah;
    }

    @Column(name = "HARGA_BANGUNAN")
    public BigDecimal getHargaBangunan() {
        return hargaBangunan;
    }

    public void setHargaBangunan(BigDecimal hargaBangunan) {
        this.hargaBangunan = hargaBangunan;
    }

    @Column(name = "URAIAN_1")
    public String getUraian1() {
        return uraian1;
    }

    public void setUraian1(String uraian1) {
        this.uraian1 = uraian1;
    }

    @Column(name = "NILAI_DOKUMEN_1")
    public BigDecimal getNilaiDokumen1() {
        return nilaiDokumen1;
    }

    public void setNilaiDokumen1(BigDecimal nilaiDokumen1) {
        this.nilaiDokumen1 = nilaiDokumen1;
    }

    @Column(name = "HITUNG_DOKUMEN_1")
    public Boolean getDiberiNilaiDokumen1() {
        return diberiNilaiDokumen1;
    }

    public void setDiberiNilaiDokumen1(Boolean diberiNilaiDokumen1) {
        this.diberiNilaiDokumen1 = diberiNilaiDokumen1;
    }

    @Column(name = "NILAI_FISIK_1")
    public BigDecimal getNilaiFisik1() {
        return nilaiFisik1;
    }

    public void setNilaiFisik1(BigDecimal nilaiFisik1) {
        this.nilaiFisik1 = nilaiFisik1;
    }

    @Column(name = "HITUNG_FISIK_1")
    public Boolean getDiberiNilaiFisik1() {
        return diberiNilaiFisik1;
    }

    public void setDiberiNilaiFisik1(Boolean diberiNilaiFisik1) {
        this.diberiNilaiFisik1 = diberiNilaiFisik1;
    }

    @Column(name = "PROSENTASE_1")
    public Double getProsentase1() {
        return prosentase1;
    }

    public void setProsentase1(Double prosentase1) {
        this.prosentase1 = prosentase1;
    }

    @Column(name = "HITUNG_MANUAL_1")
    public Boolean getHitungManual1() {
        return hitungManual1;
    }

    public void setHitungManual1(Boolean hitungManual1) {
        this.hitungManual1 = hitungManual1;
    }

    @Column(name = "HITUNG_MANUAL_2")
    public Boolean getHitungManual2() {
        return hitungManual2;
    }

    public void setHitungManual2(Boolean hitungManual2) {
        this.hitungManual2 = hitungManual2;
    }

    @Column(name = "URAIAN_2")
    public String getUraian2() {
        return uraian2;
    }

    public void setUraian2(String uraian2) {
        this.uraian2 = uraian2;
    }

    @Column(name = "NILAI_DOKUMEN_2")
    public BigDecimal getNilaiDokumen2() {
        return nilaiDokumen2;
    }

    public void setNilaiDokumen2(BigDecimal nilaiDokumen2) {
        this.nilaiDokumen2 = nilaiDokumen2;
    }

    @Column(name = "HITUNG_DOKUMEN_2")
    public Boolean getDiberiNilaiDokumen2() {
        return diberiNilaiDokumen2;
    }

    public void setDiberiNilaiDokumen2(Boolean diberiNilaiDokumen2) {
        this.diberiNilaiDokumen2 = diberiNilaiDokumen2;
    }

    @Column(name = "NILAI_FISIK_2")
    public BigDecimal getNilaiFisik2() {
        return nilaiFisik2;
    }

    public void setNilaiFisik2(BigDecimal nilaiFisik2) {
        this.nilaiFisik2 = nilaiFisik2;
    }

    @Column(name = "HITUNG_FISIK_2")
    public Boolean getDiberiNilaiFisik2() {
        return diberiNilaiFisik2;
    }

    public void setDiberiNilaiFisik2(Boolean diberiNilaiFisik2) {
        this.diberiNilaiFisik2 = diberiNilaiFisik2;
    }

    @Column(name = "PROSENTASE_2")
    public Double getProsentase2() {
        return prosentase2;
    }

    public void setProsentase2(Double prosentase2) {
        this.prosentase2 = prosentase2;
    }

    @Column(name = "BENTUK_TANAH")
    public String getBentukTanah() {
        return bentukTanah;
    }

    public void setBentukTanah(String bentukTanah) {
        this.bentukTanah = bentukTanah;
    }

    @Column(name = "KONTUR_TANAH")
    public String getKonturTanah() {
        return konturTanah;
    }

    public void setKonturTanah(String konturTanah) {
        this.konturTanah = konturTanah;
    }

    @Column(name = "KETINGGIAN_TANAH")
    public String getKetinggianTanah() {
        return ketinggianTanah;
    }

    public void setKetinggianTanah(String ketinggianTanah) {
        this.ketinggianTanah = ketinggianTanah;
    }

    @Column(name = "PERUNTUKAN_TANAH")
    public String getPeruntukanTanah() {
        return peruntukanTanah;
    }

    public void setPeruntukanTanah(String peruntukanTanah) {
        this.peruntukanTanah = peruntukanTanah;
    }

    @Column(name = "KESESUAIAN_BATAS")
    public String getBatasTanah() {
        return batasTanah;
    }

    public void setBatasTanah(String batasTanah) {
        this.batasTanah = batasTanah;
    }

    @Column(name = "BATAS_UTARA")
    public String getBatasUtaraTanah() {
        return batasUtaraTanah;
    }

    public void setBatasUtaraTanah(String batasUtaraTanah) {
        this.batasUtaraTanah = batasUtaraTanah;
    }

    @Column(name = "BATAS_SELATAN")
    public String getBatasSelatanTanah() {
        return batasSelatanTanah;
    }

    public void setBatasSelatanTanah(String batasSelatanTanah) {
        this.batasSelatanTanah = batasSelatanTanah;
    }

    @Column(name = "BATAS_BARAT")
    public String getBatasBaratTanah() {
        return batasBaratTanah;
    }

    public void setBatasBaratTanah(String batasBaratTanah) {
        this.batasBaratTanah = batasBaratTanah;
    }

    @Column(name = "BATAS_TIMUR")
    public String getBatasTimurTanah() {
        return batasTimurTanah;
    }

    public void setBatasTimurTanah(String batasTimurTanah) {
        this.batasTimurTanah = batasTimurTanah;
    }

    @Column(name = "POSISI_TANAH")
    public String getPosisiTanah() {
        return posisiTanah;
    }

    public void setPosisiTanah(String posisiTanah) {
        this.posisiTanah = posisiTanah;
    }

    @Column(name = "KONDISI_TANAH")
    public String getKondisiTanah() {
        return kondisiTanah;
    }

    public void setKondisiTanah(String kondisiTanah) {
        this.kondisiTanah = kondisiTanah;
    }

    @Column(name = "JENIS_TANAH")
    public String getJenisTanah() {
        return jenisTanah;
    }

    public void setJenisTanah(String jenisTanah) {
        this.jenisTanah = jenisTanah;
    }

    // double data
//    @Column(name = "ID_JENIS_AKTIVA")
//    public Long getJenisAktiva() {
//        return jenisAktiva;
//    }
//
//    public void setJenisAktiva(Long jenisAktiva) {
//        this.jenisAktiva = jenisAktiva;
//    }
//
//    @Column(name = "ID_STATUS_JAMINAN")
//    public Long getStatusJaminan() {
//        return statusJaminan;
//    }
//
//    public void setStatusJaminan(Long statusJaminan) {
//        this.statusJaminan = statusJaminan;
//    }
//
//    @Column(name = "JENIS_APPRAISAL")
//    public String getJenisAppraisal() {
//        return jenisAppraisal;
//    }
//
//    public void setJenisAppraisal(String jenisAppraisal) {
//        this.jenisAppraisal = jenisAppraisal;
//    }
//
//    @Column(name = "NOMOR_ORDER")
//    public String getOrderNumber() {
//        return orderNumber;
//    }
//
//    public void setOrderNumber(String orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    @Column(name = "NAMA_CONTACT")
//    public String getContactPerson() {
//        return contactPerson;
//    }
//
//    public void setContactPerson(String contactPerson) {
//        this.contactPerson = contactPerson;
//    }
//
//    @Column(name = "NAMA_DEBITUR")
//    public String getNamaDebitur() {
//        return namaDebitur;
//    }
//
//    public void setNamaDebitur(String namaDebitur) {
//        this.namaDebitur = namaDebitur;
//    }
//
//    @Column(name = "JENIS_OBJECT")
//    public String getJenisObjectPenilain() {
//        return jenisObjectPenilain;
//    }
//
//    public void setJenisObjectPenilain(String jenisObjectPenilain) {
//        this.jenisObjectPenilain = jenisObjectPenilain;
//    }
//
//    @Column(name = "NAMA_PERUMAHAN")
//    public String getNamaPerumahan() {
//        return namaPerumahan;
//    }
//
//    public void setNamaPerumahan(String namaPerumahan) {
//        this.namaPerumahan = namaPerumahan;
//    }
//
//    @Column(name = "NAMA_CLUSTER")
//    public String getNamaCluster() {
//        return namaCluster;
//    }
//
//    public void setNamaCluster(String namaCluster) {
//        this.namaCluster = namaCluster;
//    }
//
//    @Column(name = "BLOCK")
//    public String getBlock() {
//        return block;
//    }
//
//    public void setBlock(String block) {
//        this.block = block;
//    }
//
//    @Column(name = "NOMOR")
//    public String getNomor() {
//        return nomor;
//    }
//
//    public void setNomor(String nomor) {
//        this.nomor = nomor;
//    }
//
//    @Column(name = "RT")
//    public String getRt() {
//        return rt;
//    }
//
//    public void setRt(String rt) {
//        this.rt = rt;
//    }
//
//    @Column(name = "RW")
//    public String getRw() {
//        return rw;
//    }
//
//    public void setRw(String rw) {
//        this.rw = rw;
//    }
//
//    @Column(name = "KODE_POS")
//    public String getKodePos() {
//        return kodePos;
//    }
//
//    public void setKodePos(String kodePos) {
//        this.kodePos = kodePos;
//    }
//
//    @Column(name = "PROPINSI")
//    public String getPropinsi() {
//        return propinsi;
//    }
//
//    public void setPropinsi(String propinsi) {
//        this.propinsi = propinsi;
//    }
//
//    @Column(name = "KOTA")
//    public String getKota() {
//        return kota;
//    }
//
//    public void setKota(String kota) {
//        this.kota = kota;
//    }
//
//    @Column(name = "KECAMATAN")
//    public String getKecamatan() {
//        return kecamatan;
//    }
//
//    public void setKecamatan(String kecamatan) {
//        this.kecamatan = kecamatan;
//    }
//
//    @Column(name = "KELURAHAN")
//    public String getKelurahan() {
//        return kelurahan;
//    }
//
//    public void setKelurahan(String kelurahan) {
//        this.kelurahan = kelurahan;
//    }
//
//    @Column(name = "TANGGAL_ORDER")
//    public Date getTanggalOrder() {
//        return tanggalOrder;
//    }
//
//    public void setTanggalOrder(Date tanggalOrder) {
//        this.tanggalOrder = tanggalOrder;
//    }
//
//    @Column(name = "KATEGORI_SLA")
//    public Long getKategoriSla() {
//        return kategoriSla;
//    }
//
//    public void setKategoriSla(Long kategoriSla) {
//        this.kategoriSla = kategoriSla;
//    }
//
//    @Column(name = "DITUJU_KE")
//    public String getDitujuke() {
//        return ditujuke;
//    }
//
//    public void setDitujuke(String ditujuke) {
//        this.ditujuke = ditujuke;
//    }

    @Column(name = "LUAS_BANGUNAN_IMB")
    public Double getLuasBangunanImb() {
        return luasBangunanImb;
    }

    public void setLuasBangunanImb(Double luasBangunanImb) {
        this.luasBangunanImb = luasBangunanImb;
    }

    @Column(name = "LUAS_LANTAI_1")
    public Double getLuasLantai1() {
        return luasLantai1;
    }

    public void setLuasLantai1(Double luasLantai1) {
        this.luasLantai1 = luasLantai1;
    }

    @Column(name = "LUAS_LANTAI_2")
    public Double getLuasLantai2() {
        return luasLantai2;
    }

    public void setLuasLantai2(Double luasLantai2) {
        this.luasLantai2 = luasLantai2;
    }

    @Column(name = "LUAS_LANTAI_3")
    public Double getLuasLantai3() {
        return luasLantai3;
    }

    public void setLuasLantai3(Double luasLantai3) {
        this.luasLantai3 = luasLantai3;
    }

    @Column(name = "LUAS_LANTAI_4")
    public Double getLuasLantai4() {
        return luasLantai4;
    }

    public void setLuasLantai4(Double luasLantai4) {
        this.luasLantai4 = luasLantai4;
    }

    @Column(name = "LUAS_LANTAI_5")
    public Double getLuasLantai5() {
        return luasLantai5;
    }

    public void setLuasLantai5(Double luasLantai5) {
        this.luasLantai5 = luasLantai5;
    }

    @Column(name = "LUAS_BANGUNAN")
    public Double getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(Double luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    @Column(name = "JML_LANTAI_FISIK")
    public Integer getJumlahLantaiFisik() {
        return jumlahLantaiFisik;
    }

    public void setJumlahLantaiFisik(Integer jumlahLantaiFisik) {
        this.jumlahLantaiFisik = jumlahLantaiFisik;
    }

    @Column(name = "JML_LANTAI_DEPAN")
    public Integer getJumlahLantaiTampakDepan() {
        return jumlahLantaiTampakDepan;
    }

    public void setJumlahLantaiTampakDepan(Integer jumlahLantaiTampakDepan) {
        this.jumlahLantaiTampakDepan = jumlahLantaiTampakDepan;
    }

    @Column(name = "JENIS_BANGUNAN")
    public String getJenisBangunan() {
        return jenisBangunan;
    }

    public void setJenisBangunan(String jenisBangunan) {
        this.jenisBangunan = jenisBangunan;
    }

    @Column(name = "DIGUNAKAN_SEBAGAI")
    public String getDigunakanSebagai() {
        return digunakanSebagai;
    }

    public void setDigunakanSebagai(String digunakanSebagai) {
        this.digunakanSebagai = digunakanSebagai;
    }

    @Column(name = "DIHUNI_OLEH")
    public String getDihuniOleh() {
        return dihuniOleh;
    }

    public void setDihuniOleh(String dihuniOleh) {
        this.dihuniOleh = dihuniOleh;
    }

    @Column(name = "STATUS_AGUNAN")
    public String getStatusAgunanDisewakan() {
        return statusAgunanDisewakan;
    }

    public void setStatusAgunanDisewakan(String statusAgunanDisewakan) {
        this.statusAgunanDisewakan = statusAgunanDisewakan;
    }

    @Column(name = "TAHUN_DIBANGUN")
    public Integer getTahunDibangun() {
        return tahunDibangun;
    }

    public void setTahunDibangun(Integer tahunDibangun) {
        this.tahunDibangun = tahunDibangun;
    }

    @Column(name = "TAHUN_RENOVASI")
    public Integer getTahunDirenov() {
        return tahunDirenov;
    }

    public void setTahunDirenov(Integer tahunDirenov) {
        this.tahunDirenov = tahunDirenov;
    }

    @Column(name = "KELAS_BANGUNGAN")
    public String getKelasBangunan() {
        return kelasBangunan;
    }

    public void setKelasBangunan(String kelasBangunan) {
        this.kelasBangunan = kelasBangunan;
    }

    @Column(name = "KONDISI_UMUM")
    public String getKondisiUmum() {
        return kondisiUmum;
    }

    public void setKondisiUmum(String kondisiUmum) {
        this.kondisiUmum = kondisiUmum;
    }

    @Column(name = "PROSES_PEMBANGUNAN")
    public String getProsesPembangunan() {
        return prosesPembangunan;
    }

    public void setProsesPembangunan(String prosesPembangunan) {
        this.prosesPembangunan = prosesPembangunan;
    }

    @Column(name = "STATUS_BANGUNAN")
    public String getStatusBangunan() {
        return statusBangunan;
    }

    public void setStatusBangunan(String statusBangunan) {
        this.statusBangunan = statusBangunan;
    }

    @Column(name = "PROSES_KONSTRUKSI")
    public Double getProsesKonstruksi() {
        return prosesKonstruksi;
    }

    public void setProsesKonstruksi(Double prosesKonstruksi) {
        this.prosesKonstruksi = prosesKonstruksi;
    }

    @Column(name = "TANGGAL_KONSTRUKSI")
    public Date getTanggalProsesKonstruksi() {
        return tanggalProsesKonstruksi;
    }

    public void setTanggalProsesKonstruksi(Date tanggalProsesKonstruksi) {
        this.tanggalProsesKonstruksi = tanggalProsesKonstruksi;
    }

    @Column(name = "HITUNG_MANUAL")
    public Boolean getHitungManual() {
        return hitungManual;
    }

    public void setHitungManual(Boolean hitungManual) {
        this.hitungManual = hitungManual;
    }

    // data lingkungan
    @Column(name = "LINGKUNGAN_SEKITAR")
    public String getLingkunganSekitar() {
        return lingkunganSekitar;
    }

    public void setLingkunganSekitar(String lingkunganSekitar) {
        this.lingkunganSekitar = lingkunganSekitar;
    }

    @Column(name = "TINGKAT_KEPADATAN")
    public String getTingkatKepadatan() {
        return tingkatKepadatan;
    }

    public void setTingkatKepadatan(String tingkatKepadatan) {
        this.tingkatKepadatan = tingkatKepadatan;
    }

    @Column(name = "TINGKAT_KEMACETAN")
    public String getTingkatKemacetan() {
        return tingkatKemacetan;
    }

    public void setTingkatKemacetan(String tingkatKemacetan) {
        this.tingkatKemacetan = tingkatKemacetan;
    }

    @Column(name = "RENCANA_JALAN")
    public String getRencanaJalan() {
        return rencanaJalan;
    }

    public void setRencanaJalan(String rencanaJalan) {
        this.rencanaJalan = rencanaJalan;
    }

    @Column(name = "LEBAR_JALAN")
    public Double getLebarJalan() {
        return lebarJalan;
    }

    public void setLebarJalan(Double lebarJalan) {
        this.lebarJalan = lebarJalan;
    }

    @Column(name = "GSB")
    public Double getGsb() {
        return gsb;
    }

    public void setGsb(Double gsb) {
        this.gsb = gsb;
    }

    @Column(name = "GSS")
    public Double getGss() {
        return gss;
    }

    public void setGss(Double gss) {
        this.gss = gss;
    }

    @Column(name = "KENDARAAN_RODA_4")
    public String getKendaraanRoda4() {
        return kendaraanRoda4;
    }

    public void setKendaraanRoda4(String kendaraanRoda4) {
        this.kendaraanRoda4 = kendaraanRoda4;
    }

    @Column(name = "TOTAL_SESUAI_DOC")
    public BigDecimal getTotalSesuaiDokumen() {
        return totalSesuaiDokumen;
    }

    public void setTotalSesuaiDokumen(BigDecimal totalSesuaiDokumen) {
        this.totalSesuaiDokumen = totalSesuaiDokumen;
    }

    @Column(name = "TOTAL_SESUAI_FISIK")
    public BigDecimal getTotalSesuaiFisik() {
        return totalSesuaiFisik;
    }

    public void setTotalSesuaiFisik(BigDecimal totalSesuaiFisik) {
        this.totalSesuaiFisik = totalSesuaiFisik;
    }

    @Column(name = "LIKUIDASI_DOC_1")
    public BigDecimal getLikuidasiDokumen1() {
        return likuidasiDokumen1;
    }

    public void setLikuidasiDokumen1(BigDecimal likuidasiDokumen1) {
        this.likuidasiDokumen1 = likuidasiDokumen1;
    }

    @Column(name = "LIKUIDASI_FISIK_1")
    public BigDecimal getLikuidasiFisik1() {
        return likuidasiFisik1;
    }

    public void setLikuidasiFisik1(BigDecimal likuidasiFisik1) {
        this.likuidasiFisik1 = likuidasiFisik1;
    }

    @Column(name = "LIKUIDASI_DOC_2")
    public BigDecimal getLikuidasiDokumen2() {
        return likuidasiDokumen2;
    }

    public void setLikuidasiDokumen2(BigDecimal likuidasiDokumen2) {
        this.likuidasiDokumen2 = likuidasiDokumen2;
    }

    @Column(name = "LIKUIDASI_FISIK_2")
    public BigDecimal getLikuidasiFisik2() {
        return likuidasiFisik2;
    }

    public void setLikuidasiFisik2(BigDecimal likuidasiFisik2) {
        this.likuidasiFisik2 = likuidasiFisik2;
    }

    @Column(name = "TOTAL_LIKUIDASI_DOC")
    public BigDecimal getTotalLikuidasiDokumen() {
        return totalLikuidasiDokumen;
    }

    public void setTotalLikuidasiDokumen(BigDecimal totalLikuidasiDokumen) {
        this.totalLikuidasiDokumen = totalLikuidasiDokumen;
    }

    @Column(name = "TOTAL_LIKUIDASI_FISIK")
    public BigDecimal getTotalLikuidasiFisik() {
        return totalLikuidasiFisik;
    }

    public void setTotalLikuidasiFisik(BigDecimal totalLikuidasiFisik) {
        this.totalLikuidasiFisik = totalLikuidasiFisik;
    }

    @Column(name = "TOLERANSI_1")
    public BigDecimal getToleransi1() {
        return toleransi1;
    }

    public void setToleransi1(BigDecimal toleransi1) {
        this.toleransi1 = toleransi1;
    }

    @Column(name = "TOLERANSI_2")
    public BigDecimal getToleransi2() {
        return toleransi2;
    }

    public void setToleransi2(BigDecimal toleransi2) {
        this.toleransi2 = toleransi2;
    }

    @Column(name = "HARGA_TANAH_EKS")
    public BigDecimal getHargaTanahEks() {
        return hargaTanahEks;
    }

    public void setHargaTanahEks(BigDecimal hargaTanahEks) {
        this.hargaTanahEks = hargaTanahEks;
    }

    @Column(name = "HARGA_BANGUNAN_EKS")
    public BigDecimal getHargaBangunanEks() {
        return hargaBangunanEks;
    }

    public void setHargaBangunanEks(BigDecimal hargaBangunanEks) {
        this.hargaBangunanEks = hargaBangunanEks;
    }

    @Column(name = "HITUNG_MANUAL_EKS")
    public Boolean getHitungManualEks() {
        return hitungManualEks;
    }

    public void setHitungManualEks(Boolean hitungManualEks) {
        this.hitungManualEks = hitungManualEks;
    }

    @Column(name = "URAIAN_1_EKS")
    public String getUraian1Eks() {
        return uraian1Eks;
    }

    public void setUraian1Eks(String uraian1Eks) {
        this.uraian1Eks = uraian1Eks;
    }

    @Column(name = "NILAI_DOC_1_EKS")
    public BigDecimal getNilaiDokumen1Eks() {
        return nilaiDokumen1Eks;
    }

    public void setNilaiDokumen1Eks(BigDecimal nilaiDokumen1Eks) {
        this.nilaiDokumen1Eks = nilaiDokumen1Eks;
    }

    @Column(name = "HITUNG_DOKUMEN_1_EKS")
    public Boolean getDiberiNilaiDokumen1Eks() {
        return diberiNilaiDokumen1Eks;
    }

    public void setDiberiNilaiDokumen1Eks(Boolean diberiNilaiDokumen1Eks) {
        this.diberiNilaiDokumen1Eks = diberiNilaiDokumen1Eks;
    }

    @Column(name = "NILAI_FISIK_1_EKS")
    public BigDecimal getNilaiFisik1Eks() {
        return nilaiFisik1Eks;
    }

    public void setNilaiFisik1Eks(BigDecimal nilaiFisik1Eks) {
        this.nilaiFisik1Eks = nilaiFisik1Eks;
    }

    @Column(name = "HITUNG_HITUNG_1_EKS")
    public Boolean getDiberiNilaiFisik1Eks() {
        return diberiNilaiFisik1Eks;
    }

    public void setDiberiNilaiFisik1Eks(Boolean diberiNilaiFisik1Eks) {
        this.diberiNilaiFisik1Eks = diberiNilaiFisik1Eks;
    }

    @Column(name = "PROSENTASE_1_EKS")
    public Double getProsentase1Eks() {
        return prosentase1Eks;
    }

    public void setProsentase1Eks(Double prosentase1Eks) {
        this.prosentase1Eks = prosentase1Eks;
    }

    @Column(name = "URAIAN_2_EKS")
    public String getUraian2Eks() {
        return uraian2Eks;
    }

    public void setUraian2Eks(String uraian2Eks) {
        this.uraian2Eks = uraian2Eks;
    }

    @Column(name = "NILAI_DOC_2_EKS")
    public BigDecimal getNilaiDokumen2Eks() {
        return nilaiDokumen2Eks;
    }

    public void setNilaiDokumen2Eks(BigDecimal nilaiDokumen2Eks) {
        this.nilaiDokumen2Eks = nilaiDokumen2Eks;
    }

    @Column(name = "HITUNG_DOC_2_EKS")
    public Boolean getDiberiNilaiDokumen2Eks() {
        return diberiNilaiDokumen2Eks;
    }

    public void setDiberiNilaiDokumen2Eks(Boolean diberiNilaiDokumen2Eks) {
        this.diberiNilaiDokumen2Eks = diberiNilaiDokumen2Eks;
    }

    @Column(name = "NILAI_FISIK_2_EKS")
    public BigDecimal getNilaiFisik2Eks() {
        return nilaiFisik2Eks;
    }

    public void setNilaiFisik2Eks(BigDecimal nilaiFisik2Eks) {
        this.nilaiFisik2Eks = nilaiFisik2Eks;
    }

    @Column(name = "HITUNG_FISIK_2_EKS")
    public Boolean getDiberiNilaiFisik2Eks() {
        return diberiNilaiFisik2Eks;
    }

    public void setDiberiNilaiFisik2Eks(Boolean diberiNilaiFisik2Eks) {
        this.diberiNilaiFisik2Eks = diberiNilaiFisik2Eks;
    }

    @Column(name = "PROSENTASE_2_EKS")
    public Double getProsentase2Eks() {
        return prosentase2Eks;
    }

    public void setProsentase2Eks(Double prosentase2Eks) {
        this.prosentase2Eks = prosentase2Eks;
    }

    @Column(name = "TOTAL_DOC_EKS")
    public BigDecimal getTotalSesuaiDokumenEks() {
        return totalSesuaiDokumenEks;
    }

    public void setTotalSesuaiDokumenEks(BigDecimal totalSesuaiDokumenEks) {
        this.totalSesuaiDokumenEks = totalSesuaiDokumenEks;
    }

    @Column(name = "TOTAL_FISIK_EKS")
    public BigDecimal getTotalSesuaiFisikEks() {
        return totalSesuaiFisikEks;
    }

    public void setTotalSesuaiFisikEks(BigDecimal totalSesuaiFisikEks) {
        this.totalSesuaiFisikEks = totalSesuaiFisikEks;
    }

    @Column(name = "LIKUIDASI_DOC_1_EKS")
    public BigDecimal getLikuidasiDokumen1Eks() {
        return likuidasiDokumen1Eks;
    }

    public void setLikuidasiDokumen1Eks(BigDecimal likuidasiDokumen1Eks) {
        this.likuidasiDokumen1Eks = likuidasiDokumen1Eks;
    }

    @Column(name = "LIKUIDASI_FISIK_1_EKS")
    public BigDecimal getLikuidasiFisik1Eks() {
        return likuidasiFisik1Eks;
    }

    public void setLikuidasiFisik1Eks(BigDecimal likuidasiFisik1Eks) {
        this.likuidasiFisik1Eks = likuidasiFisik1Eks;
    }

    @Column(name = "LIKUIDASI_DOC_2_EKS")
    public BigDecimal getLikuidasiDokumen2Eks() {
        return likuidasiDokumen2Eks;
    }

    public void setLikuidasiDokumen2Eks(BigDecimal likuidasiDokumen2Eks) {
        this.likuidasiDokumen2Eks = likuidasiDokumen2Eks;
    }

    @Column(name = "LIKUIDASI_FISIK_2_EKS")
    public BigDecimal getLikuidasiFisik2Eks() {
        return likuidasiFisik2Eks;
    }

    public void setLikuidasiFisik2Eks(BigDecimal likuidasiFisik2Eks) {
        this.likuidasiFisik2Eks = likuidasiFisik2Eks;
    }

    @Column(name = "TOTAL_LIKUIDASI_DOC_EKS")
    public BigDecimal getTotalLikuidasiDokumenEks() {
        return totalLikuidasiDokumenEks;
    }

    public void setTotalLikuidasiDokumenEks(BigDecimal totalLikuidasiDokumenEks) {
        this.totalLikuidasiDokumenEks = totalLikuidasiDokumenEks;
    }

    @Column(name = "TOTAL_LIKUIDASI_FISIK_EKS")
    public BigDecimal getTotalLikuidasiFisikEks() {
        return totalLikuidasiFisikEks;
    }

    public void setTotalLikuidasiFisikEks(BigDecimal totalLikuidasiFisikEks) {
        this.totalLikuidasiFisikEks = totalLikuidasiFisikEks;
    }

    @Column(name = "TOLERANSI_1_EKS")
    public BigDecimal getToleransi1Eks() {
        return toleransi1Eks;
    }

    public void setToleransi1Eks(BigDecimal toleransi1Eks) {
        this.toleransi1Eks = toleransi1Eks;
    }

    @Column(name = "TOLERANSI_2_EKS")
    public BigDecimal getToleransi2Eks() {
        return toleransi2Eks;
    }

    public void setToleransi2Eks(BigDecimal toleransi2Eks) {
        this.toleransi2Eks = toleransi2Eks;
    }

    @Column(name = "LUAS_SESUAI_TATA_KOTA")
    public Double getLuasTanahSesuaiTataKota() {
        return luasTanahSesuaiTataKota;
    }

    public void setLuasTanahSesuaiTataKota(Double luasTanahSesuaiTataKota) {
        this.luasTanahSesuaiTataKota = luasTanahSesuaiTataKota;
    }

    @Column(name = "PERUNTUKAN_BANGUNAN")
    public String getPeruntukanBangunan() {
        return peruntukanBangunan;
    }

    public void setPeruntukanBangunan(String peruntukanBangunan) {
        this.peruntukanBangunan = peruntukanBangunan;
    }

    @Column(name = "STATUS_DOC_TANAH")
    public String getReadDocTanah() {
        return readDocTanah;
    }


    public void setReadDocTanah(String readDocTanah) {
        this.readDocTanah = readDocTanah;
    }


    @Column(name = "STATUS_DOC_BANGUNAN")
    public String getReadDocBangunan() {
        return readDocBangunan;
    }

    public void setReadDocBangunan(String readDocBangunan) {
        this.readDocBangunan = readDocBangunan;
    }

//    @Column(name = "MATA_UANG")
//    public String getMataUang() {
//        return mataUang;
//    }
//
//    public void setMataUang(String mataUang) {
//        this.mataUang = mataUang;
//    }
//
//    @Column(name = "TANGGAL_RATE")
//    public Date getTanggalRate() {
//        return tanggalRate;
//    }
//
//    public void setTanggalRate(Date tanggalRate) {
//        this.tanggalRate = tanggalRate;
//    }
//
//    @Column(name = "NILAI_RATE")
//    public BigDecimal getNilaiRate() {
//        return nilaiRate;
//    }
//
//    public void setNilaiRate(BigDecimal nilaiRate) {
//        this.nilaiRate = nilaiRate;
//    }
}