package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_MASKING")
public class MaskingDTO extends BaseDTO {
	
	@Column(name = "maskCode", length = 50)
	private String maskCode;
	
	@Column(name = "fieldName", length = 50)
	private String fieldName;
	
	@Column(name = "maskType", length = 50)
	private String maskType;
	
	@Column(name = "status", length = 50)
	private String status;
	
	
	

	public String getMaskCode() {
		return maskCode;
	}

	public void setMaskCode(String maskCode) {
		this.maskCode = maskCode;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMaskType() {
		return maskType;
	}

	public void setMaskType(String maskType) {
		this.maskType = maskType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
	
		return "maskCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "maskCode";
	}

	@Override
	public String getUniqueValue() {
		
		return maskCode;
	}

	@Override
	public String getLabel() {
		
		return "maskCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("maskCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("maskCode", maskCode);
		return map;
	}

}
