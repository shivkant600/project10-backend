package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LOGIN")
public class LoginDTO extends BaseDTO {

	@Column(name = "historyCode", length = 50)
	private String historyCode;

	@Column(name = "userName", length = 50)
	private String userName;

	@Column(name = "loginTime", length = 50)
	private Date loginTime;

	@Column(name = "status", length = 50)
	private String status;

	public String getHistoryCode() {
		return historyCode;
	}

	public void setHistoryCode(String historyCode) {
		this.historyCode = historyCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return "historyCode";
	}

	@Override
	public String getUniqueKey() {

		return "historyCode";
	}

	@Override
	public String getUniqueValue() {

		return historyCode;
	}

	@Override
	public String getLabel() {

		return "historyCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("historyCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("historyCode", historyCode);
		return map;
	}

}
