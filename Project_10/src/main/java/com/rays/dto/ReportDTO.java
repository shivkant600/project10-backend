package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REPORT")
public class ReportDTO extends BaseDTO {

	@Column(name = "reportCode", length = 50)
	private String reportCode;

	@Column(name = "reportType", length = 50)
	private String reportType;

	@Column(name = "generatedDate", length = 50)
	private Date generatedDate;

	@Column(name = "remarks", length = 50)
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
	public String getValue() {
		
		return "reportCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "reportCode";
	}

	@Override
	public String getUniqueValue() {
		
		return reportCode;
	}

	@Override
	public String getLabel() {
		
		return "reportCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("reportCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("reportCode", reportCode);
		return map;
	}

}
