package com.permata.appraisal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class ErrorMessageDto {
	@ApiModelProperty(dataType = "timestamp",example = "2020-03-01T04:22:17.871Z",notes = "time execute")
	private Date timestamp;
	@ApiModelProperty(example = "cant convert string to date",notes = "error message teknis(exception)")	
	private String message;
	@ApiModelProperty(example = "user Tidak Ditemukan!",notes = "error message untuk ditampilkan di ui")
	private String error;
	@ApiModelProperty(example = "/api/get",notes = "path api")
	private String url;	
	@ApiModelProperty(example = "404",notes = "http status code value")
	private int statusCode;		
	

	
	public ErrorMessageDto() {
		super();	
	}
	//ErrorMessageDTO(Date timestamp, String message, String details, String url)

	public ErrorMessageDto(Date timestamp, String message, String error, String url, int statusCode) {
		this.timestamp = timestamp;
		this.message = message;
		this.error = error;
		this.url = url;
		this.statusCode = statusCode;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
