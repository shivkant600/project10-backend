package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Access")
public class AccessDTO extends BaseDTO {
	
	@Column(name = "accessLogCode", length = 50)
	private String accessLogCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getAccessLogCode() {
		return accessLogCode;
	}

	public void setAccessLogCode(String accessLogCode) {
		this.accessLogCode = accessLogCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		
		return "userName";
	}

	@Override
	public String getUniqueKey() {
		
		return "userName";
	}

	@Override
	public String getUniqueValue() {
		
		return userName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("userName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("userName", userName);
		return map;
	}
	

}
