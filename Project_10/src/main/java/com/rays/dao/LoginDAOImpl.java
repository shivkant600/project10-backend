package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LoginDTO;

@Repository
public class LoginDAOImpl extends BaseDAOImpl<LoginDTO> implements LoginDAOInt {

	@Override
	protected List<Predicate> getWhereClause(LoginDTO dto, CriteriaBuilder builder, Root<LoginDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getHistoryCode())) {

			whereCondition.add(builder.like(qRoot.get("historyCode"), dto.getHistoryCode() + "%"));
		}

		if (isNotNull(dto.getLoginTime())) {

			whereCondition.add(builder.equal(qRoot.get("loginTime"), dto.getLoginTime()));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<LoginDTO> getDTOClass() {

		return LoginDTO.class;
	}

}
