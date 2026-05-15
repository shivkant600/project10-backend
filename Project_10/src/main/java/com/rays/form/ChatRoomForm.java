package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ChatRoomDTO;

public class ChatRoomForm extends BaseForm{
	
	@NotEmpty(message = "please enter chatCode")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Only alphabets and numbers are allowed")
	private String chatCode;
	
	@NotEmpty(message = "please enter roomName")
	private String roomName;
	
	@NotEmpty(message = "please enter madeby")
	private String madeby;
	
	@NotEmpty(message = "please enter status")
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

	

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public BaseDTO getDto() {
		ChatRoomDTO dto = initDTO(new ChatRoomDTO());
		
		dto.setChatCode(chatCode);
		dto.setRoomName(roomName);
		dto.setMadeby(madeby);
		dto.setStatus(status);
		return dto;
	}
}
