package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_GAMING")
public class GamingDTO extends BaseDTO {

	@Column(name = "tournamentCode", length = 50)
	private String tournamentCode;

	@Column(name = "gameName", length = 50)
	private String gameName;

	@Column(name = "prizePool", length = 50)
	private Integer prizePool;

	@Column(name = "status", length = 50)
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
	public String getValue() {

		return "tournamentCode";
	}

	@Override
	public String getUniqueKey() {
		return "tournamentCode";
	}

	@Override
	public String getUniqueValue() {

		return tournamentCode;
	}

	@Override
	public String getLabel() {

		return "tournamentCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("tournamentCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("tournamentCode", tournamentCode);
		return map;
	}

}
