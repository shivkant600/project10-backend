package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MaskingDTO;

@Repository
public class maskingDAOImpl extends BaseDAOImpl<MaskingDTO> implements MaskingDAOInt{

	@Override
	protected List<Predicate> getWhereClause(MaskingDTO dto, CriteriaBuilder builder, Root<MaskingDTO> qRoot) {
		
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getMaskCode())) {

			whereCondition.add(builder.like(qRoot.get("maskCode"), dto.getMaskCode() + "%"));
		}
		
		if (!isEmptyString(dto.getFieldName())) {

			whereCondition.add(builder.like(qRoot.get("fieldName"), dto.getFieldName() + "%"));
		}
	
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<MaskingDTO> getDTOClass() {
		
		return MaskingDTO.class;
	}

}
