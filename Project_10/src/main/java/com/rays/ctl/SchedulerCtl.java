package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SchedulerDTO;
import com.rays.form.SchedulerForm;
import com.rays.service.SchedulerServiceInt;

@RestController
@RequestMapping(value = "Scheduler")
public class SchedulerCtl extends BaseCtl<SchedulerForm, SchedulerDTO, SchedulerServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}
