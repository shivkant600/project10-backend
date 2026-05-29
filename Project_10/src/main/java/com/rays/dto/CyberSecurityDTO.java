package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CYBERSECURITY")
public class CyberSecurityDTO extends BaseDTO {

	@Column(name = "attackType", length = 50)
	private String attackType;

	@Column(name = "severity", length = 50)
	private String severity;

	@Column(name = "detected", length = 50)
	private String detected;

	@Column(name = "status", length = 50)
	private String status;

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getDetected() {
		return detected;
	}

	public void setDetected(String detected) {
		this.detected = detected;
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
		return "attackType";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "attackType";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return attackType;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "attackType";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("attackType", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("attackType", attackType);
		return map;
	}

}
