package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CyberSecurityDTO;

public class CyberSecurityForm extends BaseForm {

	@NotEmpty(message = "please enter attackType")
	private String attackType;

	@NotEmpty(message = "please enter severity")
	private String severity;

	@NotEmpty(message = "please enter detected")
	private String detected;

	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		CyberSecurityDTO dto = initDTO(new CyberSecurityDTO());
		dto.setAttackType(attackType);
		dto.setSeverity(severity);
		dto.setDetected(detected);
		dto.setStatus(status);
		return dto;
	}
}
