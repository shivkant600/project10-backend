package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_PARKING")
public class ParkingDTO extends BaseDTO {
	
	
	@Column(name = "location", length = 50)
	private String location;
	
	@Column(name = "capacity", length = 50)
	private Integer capacity;
	
	@Column(name = "fee", length = 50)
	private Double fee;
	
	
	
	
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String getValue() {
		
		return "location";
	}

	@Override
	public String getUniqueKey() {
		
		return "location";
	}

	@Override
	public String getUniqueValue() {
		
		return location;
	}

	@Override
	public String getLabel() {
		
		return "location";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("location", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("location", location);
		return map;
	}

}
