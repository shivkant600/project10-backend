package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VerificationDTO;

@Repository
public class VerificationDAOImpl extends BaseDAOImpl<VerificationDTO> implements VerificationDAOInt{

	@Override
	protected List<Predicate> getWhereClause(VerificationDTO dto, CriteriaBuilder builder,
			Root<VerificationDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getUserName())) {

			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}	
		
		if (!isEmptyString(dto.getType())) {

			whereCondition.add(builder.like(qRoot.get("type"), dto.getType() + "%"));
		}	
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}	
		return whereCondition;
	}

	@Override
	public Class<VerificationDTO> getDTOClass() {
		
		return VerificationDTO.class;
	}

}
