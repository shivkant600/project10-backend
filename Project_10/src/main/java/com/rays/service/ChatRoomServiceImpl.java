package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ChatRoomDAOInt;
import com.rays.dto.ChatRoomDTO;

@Service
@Transactional
public class ChatRoomServiceImpl  extends BaseServiceImpl<ChatRoomDTO, ChatRoomDAOInt> implements ChatRoomServiceInt{

}
