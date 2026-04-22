package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AccessDTO;

@Repository
public class AccessDAOImpl extends BaseDAOImpl<AccessDTO>implements AccessDAOInt{

	@Override
	protected List<Predicate> getWhereClause(AccessDTO dto, CriteriaBuilder builder, Root<AccessDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getUserName())) {

			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()+ "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<AccessDTO> getDTOClass() {
	
		return AccessDTO.class;
	}

}
