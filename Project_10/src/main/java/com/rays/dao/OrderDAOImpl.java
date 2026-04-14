package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OrderDTO;

@Repository
public class OrderDAOImpl extends BaseDAOImpl<OrderDTO> implements OrderDAOInt {

	@Override
	protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getOrderCode())) {

			whereCondition.add(builder.like(qRoot.get("orderCode"), dto.getOrderCode() + "%"));
		}

		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<OrderDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return OrderDTO.class;
	}

}
