package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ActivityDTO;

public class ActivityForm extends BaseForm {

	@NotEmpty(message = "please enter activityCode")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Only alphabets and numbers are allowed")
	private String activityCode;

	@NotEmpty(message = "please enter userName")
	private String userName;

	@NotEmpty(message = "please enter activityType")
	private String activityType;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		ActivityDTO dto = initDTO(new ActivityDTO());
		dto.setActivityCode(activityCode);
		dto.setUserName(userName);
		dto.setActivityType(activityType);
		dto.setStatus(status);
		return dto;
	}

}
