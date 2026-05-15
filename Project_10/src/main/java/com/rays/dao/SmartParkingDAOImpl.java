package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SmartParkingDTO;

@Repository
public class SmartParkingDAOImpl extends BaseDAOImpl<SmartParkingDTO> implements SmartParkingDAOInt {

	@Override
	protected List<Predicate> getWhereClause(SmartParkingDTO dto, CriteriaBuilder builder,
			Root<SmartParkingDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getParkingCode())) {

			whereCondition.add(builder.like(qRoot.get("parkingCode"), dto.getParkingCode() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<SmartParkingDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SmartParkingDTO.class;
	}

}
