package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CarDTO;

public class CarForm extends BaseForm {

	@NotEmpty(message = "please enter customerName")
	private String customerName;

	@NotEmpty(message = "please enter carModel")
	private String carModel;

	@NotEmpty(message = "please enter rentperDay")
	private String rentperDay;

	@NotEmpty(message = "please enter fuelType")
	private String fuelType;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getRentperDay() {
		return rentperDay;
	}

	public void setRentperDay(String rentperDay) {
		this.rentperDay = rentperDay;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public BaseDTO getDto() {
		CarDTO dto = initDTO(new CarDTO());
		dto.setCustomerName(customerName);
		dto.setCarModel(carModel);
		dto.setRentperDay(rentperDay);
		dto.setFuelType(fuelType);
		return dto;
	}

}
