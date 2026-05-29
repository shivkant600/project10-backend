package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MovieDTO;

@Repository
public class MovieDAOImpl extends BaseDAOImpl<MovieDTO> implements MovieDAOInt{

	@Override
	protected List<Predicate> getWhereClause(MovieDTO dto, CriteriaBuilder builder, Root<MovieDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getMovieName())) {

			whereCondition.add(builder.like(qRoot.get("movieName"), dto.getMovieName() + "%"));
		}
		

		if (!isEmptyString(dto.getHeroName())) {

			whereCondition.add(builder.like(qRoot.get("heroName"), dto.getHeroName() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<MovieDTO> getDTOClass() {
		
		return MovieDTO.class;
	}

}
