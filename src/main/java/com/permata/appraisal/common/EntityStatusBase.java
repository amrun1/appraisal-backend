package com.permata.appraisal.common;

import com.permata.appraisal.util.SoftDeleteSupport;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public class EntityStatusBase<ID extends Serializable> extends EntityBase<ID> implements SoftDeleteSupport {

	public static final Integer DEFAULT = null;
	public static final Integer YES = 1;
	public static final Integer NO = 0;
	public static final Integer UNKNOWN = 3;

	private static final long serialVersionUID = -5786093558442175191L;
	// private String statusData;
	private Integer deleted;

//  @Column(name = "STATUS_DATA")
//	public String getStatusData() {
//		return statusData;
//	}
//
//	public void setStatusData(String statusData) {
//		this.statusData = statusData;
//	}

	@Override
	@Column(name = "DELETED", length = 1)
	public Integer getDeleted() {
		return deleted;
	}

	@Override
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
}