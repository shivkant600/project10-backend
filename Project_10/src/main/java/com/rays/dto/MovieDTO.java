package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_MOVIE")
public class MovieDTO extends BaseDTO {

	@Column(name = "movieName", length = 50)
	private String movieName;

	@Column(name = "heroName", length = 50)
	private String heroName;

	@Column(name = "rating", length = 50)
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
	public String getValue() {

		return "movieName";
	}

	@Override
	public String getUniqueKey() {

		return "movieName";
	}

	@Override
	public String getUniqueValue() {

		return movieName;
	}

	@Override
	public String getLabel() {

		return "movieName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("movieName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("movieName", movieName);
		return map;
	}

}
