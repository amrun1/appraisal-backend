package com.permata.appraisal.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DataAttactmentDto implements Serializable {

    private Long id;
    private String name;
    private String extension;
    private byte[] file;
    private Long dataDetailId;
    private Long documentTypeId;
    private String documentTypeName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataAttactmentDto{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", extension='").append(extension).append('\'');
        sb.append(", dataDetailId=").append(dataDetailId);
        sb.append(", documentTypeId=").append(documentTypeId);
        sb.append(", documentTypeName='").append(documentTypeName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
