package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SmartParkingDTO;

public class SmartParkingForm extends BaseForm {

	@NotEmpty(message = "please enter parkingCode")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Only alphabets and numbers are allowed")
	private String parkingCode;

	@NotEmpty(message = "please enter vehicleNumber")
	private String vehicleNumber;

	@NotEmpty(message = "please enter slotNumber")
	private String slotNumber;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getParkingCode() {
		return parkingCode;
	}

	public void setParkingCode(String parkingCode) {
		this.parkingCode = parkingCode;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		SmartParkingDTO dto = initDTO(new SmartParkingDTO());
		dto.setParkingCode(parkingCode);
		dto.setVehicleNumber(vehicleNumber);
		dto.setSlotNumber(slotNumber);
		dto.setStatus(status);
		return dto;
	}
}
