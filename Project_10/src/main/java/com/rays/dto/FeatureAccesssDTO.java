package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FEATUREACCESS")
public class FeatureAccesssDTO extends BaseDTO {
	
	

	
	@Column(name = "featureName", length = 50)
	private String featureName;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "status", length = 50)
	private String status;



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
		
		return "featureName";
	}

	@Override
	public String getUniqueKey() {
	
		return "featureName";
	}

	@Override
	public String getUniqueValue() {
		
		return featureName;
	}

	@Override
	public String getLabel() {
		
		return "featureName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("featureName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("featureName", featureName);
		return map;
	}

}
