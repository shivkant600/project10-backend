package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ReportDTO;

public class ReportForm extends BaseForm {

	@NotEmpty(message = "please enter reportCode")
	private String reportCode;

	@NotEmpty(message = "please enter reportType")
	private String reportType;

	@NotNull(message = "please enter generatedDate ")
	private Date generatedDate;

	@NotEmpty(message = "please enter remarks")
	private String remarks;

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Date getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public BaseDTO getDto() {
		ReportDTO dto = initDTO(new ReportDTO());
		dto.setReportCode(reportCode);
		dto.setReportType(reportType);
		dto.setGeneratedDate(generatedDate);
		dto.setRemarks(remarks);
		return dto;
	}

}
