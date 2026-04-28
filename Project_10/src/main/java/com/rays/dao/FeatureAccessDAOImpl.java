package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FeatureAccesssDTO;

@Repository
public class FeatureAccessDAOImpl extends BaseDAOImpl<FeatureAccesssDTO> implements FeatureAccessDAOInt {

	@Override
	protected List<Predicate> getWhereClause(FeatureAccesssDTO dto, CriteriaBuilder builder,
			Root<FeatureAccesssDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFeatureName())) {

			whereCondition.add(builder.like(qRoot.get("featureName"), dto.getFeatureName() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<FeatureAccesssDTO> getDTOClass() {

		return FeatureAccesssDTO.class;
	}

}
