package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FeatureDTO;

@Repository
public class FeatureDAOImpl extends BaseDAOImpl<FeatureDTO> implements FeatureDAOInt{

	@Override
	protected List<Predicate> getWhereClause(FeatureDTO dto, CriteriaBuilder builder, Root<FeatureDTO> qRoot) {
		
		
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getAccessCode())) {

			whereCondition.add(builder.like(qRoot.get("accessCode"), dto.getAccessCode() + "%"));
		}
		
		if (!isEmptyString(dto.getFeatureName())) {

			whereCondition.add(builder.like(qRoot.get("featureName"), dto.getFeatureName() + "%"));
		}
		
		
		if (!isEmptyString(dto.getUserName())) {

			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		
		

		return whereCondition;
	}

	@Override
	public Class<FeatureDTO> getDTOClass() {
		
		return FeatureDTO.class;
	}

}
