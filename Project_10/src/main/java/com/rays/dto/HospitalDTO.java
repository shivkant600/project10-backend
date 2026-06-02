package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_HOSPITAL")
public class HospitalDTO extends BaseDTO {

	@Column(name = "patientName", length = 50)
	private String patientName;

	@Column(name = "docterName", length = 50)
	private String docterName;

	@Column(name = "disease", length = 50)
	private String disease;

	@Column(name = "roomNumber", length = 50)
	private Integer roomNumber;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDocterName() {
		return docterName;
	}

	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return patientName;
	}

	@Override
	public String getUniqueKey() {

		return "patientName";
	}

	@Override
	public String getUniqueValue() {

		return patientName;
	}

	@Override
	public String getLabel() {

		return "patientName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("patientName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("patientName", patientName);
		return map;
	}

}
