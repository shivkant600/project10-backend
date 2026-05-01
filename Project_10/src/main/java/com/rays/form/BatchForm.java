package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BatchDTO;

public class BatchForm extends BaseForm {

	@NotEmpty(message = "please enter batchCode")
	private String batchCode;

	@NotEmpty(message = "please enter batchName")
	private String batchName;

	@NotNull(message = "please enter totalRecord ")
	private Integer totalRecord;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		BatchDTO dto = initDTO(new BatchDTO());
		dto.setBatchCode(batchCode);
		dto.setBatchName(batchName);
		dto.setTotalRecord(totalRecord);
		dto.setStatus(status);
		return dto;
	}

}
