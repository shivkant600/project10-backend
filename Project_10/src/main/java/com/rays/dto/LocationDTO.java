package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LOCATION")
public class LocationDTO extends BaseDTO{
	
	@Column(name = "geoCode", length = 50)
	private String geoCode;
	
	@Column(name = "latitude", length = 50)
	private String latitude;
	
	@Column(name = "longitude", length = 50)
	private String longitude;
	
	@Column(name = "status", length = 50)
	private String status;
	
	
	
	

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		
		return "geoCode";
	}

	@Override
	public String getUniqueKey() {
	
		return "geoCode";
	}

	@Override
	public String getUniqueValue() {
	
		return geoCode;
	}

	@Override
	public String getLabel() {
		
		return "geoCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("geoCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("geoCode", geoCode);
		return map;
	}

}
