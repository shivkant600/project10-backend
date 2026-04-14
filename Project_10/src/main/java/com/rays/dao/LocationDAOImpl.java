package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LocationDTO;

@Repository
public class LocationDAOImpl extends BaseDAOImpl<LocationDTO> implements LocationDAOInt {

	@Override
	protected List<Predicate> getWhereClause(LocationDTO dto, CriteriaBuilder builder, Root<LocationDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getGeoCode())) {

			whereCondition.add(builder.like(qRoot.get("geoCode"), dto.getGeoCode() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<LocationDTO> getDTOClass() {
		
		return LocationDTO.class;
	}

}
