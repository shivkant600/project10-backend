package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TRANSPORT")
public class TransportDTO extends BaseDTO{
	
	@Column(name = "vehicleType", length = 50)
	private String vehicleType;
	
	@Column(name = "driverName", length = 50)
	private String driverName;
	
	@Column(name = "charges", length = 50)
	private Double charges;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	@Override
	public String getValue() {
		
		return "driverName";
	}

	@Override
	public String getUniqueKey() {
		
		return "driverName";
	}

	@Override
	public String getUniqueValue() {
		
		return driverName;
	}

	@Override
	public String getLabel() {
		
		return "driverName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("driverName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("driverName", driverName);
		return map;
	}
	

}
