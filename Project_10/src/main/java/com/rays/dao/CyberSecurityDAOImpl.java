package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CyberSecurityDTO;

@Repository
public class CyberSecurityDAOImpl extends BaseDAOImpl<CyberSecurityDTO> implements CyberSecurityDAOInt{

	@Override
	protected List<Predicate> getWhereClause(CyberSecurityDTO dto, CriteriaBuilder builder,
			Root<CyberSecurityDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getAttackType())) {

			whereCondition.add(builder.like(qRoot.get("attackType"), dto.getAttackType() + "%"));
		}
		
		
		if (!isEmptyString(dto.getSeverity())) {

			whereCondition.add(builder.like(qRoot.get("severity"), dto.getSeverity() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<CyberSecurityDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return CyberSecurityDTO.class;
	}

}
