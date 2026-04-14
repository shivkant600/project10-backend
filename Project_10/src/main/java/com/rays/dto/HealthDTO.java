package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_HEALTH")
public class HealthDTO extends BaseDTO{
	
	@Column(name = "userName",length = 50 )
	private String userName;
	
	@Column(name = "moodLevel", length = 50)
	private String moodLevel;
	
	@Column(name = "stressScore", length = 50)
	private String stressScore;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMoodLevel() {
		return moodLevel;
	}

	public void setMoodLevel(String moodLevel) {
		this.moodLevel = moodLevel;
	}

	public String getStressScore() {
		return stressScore;
	}

	public void setStressScore(String stressScore) {
		this.stressScore = stressScore;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("userName", "asc");

		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("userName", userName);
		return map;
	}

}
