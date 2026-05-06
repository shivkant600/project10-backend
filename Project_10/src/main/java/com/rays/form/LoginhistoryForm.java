package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoginDTO;

public class LoginhistoryForm extends BaseForm {

	@NotEmpty(message = "please enter historyCode")
	private String historyCode;

	@NotEmpty(message = "please enter userName")
	private String userName;

	@NotNull(message = "please enter loginTime ")
	private Date loginTime;

	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		LoginDTO dto = initDTO(new LoginDTO());
		dto.setHistoryCode(historyCode);
		dto.setUserName(userName);
		dto.setLoginTime(loginTime);
		dto.setStatus(status);
		return dto;
	}

}
