package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm{
	
	
	@NotEmpty(message = "please enter orderCode")
	private String orderCode;
	
	@NotEmpty(message = "please enter customerName")
	private String customerName;
	
	@NotEmpty(message = "please enter totalAmount")
	private String totalAmount;
	
	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		OrderDTO dto = initDTO(new OrderDTO());
		dto.setOrderCode(orderCode);
		dto.setCustomerName(customerName);
		dto.setTotalAmount(totalAmount);
		dto.setStatus(status);
		return dto;
	}
}
