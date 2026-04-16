package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "Credential")
public class CredentialDTO extends BaseDTO{
	
	@Column(name = "credentialCode", length = 50)
	private String credentialCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "type", length = 50)
	private String type;
	
	@Column(name = "status", length = 50)
	private String status;
	

	public String getCredentialCode() {
		return credentialCode;
	}

	public void setCredentialCode(String credentialCode) {
		this.credentialCode = credentialCode;
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
		
		return "credentialCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "credentialCode";
	}

	@Override
	public String getUniqueValue() {
		
		return credentialCode;
	}

	@Override
	public String getLabel() {
		
		return "credentialCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("credentialCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("credentialCode", credentialCode);
		return map;
	}

}
