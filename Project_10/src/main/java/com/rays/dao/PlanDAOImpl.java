package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PlanDTO;

@Repository
public class PlanDAOImpl extends BaseDAOImpl<PlanDTO> implements PlanDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PlanDTO dto, CriteriaBuilder builder, Root<PlanDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getPlanCode())) {

			whereCondition.add(builder.like(qRoot.get("planCode"), dto.getPlanCode() + "%"));
		}
		
	if (isNotNull(dto.getPlanName())) {

			whereCondition.add(builder.equal(qRoot.get("planName"), dto.getPlanName()));
		}
	
	
	if (!isEmptyString(dto.getStatus())) {

		whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
	}
	
		return whereCondition;
	}
	

	@Override
	public Class<PlanDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PlanDTO.class;
	}

}
