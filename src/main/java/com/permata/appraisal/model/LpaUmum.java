package com.permata.appraisal.model;


import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import com.permata.appraisal.util.ListUtils;
import jakarta.persistence.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "LPA_UMUM")
public class LpaUmum extends EntityBase<Long> {

    private Long id;
    private String lpaNumber;
    private DataDetail detail;
    private Long commonId;
    private Long branchId;
    private Long jenisAktiva;
    private Long statusJaminan;
    private Long surveyId;
    private String jenisAppraisal;
    private String kategoriJenisAppraisal;
    private String orderNumber;
    private String contactPerson;
    private String namaDebitur;
    private String jenisObjectPenilain;
    private String kategoriObjectPenilaian;
    private String namaPerumahan;
    private String namaCluster;
    private String block;
    private String nomor;
    private String rt;
    private String rw;
    private String kodePos;
    private String propinsi;
    private String kota;
    private String kecamatan;
    private String kelurahan;
    private Date tanggalOrder;
    private String kategoriSla;
    private Integer sla;
    private String ditujuke;
    private Long idObjectPenilaiFisik;
    private String jenisObjectPenilaiFisik;
    private String lokasiFisik;
    private String posisiLokasiAgunan;
    private Date tanggalSurvey;
    private String ditinjau;
    private String ditemui;
    private String catatanSurvey;
    private String mataUang;
    private Date tanggalRate;
    private BigDecimal nilaiRate;
    private Boolean draft;

    // data Faktor Market
    private String faktorMarketability;
    private String faktorMarketCatatan;

    // data Negative List
    private List<Parameter> listNegative;
    private List<Parameter> listPertimbangan;
    private String positifPoint;
    private String catatanPoint;

    // data perbandingan
    private String pembanding1;
    private String pembanding2;
    private String pembanding3;

    // opini eksternal
    private String opini;
    private Double deviasiDoc;
    private Double deviasiFisik;

    private Set<LpaKendaraan> kendaraan;
    private Set<LpaTanahBangunan> tanahBangunan;
    private Set<LpaStock> stock;
    private Set<LpaKapal> kapal;
    private Set<LpaBv> bv;
    private Set<LpaRv> rv;
    private Set<LpaMesin> mesin;
    private Set<LpaRab> rab;
    private Set<LpaInspeksi> inspeksi;

    // tanggal untuk eksternal
    private Date tanggalPenilaian;
    private Date tanggalOrderKeEksternal;
    private Date tanggalTerimaDariEksternal;
    private Kjpp kjpp;


    private String catatanKewajaranNil;
    private String catatanKesesuaian;

    public LpaUmum(){
        super();
    }

    public  LpaUmum(Long id) {
        this.id = id;
    }

