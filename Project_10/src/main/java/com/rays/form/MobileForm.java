package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MobileDTO;

public class MobileForm extends BaseForm {

	@NotEmpty(message = "please enter brandName")
	private String brandName;

	@NotEmpty(message = "please enter modelName")
	private String modelName;

	@NotNull(message = "please enter ram ")
	private Long ram;

	@NotNull(message = "please enter price ")
	private Double price;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Long getRam() {
		return ram;
	}

	public void setRam(Long ram) {
		this.ram = ram;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public BaseDTO getDto() {
		MobileDTO dto = initDTO(new MobileDTO());
		dto.setBrandName(brandName);
		dto.setModelName(modelName);
		dto.setRam(ram);
		dto.setPrice(price);
		return dto;
	}

}
