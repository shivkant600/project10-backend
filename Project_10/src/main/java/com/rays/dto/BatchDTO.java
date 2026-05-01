package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BATCH")
public class BatchDTO extends BaseDTO{
	
	@Column(name = "batchCode", length = 50)
	private String batchCode;
	
	@Column(name = "batchName", length = 50)
	private String batchName;
	
	@Column(name = "totalRecord", length = 50)
	private Integer totalRecord;
	
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "batchCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "batchCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return batchCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "batchCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("batchCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("batchCode", batchCode);
		return map;
	}

}
