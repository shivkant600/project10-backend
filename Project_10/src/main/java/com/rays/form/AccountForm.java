package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AccountDTO;

public class AccountForm extends BaseForm {

	@NotEmpty(message = "please enter accountNumber")
	private String accountNumber;

	@NotEmpty(message = "please enter holderName")
	private String holderName;

	@NotEmpty(message = "please enter accountType")
	private String accountType;


	@NotNull(message = "please enter balance ")
	
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
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		AccountDTO dto = initDTO(new AccountDTO());
		dto.setAccountNumber(accountNumber);
		dto.setHolderName(holderName);
		dto.setAccountType(accountType);
		dto.setBalance(balance);
		return dto;
	}

}
