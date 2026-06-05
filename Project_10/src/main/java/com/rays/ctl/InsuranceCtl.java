package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InsuranceDTO;
import com.rays.form.InsuranceForm;
import com.rays.service.InsuranceServiceInt;

@RestController
@RequestMapping(value = "Insurance")
public class InsuranceCtl extends BaseCtl<InsuranceForm, InsuranceDTO, InsuranceServiceInt> {
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}
