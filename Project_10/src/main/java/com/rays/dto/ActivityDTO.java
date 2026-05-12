package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ACTIVITY")
public class ActivityDTO extends BaseDTO {

	@Column(name = "activityCode", length = 50)
	private String activityCode;

	@Column(name = "userName", length = 50)
	private String userName;

	@Column(name = "activityType", length = 50)
	private String activityType;

	@Column(name = "status", length = 50)
	private String status;

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {

		return "activityCode";
	}

	@Override
	public String getUniqueKey() {

		return "activityCode";
	}

	@Override
	public String getUniqueValue() {

		return activityCode;
	}

	@Override
	public String getLabel() {

		return "activityCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("activityCode", "asc");

		return map;

	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("activityCode", activityCode);
		return map;
	}

}
