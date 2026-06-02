package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PrescriptionDTO;

public class PrescriptionForm extends BaseForm {

	@NotEmpty(message = "please enter prescriptionCode")
	private String prescriptionCode;

	@NotEmpty(message = "please enter patientName")
	private String patientName;

	@NotEmpty(message = "please enter doctorName")
	private String doctorName;

	@NotNull(message = "please enter prescriptionDate ")
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
	public BaseDTO getDto() {
		PrescriptionDTO dto = initDTO(new PrescriptionDTO());
		dto.setPrescriptionCode(prescriptionCode);
		dto.setPatientName(patientName);
		dto.setDoctorName(doctorName);
		dto.setPrescriptionDate(prescriptionDate);
		return dto;
	}

}
