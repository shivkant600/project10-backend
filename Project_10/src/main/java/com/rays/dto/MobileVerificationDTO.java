package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_MOBILE")
public class MobileVerificationDTO extends BaseDTO {

	@Column(name = "verificationCode", length = 50)
	private String verificationCode;
	
	@Column(name = "mobileNumber", length = 50)
	private String mobileNumber;
	
	@Column(name = "otp", length = 50)
	private String otp;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		
		return "verificationCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "verificationCode";
	}

	@Override
	public String getUniqueValue() {
		
		return verificationCode;
	}

	@Override
	public String getLabel() {
	
		return "verificationCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("verificationCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("verificationCode", verificationCode);
		return map;	}
}
