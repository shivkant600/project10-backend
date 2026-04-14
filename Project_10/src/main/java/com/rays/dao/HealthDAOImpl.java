package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.HealthDTO;

@Repository
public class HealthDAOImpl extends BaseDAOImpl<HealthDTO> implements HealthDAOInt{

	@Override
	protected List<Predicate> getWhereClause(HealthDTO dto, CriteriaBuilder builder, Root<HealthDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getUserName())) {

			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		if (!isEmptyString(dto.getMoodLevel())) {

			whereCondition.add(builder.like(qRoot.get("moodLevel"), dto.getMoodLevel() + "%"));
		}
		
		if (!isEmptyString(dto.getStressScore())) {

			whereCondition.add(builder.like(qRoot.get("alertCode"), dto.getStressScore() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<HealthDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return HealthDTO.class;
	}

}
