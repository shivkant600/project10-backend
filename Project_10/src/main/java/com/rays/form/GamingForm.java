package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GamingDTO;

public class GamingForm extends BaseForm {
  

	@NotEmpty(message = "please enter tournamentCode")
	private String tournamentCode;


	@NotEmpty(message = "please enter gameName")
	private String gameName;


	@NotNull(message = "please enter prizePool ")
	private Integer prizePool;


	@NotEmpty(message = "please enter status")
	private String status;

	public String getTournamentCode() {
		return tournamentCode;
	}

	public void setTournamentCode(String tournamentCode) {
		this.tournamentCode = tournamentCode;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Integer getPrizePool() {
		return prizePool;
	}

	public void setPrizePool(Integer prizePool) {
		this.prizePool = prizePool;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		GamingDTO dto = initDTO(new GamingDTO());
		dto.setTournamentCode(tournamentCode);
		dto.setGameName(gameName);
		dto.setPrizePool(prizePool);
		dto.setStatus(status);
		return dto;
	}

}
