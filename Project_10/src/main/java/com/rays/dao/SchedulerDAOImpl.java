package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SchedulerDTO;

@Repository
public class SchedulerDAOImpl extends BaseDAOImpl<SchedulerDTO> implements SchedulerDAOInt{

	@Override
	protected List<Predicate> getWhereClause(SchedulerDTO dto, CriteriaBuilder builder, Root<SchedulerDTO> qRoot) {
		
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getJobCode())) {

			whereCondition.add(builder.like(qRoot.get("jobCode"), dto.getJobCode() + "%"));
		}
		
		
		if (!isEmptyString(dto.getJobName())) {

			whereCondition.add(builder.like(qRoot.get("jobName"), dto.getJobName() + "%"));
		}
		
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<SchedulerDTO> getDTOClass() {
	
		return SchedulerDTO.class;
	}

}
