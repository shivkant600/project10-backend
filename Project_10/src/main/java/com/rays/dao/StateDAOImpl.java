package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StateDTO;

@Repository
public class StateDAOImpl extends BaseDAOImpl<StateDTO> implements StateDAOInt{

	@Override
	protected List<Predicate> getWhereClause(StateDTO dto, CriteriaBuilder builder, Root<StateDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getStateCode())) {

			whereCondition.add(builder.like(qRoot.get("stateCode"), dto.getStateCode() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStateName())) {

			whereCondition.add(builder.like(qRoot.get("stateName"), dto.getStateName() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
			return whereCondition;
		}

	@Override
	public Class<StateDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return StateDTO.class;
	}

}
