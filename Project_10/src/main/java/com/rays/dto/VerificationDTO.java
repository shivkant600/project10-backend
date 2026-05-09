package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_VERIFICATION")
public class VerificationDTO extends BaseDTO{
	
	@Column(name = "code", length = 50)
	private String code;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "type", length = 50)
	private String type;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "code";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "code";
	}

	@Override
	public String getUniqueValue() {
		
		return code;
	}

	@Override
	public String getLabel() {
		
		return "code";
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
