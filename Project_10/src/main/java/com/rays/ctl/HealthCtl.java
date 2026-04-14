package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.HealthDTO;
import com.rays.form.HealthForm;
import com.rays.service.HealthServiceInt;
@RestController
@RequestMapping(value = "Health")
public class HealthCtl extends BaseCtl<HealthForm, HealthDTO, HealthServiceInt>{

	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
