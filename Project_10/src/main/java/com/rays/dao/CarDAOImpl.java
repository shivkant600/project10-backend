package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CarDTO;

@Repository
public class CarDAOImpl extends BaseDAOImpl<CarDTO> implements CarDAOInt {

	@Override
	protected List<Predicate> getWhereClause(CarDTO dto, CriteriaBuilder builder, Root<CarDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getCarModel())) {

			whereCondition.add(builder.like(qRoot.get("carModel"), dto.getCarModel() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<CarDTO> getDTOClass() {

		return CarDTO.class;
	}

}
