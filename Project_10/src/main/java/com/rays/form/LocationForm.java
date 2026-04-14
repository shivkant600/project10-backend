package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LocationDTO;

public class LocationForm extends BaseForm{
	
	@NotEmpty(message = "please enter geoCode")
	private String geoCode;
	
	@NotEmpty(message = "please enter latitude")
	private String latitude;
	
	@NotEmpty(message = "please enter longitude")
	private String longitude;
	
	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		LocationDTO dto = initDTO(new LocationDTO());
		dto.setGeoCode(geoCode);
		dto.setLatitude(latitude);
		dto.setLongitude(longitude);
		dto.setStatus(status);
		return dto;
	}
	
	

}
