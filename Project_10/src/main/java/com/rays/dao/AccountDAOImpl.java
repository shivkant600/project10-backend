package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AccountDTO;

@Repository
public class AccountDAOImpl extends BaseDAOImpl<AccountDTO> implements AccountDAOInt {

	@Override
	protected List<Predicate> getWhereClause(AccountDTO dto, CriteriaBuilder builder, Root<AccountDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAccountType())) {

			whereCondition.add(builder.like(qRoot.get("accountType"), dto.getAccountType() + "%"));
		}

		if (!isEmptyString(dto.getHolderName())) {

			whereCondition.add(builder.like(qRoot.get("holderName"), dto.getHolderName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<AccountDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return AccountDTO.class;
	}

}
