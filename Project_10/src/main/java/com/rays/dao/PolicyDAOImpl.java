package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PolicyDTO;

@Repository
public class PolicyDAOImpl   extends BaseDAOImpl<PolicyDTO> implements PolicyDAOInt {

	@Override
	protected List<Predicate> getWhereClause(PolicyDTO dto, CriteriaBuilder builder, Root<PolicyDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getPolicyName())) {

			whereCondition.add(builder.like(qRoot.get("policyName"), dto.getPolicyName() + "%"));
		}
		
	if (isNotNull(dto.getStartDate())) {

			whereCondition.add(builder.equal(qRoot.get("startDate"), dto.getStartDate()));
		}
	
	
	
	
		return whereCondition;
	}

	@Override
	public Class<PolicyDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PolicyDTO.class;
	}

}
