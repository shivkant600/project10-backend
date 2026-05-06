package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SCHEDULER")
public class SchedulerDTO extends BaseDTO {
	
	@Column(name = "jobCode", length = 50)
	private String jobCode;
	
	@Column(name = "jobName", length = 50)
	private String jobName;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		
		return "jobCode";
	}

	@Override
	public String getUniqueKey() {
	
		return "jobCode";
	}

	@Override
	public String getUniqueValue() {
	
		return jobCode;
	}

	@Override
	public String getLabel() {
		
		return "jobCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("jobCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("jobCode", jobCode);
		return map;
	}
	
	

}
