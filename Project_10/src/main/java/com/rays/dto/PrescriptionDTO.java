package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PRESCRIPTION")
public class PrescriptionDTO extends BaseDTO {

	@Column(name = "prescriptionCode", length = 50)
	private String prescriptionCode;

	@Column(name = "patientName", length = 50)
	private String patientName;

	@Column(name = "doctorName", length = 50)
	private String doctorName;

	@Column(name = "prescriptionDate", length = 50)
	private Date prescriptionDate;

	
	
	
	

	public String getPrescriptionCode() {
		return prescriptionCode;
	}

	public void setPrescriptionCode(String prescriptionCode) {
		this.prescriptionCode = prescriptionCode;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getPrescriptionDate() {
		return prescriptionDate;
	}

	public void setPrescriptionDate(Date prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "prescriptionCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "prescriptionCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return prescriptionCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "prescriptionCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("prescriptionCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("prescriptionCode", prescriptionCode);
		return map;
	}

}
