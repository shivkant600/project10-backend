package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ChatRoomDTO;
import com.rays.form.ChatRoomForm;
import com.rays.service.ChatRoomServiceInt;

@RestController
@RequestMapping(value = "Chat")
public class ChatRoomCtl extends BaseCtl<ChatRoomForm, ChatRoomDTO, ChatRoomServiceInt> {

	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
