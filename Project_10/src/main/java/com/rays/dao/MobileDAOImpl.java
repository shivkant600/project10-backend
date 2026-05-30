package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MobileDTO;

@Repository
public class MobileDAOImpl  extends BaseDAOImpl<MobileDTO> implements MobileDAOInt{

	@Override
	protected List<Predicate> getWhereClause(MobileDTO dto, CriteriaBuilder builder, Root<MobileDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getBrandName())) {

			whereCondition.add(builder.like(qRoot.get("brandName"), dto.getBrandName()+ "%"));
		}
		
		
		if (!isEmptyString(dto.getModelName())) {

			whereCondition.add(builder.like(qRoot.get("modelName"), dto.getModelName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<MobileDTO> getDTOClass() {
		
		return MobileDTO.class;
	}

}
