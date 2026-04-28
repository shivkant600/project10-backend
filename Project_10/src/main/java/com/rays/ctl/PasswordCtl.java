package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PasswordDTO;
import com.rays.form.PasswordForm;
import com.rays.service.PasswordServiceInt;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping(value = "Password")
public class PasswordCtl extends BaseCtl<PasswordForm, PasswordDTO, PasswordServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "password");
		map.put(2, "oldpassword");
		map.put(3, "confirmpassword");
		
		res.addResult("status", map);

		return res;
	}

}
