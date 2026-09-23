package com.permata.appraisal.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SecurityLogDto {
    private Long id;
    private String personId;
    private Date dateTime;
    private String ipAddress;
    private Long logCode;
    private String keterangan;
    private String dateFormatJson;

    private String computerName;
    private String detail;
    private String userAffected;
    private String appName;

}
