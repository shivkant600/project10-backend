package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SchedulerDTO;

public class SchedulerForm extends BaseForm {


	@NotEmpty(message = "please enter jobCode")
	private String jobCode;


	@NotEmpty(message = "please enter jobName")
	private String jobName;


	@NotEmpty(message = "please enter status")
	private String status;

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		SchedulerDTO dto = initDTO(new SchedulerDTO());
		dto.setJobCode(jobCode);
		dto.setJobName(jobName);
		dto.setStatus(status);
		return dto;
	}

}
