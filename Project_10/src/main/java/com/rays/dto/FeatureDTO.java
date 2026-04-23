package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FEATURE")
public class FeatureDTO extends BaseDTO {

	@Column(name = "accessCode", length = 50)
	private String accessCode;

	@Column(name = "featureName", length = 50)
	private String featureName;

	@Column(name = "userName", length = 50)
	private String userName;

	@Column(name = "status", length = 50)
	private String status;

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
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

		return "accessCode";
	}

	@Override
	public String getUniqueKey() {

		return "accessCode";
	}

	@Override
	public String getUniqueValue() {

		return accessCode;
	}

	@Override
	public String getLabel() {

		return "accessCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("accessCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("accessCode", accessCode);
		return map;
	}

}
