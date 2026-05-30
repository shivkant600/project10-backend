package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_MOBILE")
public class MobileDTO extends BaseDTO {

	@Column(name = "brandName", length = 50)
	private String brandName;

	@Column(name = "modelName", length = 50)
	private String modelName;

	@Column(name = "ram", length = 50)
	private Long ram;

	@Column(name = "price", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "brandName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "brandName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return brandName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "brandName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("brandName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("brandName", brandName);
		return map;
	}

}
