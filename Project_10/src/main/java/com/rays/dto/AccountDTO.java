package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ACCOUNT")
public class AccountDTO extends BaseDTO{
	
	@Column(name = "accountNumber", length = 50)
	private String accountNumber;
	
	@Column(name = "holderName", length = 50)
	private String holderName;
	
	@Column(name = "accountType", length = 50)
	private String accountType;
	
	@Column(name = "balance", length = 50)
	private Double balance;
	
	



	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "holderName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "holderName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return holderName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "holderName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("holderName", "asc");

		return map;	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("holderName", holderName);
		return map;
	}
	

}
