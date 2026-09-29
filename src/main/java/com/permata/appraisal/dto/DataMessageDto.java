package com.permata.appraisal.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class DataMessageDto implements Serializable {

    private Long id;
    private Long dataCommonId;
    private String userId;
    private String personName;
    private String position;
    private Date date;
    private String message;

    private String dateString;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataMessageDto{");
        sb.append("id=").append(id);
        sb.append(", dataCommonId=").append(dataCommonId);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", personName='").append(personName).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", date=").append(date);
        sb.append(", message='").append(message).append('\'');
        sb.append(", dateString='").append(dateString).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
