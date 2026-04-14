package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PAYMENT")
public class PaymentDTO extends BaseDTO{
	
	@Column(name = "methodCode", length = 50)
	private String methodCode;
	
	@Column(name = "methodName", length = 50)
	private String methodName;
	
	@Column(name = "provider", length = 50)
	private String provider;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		
		return "methodCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "methodCode";
	}

	@Override
	public String getUniqueValue() {
		
		return methodCode;
	}

	@Override
	public String getLabel() {
		
		return "methodCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("methodCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("methodCode", methodCode);
		return map;
	}

}
