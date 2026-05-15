package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_RoomChat")
public class ChatRoomDTO extends BaseDTO{
	
	@Column(name = "chatCode", length = 50)
	private String chatCode;
	
	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	@Column(name = "roomName", length = 50)
	private String roomName;
	
	@Column(name = "madeby", length = 50)
	private String madeby;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getChatCode() {
		return chatCode;
	}

	public void setChatCode(String chatCode) {
		this.chatCode = chatCode;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "chatCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "chatCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return chatCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "chatCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("chatCode", "asc");

		return map;	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("chatCode", chatCode);
		return map;
	}

}
