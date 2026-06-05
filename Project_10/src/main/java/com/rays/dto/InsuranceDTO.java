package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_INSURANCE")
public class InsuranceDTO extends BaseDTO {

	@Column(name = "customerCode", length = 50)
	private String customerCode;

	@Column(name = "customerName", length = 50)
	private String customerName;

	@Column(name = "policyType", length = 50)
	private String policyType;

	@Column(name = "amount", length = 50)
	private Double amount;

	@Column(name = "status", length = 50)
	private String status;

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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
		return "customerCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "customerCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return customerCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "customerCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("customerCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("customerCode", customerCode);
		return map;
	}

}
