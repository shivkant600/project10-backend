package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SponsorDTO;

@Repository
public class SponsorDAOImpl extends BaseDAOImpl<SponsorDTO> implements SponsorDAOInt{

	@Override
	protected List<Predicate> getWhereClause(SponsorDTO dto, CriteriaBuilder builder, Root<SponsorDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getSponsorName())) {

			whereCondition.add(builder.like(qRoot.get("sponsorName"), dto.getSponsorName() + "%"));
		}
		
	
	
	
	if (!isEmptyString(dto.getContactPerson())) {

		whereCondition.add(builder.like(qRoot.get("contactPerson"), dto.getContactPerson() + "%"));
	}
	
		return whereCondition;
	}

	

	@Override
	public Class<SponsorDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SponsorDTO.class;
	}

}
