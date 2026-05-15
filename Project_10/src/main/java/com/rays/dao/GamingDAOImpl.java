package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.GamingDTO;

@Repository
public class GamingDAOImpl extends BaseDAOImpl<GamingDTO> implements GamingDAOInt {

	@Override
	protected List<Predicate> getWhereClause(GamingDTO dto, CriteriaBuilder builder, Root<GamingDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTournamentCode())) {

			whereCondition.add(builder.like(qRoot.get("tournamentCode"), dto.getTournamentCode() + "%"));
		}

		if (!isEmptyString(dto.getGameName())) {

			whereCondition.add(builder.like(qRoot.get("gameName"), dto.getGameName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<GamingDTO> getDTOClass() {

		return GamingDTO.class;
	}

}
