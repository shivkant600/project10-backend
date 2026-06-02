package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.HospitalDTO;

@Repository
public class HospitalDAOImpl extends BaseDAOImpl<HospitalDTO> implements HospitalDAOInt{

	@Override
	protected List<Predicate> getWhereClause(HospitalDTO dto, CriteriaBuilder builder, Root<HospitalDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPatientName())) {

			whereCondition.add(builder.like(qRoot.get("patientName"), dto.getPatientName() + "%"));
		}
		
		if (!isEmptyString(dto.getDisease())) {

			whereCondition.add(builder.like(qRoot.get("disease"), dto.getDisease() + "%"));
		}
		
		if (!isEmptyString(dto.getDocterName())) {

			whereCondition.add(builder.like(qRoot.get("docterName"), dto.getDocterName() + "%"));
		}

		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}
		return whereCondition;
	}

	@Override
	public Class<HospitalDTO> getDTOClass() {
		
		return HospitalDTO.class;
	}

}
