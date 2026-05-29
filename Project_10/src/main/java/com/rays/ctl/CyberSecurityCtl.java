package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CyberSecurityDTO;
import com.rays.form.CyberSecurityForm;
import com.rays.service.CyberSecurityServiceInt;

@RestController
@RequestMapping(value = "Cyber")
public class CyberSecurityCtl extends BaseCtl<CyberSecurityForm, CyberSecurityDTO, CyberSecurityServiceInt>{
	

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
