package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.MobileVerificationDTO;
import com.rays.form.MobileVerificationForm;
import com.rays.service.MobileVerificationServiceInt;

@RestController
@RequestMapping(value = "Mobileverification")
public class MobileVerificationCtl extends BaseCtl<MobileVerificationForm, MobileVerificationDTO, MobileVerificationServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}
