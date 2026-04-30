package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DEVICE")
public class DeviceDTO extends BaseDTO {
	
	
	@Column(name = "deviceCode", length = 50)
	private String deviceCode;
	
	@Column(name = "deviceName", length = 50)
	private String deviceName;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		
		return "deviceCode";
	}

	@Override
	public String getUniqueKey() {
		
		return "deviceCode";
	}

	@Override
	public String getUniqueValue() {
				return deviceCode;
	}

	@Override
	public String getLabel() {
		
		return "deviceCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("deviceCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
	
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("deviceCode", deviceCode);
		return map;	}
	

}
