package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PlanDTO;
import com.rays.form.PlanForm;
import com.rays.service.PlanServiceInt;

@RestController
@RequestMapping(value = "Plan")
public class PlanCtl extends BaseCtl<PlanForm, PlanDTO, PlanServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
