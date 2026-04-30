package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DeviceDTO;

public class DeviceForm extends BaseForm {

	@NotEmpty(message = "please enter deviceCode")
	private String deviceCode;

	@NotEmpty(message = "please enter deviceName")
	private String deviceName;

	@NotEmpty(message = "please enter userName")
	private String userName;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
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
	public BaseDTO getDto() {

		DeviceDTO dto = initDTO(new DeviceDTO());
		dto.setDeviceCode(deviceCode);
		dto.setDeviceName(deviceName);
		dto.setUserName(userName);
		dto.setStatus(status);

		return dto;
	}

}
