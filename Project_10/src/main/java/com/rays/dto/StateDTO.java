package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_State")
public class StateDTO extends BaseDTO {
	
	@Column(name = "stateCode", length = 50)
	private String stateCode;
	
	@Column(name = "stateName", length = 50)
	private String stateName;
	
	@Column(name = "countrName", length = 50)
	private String countryName;
	
	@Column(name = "status", length = 50)
	private String status;

	
	
	

	
	
	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
		return "stateCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "stateCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return stateCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "stateCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("stateCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("stateCode", stateCode);
		return map;
	}

}
