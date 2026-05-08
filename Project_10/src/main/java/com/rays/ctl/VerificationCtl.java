package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.VerificationDTO;
import com.rays.form.VerificationForm;
import com.rays.service.VerificationServiceInt;

@RestController
@RequestMapping(value = "Verification")
public class VerificationCtl extends BaseCtl<VerificationForm, VerificationDTO, VerificationServiceInt> {
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
