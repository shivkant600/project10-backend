package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MovieDTO;

public class MovieForm extends BaseForm {

	@NotEmpty(message = "please enter movieName")
	private String movieName;

	@NotEmpty(message = "please enter heroName")
	private String heroName;

	@NotEmpty(message = "please enter rating")
	private String rating;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public BaseDTO getDto() {
		MovieDTO dto = initDTO(new MovieDTO());
		dto.setMovieName(movieName);
		dto.setHeroName(heroName);
		dto.setRating(rating);
		return dto;
	}
}
