package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LoginDTO;
import com.rays.form.LoginhistoryForm;
import com.rays.service.LoginServiceInt;

@RestController
@RequestMapping(value = "Loginhistory")
public class LoginHistoryCtl extends BaseCtl<LoginhistoryForm, LoginDTO, LoginServiceInt> {


	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
