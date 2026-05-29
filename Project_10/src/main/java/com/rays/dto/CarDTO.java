package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CAR")
public class CarDTO extends BaseDTO {

	@Column(name = "customerName", length = 50)
	private String customerName;

	@Column(name = "carModel", length = 50)
	private String carModel;

	@Column(name = "rentperDay", length = 50)
	private String rentperDay;

	@Column(name = "fuelType", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "customerName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "customerName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return customerName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "customerName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("customerName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("customerName", customerName);
		return map;
	}

}
