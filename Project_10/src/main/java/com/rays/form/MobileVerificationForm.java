package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MobileVerificationDTO;

public class MobileVerificationForm extends BaseForm {

	@NotEmpty(message = "please enter verificationCode")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Only alphabets and numbers are allowed")
	private String verificationCode;

	@NotEmpty(message = "please enter mobileNumber")
	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must contain only 10 digits")
	private String mobileNumber;

	@NotEmpty(message = "please enter otp")
	private String otp;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		MobileVerificationDTO dto = initDTO(new MobileVerificationDTO());
		dto.setVerificationCode(verificationCode);
		dto.setMobileNumber(mobileNumber);
		dto.setOtp(otp);
		dto.setStatus(status);
		return dto;
	}

}
