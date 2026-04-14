package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HealthDTO;

public class HealthForm extends BaseForm{
	
	@NotEmpty(message = "please enter userName")
	private String userName;
	
	@NotEmpty(message = "please enter moodLevel")
	private String moodLevel;
	
	@NotEmpty(message = "please enter stressScore")
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
	public BaseDTO getDto() {
		HealthDTO dto  = initDTO(new HealthDTO());
		dto.setUserName(userName);
		dto.setMoodLevel(moodLevel);
		dto.setStressScore(stressScore);
		return dto;
	}

}
