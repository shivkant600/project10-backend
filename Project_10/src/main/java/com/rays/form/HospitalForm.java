package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HospitalDTO;

public class HospitalForm extends BaseForm{
	
	@NotEmpty(message = "please enter patientName")
	private String patientName;
	
	@NotEmpty(message = "please enter docterName")
	private String docterName;
	
	@NotEmpty(message = "please enter disease")
	private String disease;
	
	@NotNull(message = "please enter roomNumber ")
	
	private Integer roomNumber;

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

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

	
	@Override
	public BaseDTO getDto() {
		HospitalDTO dto = initDTO(new HospitalDTO());
		dto.setPatientName(patientName);
		dto.setDocterName(docterName);
		dto.setDisease(disease);
		dto.setRoomNumber(roomNumber);
		return dto;
	}
}
