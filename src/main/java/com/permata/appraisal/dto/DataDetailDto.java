package com.permata.appraisal.dto;

import com.permata.appraisal.model.LpaUmum;
import com.permata.appraisal.model.SurveyBangunan;
import com.permata.appraisal.model.SurveyBv;
import com.permata.appraisal.model.SurveyCommon;
import com.permata.appraisal.model.SurveyKendaraan;
import com.permata.appraisal.model.SurveyLingkungan;
import com.permata.appraisal.model.SurveyPembanding;
import com.permata.appraisal.model.SurveyPoint;
import com.permata.appraisal.model.SurveyStatus;
import com.permata.appraisal.model.SurveyStock;
import com.permata.appraisal.model.SurveyTanah;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class DataDetailDto implements Serializable {

    private Long id;
    private Long dataCommonId;
    private Long assetTypeId;
    private String assetTypeName;
    private Long categoryTypeId;
    private String categoryTypeName;

    private String alamat;
    private Integer sla;
    private Integer status;
    private String zipCode;
    private String province;
    private String city;
    private String district;
    private String subDistrict;
    private String picName;

    private String homeApartment;
    private String clusterTower;
    private String blokFloor;
    private String number;
    private String rt;
    private String rw;

    private String day;
    private String message;
    private SurveyStatus surveyStatus;
    private String from;
    private SurveyCommon survey;

    private List<DataAttactmentDto> attactments;
    private List<SurveyTanah> tanah;
    private List<SurveyBangunan> bangunans;
    private SurveyLingkungan lingkungan;
    private List<SurveyPembanding> pembandings;
    private SurveyPoint point;
    private List<SurveyKendaraan> kendaraan;
    private List<SurveyStock> surveyStocks;
    private List<SurveyBv> surveyBv;

    private Set<LpaUmum> lpaUmum;

    private Double luasTanah;
    private Double luasBangunan;
    private Integer jumlahLantai;
    private BigDecimal hargaJual;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataDetailDto{");
        sb.append("id=").append(id);
        sb.append(", dataCommonId=").append(dataCommonId);
        sb.append(", assetTypeId=").append(assetTypeId);
        sb.append(", assetTypeName='").append(assetTypeName).append('\'');
        sb.append(", categoryTypeId=").append(categoryTypeId);
        sb.append(", categoryTypeName='").append(categoryTypeName).append('\'');
        sb.append(", alamat='").append(alamat).append('\'');
        sb.append(", sla=").append(sla);
        sb.append(", status=").append(status);
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", subDistrict='").append(subDistrict).append('\'');
        sb.append(", picName='").append(picName).append('\'');
        sb.append(", luasTanah=").append(luasTanah);
        sb.append(", luasBangunan=").append(luasBangunan);
        sb.append(", jumlahLantai=").append(jumlahLantai);
        sb.append(", hargaJual=").append(hargaJual);
        sb.append('}');
        return sb.toString();
    }
}
