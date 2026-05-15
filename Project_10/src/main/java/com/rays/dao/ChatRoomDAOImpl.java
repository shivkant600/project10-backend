package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ChatRoomDTO;

@Repository
public class ChatRoomDAOImpl extends BaseDAOImpl<ChatRoomDTO> implements ChatRoomDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ChatRoomDTO dto, CriteriaBuilder builder, Root<ChatRoomDTO> qRoot) {

List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getChatCode())) {

			whereCondition.add(builder.like(qRoot.get("chatCode"), dto.getChatCode() + "%"));
		}
		
		if (!isEmptyString(dto.getRoomName())) {

			whereCondition.add(builder.like(qRoot.get("roomName"), dto.getRoomName() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<ChatRoomDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ChatRoomDTO.class;
	}

}
