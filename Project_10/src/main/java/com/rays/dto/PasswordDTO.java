package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PASSWORD")
public class PasswordDTO extends BaseDTO{
	
	@Column(name = "restCode", length = 50)
	private String restCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "resetToken", length = 50)
	private String resetToken;
	
	@Column(name = "status", length = 50)
	private String status;
	
	

	public String getRestCode() {
		return restCode;
	}

	public void setRestCode(String restCode) {
		this.restCode = restCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
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
		return "restCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "restCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return restCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "restCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("restCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("restCode", restCode);
		return map;
	}

}
