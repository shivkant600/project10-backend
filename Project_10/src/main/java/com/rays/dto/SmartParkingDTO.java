package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SMARTPARKING")
public class SmartParkingDTO extends BaseDTO{

	@Column(name = "parkingCode", length = 50)
	private String parkingCode;
	
	@Column(name = "vehicleNumber", length = 50)
	private String vehicleNumber;
	
	@Column(name = "slotNumber", length = 50)
	private String slotNumber;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		
		return "parkingCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "parkingCode";
	}

	@Override
	public String getUniqueValue() {
		
		return parkingCode;
	}

	@Override
	public String getLabel() {
		
		return "parkingCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("parkingCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("parkingCode", parkingCode);
		return map;	}
}
