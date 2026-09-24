package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;

import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "DATA_DETAIL")
public class DataDetail extends EntityBase<Long> {

    private static final long serialVersionUID = 4414710677693384070L;
    private Long id;
    private List<DataAttactment> attactments;
    private DataCommon dataCommon;
    // private HouseComplex complex;
    private AssetType assetType;
    private String alamat;
    private Integer sla;
    private Integer status;
    private String zipCode;
    private String province;
    private String city;
    private String district;
    private String subDistrict;
    private String picName;
    // alamat object
    private String homeApartment;
    private String clusterTower;
    private String blokFloor;
    private String number;
    private String rt;
    private String rw;

    // survey fields
    private String day;
    private String message;
    private SurveyStatus surveyStatus;
    private String from;
    private SurveyCommon survey;
    private List<SurveyTanah> tanah;
    private List<SurveyBangunan> bangunans;
    private SurveyLingkungan lingkungan;
    private List<SurveyPembanding> pembandings;
    private SurveyPoint point;
    private List<SurveyKendaraan> kendaraan;
    private List<SurveyStock> surveyStocks;
    private List<SurveyBv> surveyBv;



    // LPA Data
    private Set<LpaUmum> lpaUmum;

    // Kusus Indikasi fields
    private Double luasTanah;
    private Double luasBangunan;
    private Integer jumlahLantai;
    private BigDecimal hargaJual;

    @Id
    @GeneratedValue(generator = "DATA_DETAIL_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "DATA_DETAIL_SEQ", sequenceName = "DATA_DETAIL_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * field LPA
     */
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.ALL})
    public Set<LpaUmum> getLpaUmum() {
        return lpaUmum;
    }

    public void setLpaUmum(Set<LpaUmum> lpaUmum) {
        this.lpaUmum = lpaUmum;
    }

    /**
     * survey fields
     */
    @Column(name = "WAKTU")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Column(name = "KETERANGAN_DROP")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(name = "STATUS_SURVEY")
    @Enumerated(EnumType.STRING)
    public SurveyStatus getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(SurveyStatus surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

    @Column(name = "INPUT_HASIL_SURVEY")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public SurveyCommon getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyCommon survey) {
        this.survey = survey;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyTanah> getTanah() {
        return tanah;
    }

    public void setTanah(List<SurveyTanah> tanah) {
        this.tanah = tanah;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyBangunan> getBangunans() {
        return bangunans;
    }

    public void setBangunans(List<SurveyBangunan> bangunans) {
        this.bangunans = bangunans;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyStock> getSurveyStocks() {
        return surveyStocks;
    }

    public void setSurveyStocks(List<SurveyStock> surveyStocks) {
        this.surveyStocks = surveyStocks;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyBv> getSurveyBv() {
        return surveyBv;
    }

    public void setSurveyBv(List<SurveyBv> surveyBv) {
        this.surveyBv = surveyBv;
    }



    public void addBangunan(SurveyBangunan bangunan){
        if(bangunans == null){
            bangunans = new ArrayList<SurveyBangunan>();
        }
        bangunan.setDetail(this);
        bangunans.add(bangunan);
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public SurveyLingkungan getLingkungan() {
        return lingkungan;
    }

    public void setLingkungan(SurveyLingkungan lingkungan) {
        this.lingkungan = lingkungan;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyPembanding> getPembandings() {
        return pembandings;
    }

    public void setPembandings(List<SurveyPembanding> pembandings) {
        this.pembandings = pembandings;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public SurveyPoint getPoint() {
        return point;
    }

    public void setPoint(SurveyPoint point) {
        this.point = point;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<SurveyKendaraan> getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(List<SurveyKendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addKendaraan(SurveyKendaraan kendaraan){
        if(this.kendaraan == null){
            this.kendaraan = new ArrayList<SurveyKendaraan>();
        }
        kendaraan.setDetail(this);
        this.kendaraan.add(kendaraan);
    }

    // end survey fields


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dataDetail", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    public List<DataAttactment> getAttactments() {
        return attactments;
    }

    public void setAttactments(List<DataAttactment> attactments) {
        this.attactments = attactments;
    }

//    public void addAttactment(DataAttactment attactment){
//        if(attactments == null){
//            attactments = new ArrayList<DataAttactment>();
//        }
//        attactment.setDataDetail(this);
//        attactments.add(attactment);
//    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATA_UMUM")
    public DataCommon getDataCommon() {
        return dataCommon;
    }

    public void setDataCommon(DataCommon dataCommon) {
        this.dataCommon = dataCommon;
    }

    @Column(name = "ALAMAT", nullable = false, length = 255)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Column(name = "SLA")
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "KODE_POS", length = 5)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Column(name = "KODE_PROPINSI", length = 50)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "KODE_KOTA", length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "KODE_KECAMATAN", length = 50)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name = "KODE_KELURAHAN", length = 50)
    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    @Column(name = "NAMA_PIC", length = 50)
    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KOMPLEK")
    public HouseComplex getComplex() {
        return complex;
    }

    public void setComplex(HouseComplex complex) {
        this.complex = complex;
    }*/

    @Column(name = "PERUMAHAN_APARTMENT", length = 100)
    public String getHomeApartment() {
        return homeApartment;
    }

    public void setHomeApartment(String homeApartment) {
        this.homeApartment = homeApartment;
    }

    @Column(name = "CLUSTER_TOWER", length = 100)
    public String getClusterTower() {
        return clusterTower;
    }

    public void setClusterTower(String clusterTower) {
        this.clusterTower = clusterTower;
    }

    @Column(name = "BLOK_LANTAI", length = 50)
    public String getBlokFloor() {
        return blokFloor;
    }

    public void setBlokFloor(String blokFloor) {
        this.blokFloor = blokFloor;
    }

    @Column(name = "NOMOR", length = 50)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JENIS_AKTIVA")
    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    @Column(name = "LUAS_TANAH")
    public Double getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(Double luasTanah) {
        this.luasTanah = luasTanah;
    }

    @Column(name = "LUAS_BANGUNAN")
    public Double getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(Double luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    @Column(name = "JUMLAH_LANTAI")
    public Integer getJumlahLantai() {
        return jumlahLantai;
    }

    public void setJumlahLantai(Integer jumlahLantai) {
        this.jumlahLantai = jumlahLantai;
    }

    @Column(name = "HARGA_JUAL")
    public BigDecimal getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(BigDecimal hargaJual) {
        this.hargaJual = hargaJual;
    }
}