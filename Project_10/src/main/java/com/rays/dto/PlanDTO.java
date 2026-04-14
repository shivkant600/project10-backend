package com.rays.dto;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_PLAN")
public class PlanDTO extends BaseDTO {
	
	@Column(name = "planCode", length = 50)
	private String planCode;
	
	@Column(name = "planName", length = 50)
	private String planName;
	
	@Column(name = "price", length = 50)
	private String price;
	
	@Column(name = "status", length = 50)
	private String status;
	

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "planCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "planCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return planCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "planCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("planCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("planCode", planCode);
		return map;

}
	
}