    @Transient
    public boolean isEksternal (){
        if(StringUtils.isNotBlank(kategoriJenisAppraisal)){
            return kategoriJenisAppraisal.equalsIgnoreCase(AppConstans.JenisAppraisalCategory.EKSTERNAL);
        }
        return false;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "LPA_UMUM_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "LPA_UMUM_SEQ", sequenceName = "LPA_UMUM_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // agar one to one jadi lazy load
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaKendaraan> getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Set<LpaKendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaTanahBangunan> getTanahBangunan() {
        return tanahBangunan;
    }

    public void setTanahBangunan(Set<LpaTanahBangunan> tanahBangunan) {
        this.tanahBangunan = tanahBangunan;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaStock> getStock() {
        return stock;
    }

    public void setStock(Set<LpaStock> stock) {
        this.stock = stock;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaKapal> getKapal() {
        return kapal;
    }

    public void setKapal(Set<LpaKapal> kapal) {
        this.kapal = kapal;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaBv> getBv() {
        return bv;
    }

    public void setBv(Set<LpaBv> bv) {
        this.bv = bv;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaRv> getRv() {
        return rv;
    }

    public void setRv(Set<LpaRv> rv) {
        this.rv = rv;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaMesin> getMesin() {
        return mesin;
    }

    public void setMesin(Set<LpaMesin> mesin) {
        this.mesin = mesin;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaRab> getRab() {
        return rab;
    }

    public void setRab(Set<LpaRab> rab) {
        this.rab = rab;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lpaUmum", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public Set<LpaInspeksi> getInspeksi() {
        return inspeksi;
    }

    public void setInspeksi(Set<LpaInspeksi> inspeksi) {
        this.inspeksi = inspeksi;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_DETAIL")
    public DataDetail getDetail() {
        return detail;
    }

    public void setDetail(DataDetail detail) {
        this.detail = detail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KJPP")
    public Kjpp getKjpp() {
        return kjpp;
    }

    public void setKjpp(Kjpp kjpp) {
        this.kjpp = kjpp;
    }

    @Column(name = "ID_SURVEY", nullable = true)
    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    @Column(name = "NO_LPA", length = 50)
    public String getLpaNumber() {
        return lpaNumber;
    }

    public void setLpaNumber(String lpaNumber) {
        this.lpaNumber = lpaNumber;
    }

    @Column(name = "ID_DATA_UMUM")
    public Long getCommonId() {
        return commonId;
    }

    public void setCommonId(Long commonId) {
        this.commonId = commonId;
    }

    @Column(name = "ID_OBJECT_FISIK", length = 2)
    public Long getIdObjectPenilaiFisik() {
        return idObjectPenilaiFisik;
    }

    public void setIdObjectPenilaiFisik(Long idObjectPenilaiFisik) {
        this.idObjectPenilaiFisik = idObjectPenilaiFisik;
    }

    @Column(name = "JENIS_OBJECT_FISIK", length = 50)
    public String getJenisObjectPenilaiFisik() {
        return jenisObjectPenilaiFisik;
    }

    public void setJenisObjectPenilaiFisik(String jenisObjectPenilaiFisik) {
        this.jenisObjectPenilaiFisik = jenisObjectPenilaiFisik;
    }

    @Column(name = "KATEGORI_AKTIVA", length = 50)
    public String getKategoriObjectPenilaian() {
        return kategoriObjectPenilaian;
    }

    public void setKategoriObjectPenilaian(String kategoriObjectPenilaian) {
        this.kategoriObjectPenilaian = kategoriObjectPenilaian;
    }

    @Column(name = "ID_APP_CABANG")
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    @Column(name = "LOKASI_FISIK", length = 255)
    public String getLokasiFisik() {
        return lokasiFisik;
    }

    public void setLokasiFisik(String lokasiFisik) {
        this.lokasiFisik = lokasiFisik;
    }

    @Column(name = "POSISI_LOKASI_AGUNAN")
    public String getPosisiLokasiAgunan() {
        return posisiLokasiAgunan;
    }

    public void setPosisiLokasiAgunan(String posisiLokasiAgunan) {
        this.posisiLokasiAgunan = posisiLokasiAgunan;
    }

    @Column(name = "TANGGAL_SURVEY")
    public Date getTanggalSurvey() {
        return tanggalSurvey;
    }

    public void setTanggalSurvey(Date tanggalSurvey) {
        this.tanggalSurvey = tanggalSurvey;
    }

    @Column(name = "DITINJAU", length = 50)
    public String getDitinjau() {
        return ditinjau;
    }

    public void setDitinjau(String ditinjau) {
        this.ditinjau = ditinjau;
    }

    @Column(name = "DITEMUI", length = 50)
    public String getDitemui() {
        return ditemui;
    }

    public void setDitemui(String ditemui) {
        this.ditemui = ditemui;
    }

    @Column(name = "CATATAN_SURVEY")
    public String getCatatanSurvey() {
        return catatanSurvey;
    }

    public void setCatatanSurvey(String catatanSurvey) {
        this.catatanSurvey = catatanSurvey;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "LPA_UMUM_NEGATIF_POINT", joinColumns = @JoinColumn(name = "ID_LPA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PARAMETER"))
    public List<Parameter> getListNegative() {
        return listNegative;
    }

    public void addListNegative(Parameter param) {
        if (ListUtils.isEmpty(listNegative)) {
            listNegative = new ArrayList<Parameter>();
        }
        listNegative.add(param);
    }

    public void setListNegative(List<Parameter> listNegative) {
        this.listNegative = listNegative;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "LPA_UMUM_PERTIMBANGAN_KHUSUS", joinColumns = @JoinColumn(name = "ID_LPA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PARAMETER"))
    public List<Parameter> getListPertimbangan() {
        return listPertimbangan;
    }

    public void addPertimbangan(Parameter param) {
        if (ListUtils.isEmpty(listPertimbangan)) {
            listPertimbangan = new ArrayList<Parameter>();
        }
        listPertimbangan.add(param);
    }

    public void setListPertimbangan(List<Parameter> listPertimbangan) {
        this.listPertimbangan = listPertimbangan;
    }

    @Column(name = "POSITIF_POINT", length = 150)
    public String getPositifPoint() {
        return positifPoint;
    }

    public void setPositifPoint(String positifPoint) {
        this.positifPoint = positifPoint;
    }

    @Column(name = "CATATAN_POINT", length = 1000)
    public String getCatatanPoint() {
        return catatanPoint;
    }

    public void setCatatanPoint(String catatanPoint) {
        this.catatanPoint = catatanPoint;
    }

    @Column(name = "FAKTOR_MARKETABILITY", length = 18)
    public String getFaktorMarketability() {
        return faktorMarketability;
    }

    public void setFaktorMarketability(String faktorMarketability) {
        this.faktorMarketability = faktorMarketability;
    }

    @Column(name = "FAKTOR_MARKET_CATATAN", length = 255)
    public String getFaktorMarketCatatan() {
        return faktorMarketCatatan;
    }

    public void setFaktorMarketCatatan(String faktorMarketCatatan) {
        this.faktorMarketCatatan = faktorMarketCatatan;
    }

    @Column(name = "PEMBANDING_1", length = 150)
    public String getPembanding1() {
        return pembanding1;
    }

    public void setPembanding1(String pembanding1) {
        this.pembanding1 = pembanding1;
    }

    @Column(name = "PEMBANDING_2", length = 150)
    public String getPembanding2() {
        return pembanding2;
    }

    public void setPembanding2(String pembanding2) {
        this.pembanding2 = pembanding2;
    }

    @Column(name = "PEMBANDING_3", length = 150)
    public String getPembanding3() {
        return pembanding3;
    }

    public void setPembanding3(String pembanding3) {
        this.pembanding3 = pembanding3;
    }

    @Column(name = "IS_DRAFT")
    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    // double data
    @Column(name = "ID_JENIS_AKTIVA")
    public Long getJenisAktiva() {
        return jenisAktiva;
    }

    public void setJenisAktiva(Long jenisAktiva) {
        this.jenisAktiva = jenisAktiva;
    }

    @Column(name = "ID_STATUS_JAMINAN")
    public Long getStatusJaminan() {
        return statusJaminan;
    }

    public void setStatusJaminan(Long statusJaminan) {
        this.statusJaminan = statusJaminan;
    }

    @Column(name = "KATEGORI_APPRAISAL", length = 10)
    public String getKategoriJenisAppraisal() {
        return kategoriJenisAppraisal;
    }

    public void setKategoriJenisAppraisal(String kategoriJenisAppraisal) {
        this.kategoriJenisAppraisal = kategoriJenisAppraisal;
    }

    @Column(name = "JENIS_APPRAISAL", length = 100)
    public String getJenisAppraisal() {
        return jenisAppraisal;
    }

    public void setJenisAppraisal(String jenisAppraisal) {
        this.jenisAppraisal = jenisAppraisal;
    }

    @Column(name = "NOMOR_ORDER", length = 15)
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Column(name = "NAMA_CONTACT", length = 100)
    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Column(name = "NAMA_DEBITUR", length = 100)
    public String getNamaDebitur() {
        return namaDebitur;
    }

    public void setNamaDebitur(String namaDebitur) {
        this.namaDebitur = namaDebitur;
    }

    @Column(name = "JENIS_OBJECT", length = 50)
    public String getJenisObjectPenilain() {
        return jenisObjectPenilain;
    }

    public void setJenisObjectPenilain(String jenisObjectPenilain) {
        this.jenisObjectPenilain = jenisObjectPenilain;
    }

    @Column(name = "NAMA_PERUMAHAN", length = 100)
    public String getNamaPerumahan() {
        return namaPerumahan;
    }

    public void setNamaPerumahan(String namaPerumahan) {
        this.namaPerumahan = namaPerumahan;
    }

    @Column(name = "NAMA_CLUSTER", length = 100)
    public String getNamaCluster() {
        return namaCluster;
    }

    public void setNamaCluster(String namaCluster) {
        this.namaCluster = namaCluster;
    }

    @Column(name = "BLOCK", length = 50)
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Column(name = "NOMOR", length = 50)
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Column(name = "RT", length = 50)
    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    @Column(name = "RW", length = 50)
    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    @Column(name = "KODE_POS", length = 5)
    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    @Column(name = "PROPINSI", length = 50)
    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    @Column(name = "KOTA", length = 50)
    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Column(name = "KECAMATAN", length = 50)
    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    @Column(name = "KELURAHAN", length = 50)
    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    @Column(name = "TANGGAL_ORDER")
    public Date getTanggalOrder() {
        return tanggalOrder;
    }

    public void setTanggalOrder(Date tanggalOrder) {
        this.tanggalOrder = tanggalOrder;
    }

    @Column(name = "KATEGORI_SLA", length = 50)
    public String getKategoriSla() {
        return kategoriSla;
    }

    public void setKategoriSla(String kategoriSla) {
        this.kategoriSla = kategoriSla;
    }

    @Column(length = 2, name = "SLA")
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    @Column(name = "DITUJU_KE", length = 50)
    public String getDitujuke() {
        return ditujuke;
    }

    public void setDitujuke(String ditujuke) {
        this.ditujuke = ditujuke;
    }

    @Column(name = "MATA_UANG", length = 5)
    public String getMataUang() {
        return mataUang;
    }

    public void setMataUang(String mataUang) {
        this.mataUang = mataUang;
    }

    @Column(name = "TANGGAL_RATE")
    public Date getTanggalRate() {
        return tanggalRate;
    }

    public void setTanggalRate(Date tanggalRate) {
        this.tanggalRate = tanggalRate;
    }

    @Column(name = "NILAI_RATE")
    public BigDecimal getNilaiRate() {
        return nilaiRate;
    }

    public void setNilaiRate(BigDecimal nilaiRate) {
        this.nilaiRate = nilaiRate;
    }

    @Column (name = "OPINI_INTERNAL", length = 150)
    public String getOpini() {
        return opini;
    }

    public void setOpini(String opini) {
        this.opini = opini;
    }

    @Column(name = "DEVIASI_DOC")
    public Double getDeviasiDoc() {
        return deviasiDoc;
    }

    public void setDeviasiDoc(Double deviasiDoc) {
        this.deviasiDoc = deviasiDoc;
    }

    @Column(name = "DEVIASI_FISIK")
    public Double getDeviasiFisik() {
        return deviasiFisik;
    }

    public void setDeviasiFisik(Double deviasiFisik) {
        this.deviasiFisik = deviasiFisik;
    }

    @Column(name = "TANGGAL_PENILAIAN")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalPenilaian() {
        return tanggalPenilaian;
    }

    public void setTanggalPenilaian(Date tanggalPenilaian) {
        this.tanggalPenilaian = tanggalPenilaian;
    }

    @Column(name = "TANGGAL_ORDER_KE_EKS")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalOrderKeEksternal() {
        return tanggalOrderKeEksternal;
    }

    public void setTanggalOrderKeEksternal(Date tanggalOrderKeEksternal) {
        this.tanggalOrderKeEksternal = tanggalOrderKeEksternal;
    }

    @Column(name = "TANGGAL_TERIMA_DARI_EKS")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTanggalTerimaDariEksternal() {
        return tanggalTerimaDariEksternal;
    }

    public void setTanggalTerimaDariEksternal(Date tanggalTerimaDariEksternal) {
        this.tanggalTerimaDariEksternal = tanggalTerimaDariEksternal;
    }


    @Column(name = "CATATAN_KEWAJARAN_NILAI")
    public String getCatatanKewajaranNil() {
        return catatanKewajaranNil;
    }

    public void setCatatanKewajaranNil(String catatanKewajaranNil) {
        this.catatanKewajaranNil = catatanKewajaranNil;
    }


    @Column(name = "CATATAN_KESESUAIAN")
    public String getCatatanKesesuaian() {
        return catatanKesesuaian;
    }

    public void setCatatanKesesuaian(String catatanKesesuaian) {
        this.catatanKesesuaian = catatanKesesuaian;
    }
}