package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_ORDER")
public class OrderDTO  extends BaseDTO{
	
	@Column(name = "orderCode", length = 50)
	private String orderCode;
	
	@Column(name = "customerName", length = 50)
	private String customerName;
	
	@Column(name = "totalAmount", length = 50)
	private String totalAmount;
	
	@Column(name = "status", length = 50)
	private String status;
	

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
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
		return "orderCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "orderCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return orderCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "orderCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("orderCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("orderCode", orderCode);
		return map;

	}

}
