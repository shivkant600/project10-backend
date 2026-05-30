package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.MobileDTO;
import com.rays.form.MobileForm;
import com.rays.service.MobileServiceInt;

@RestController
@RequestMapping(value = "Mobile")
public class MobileCtl extends BaseCtl<MobileForm, MobileDTO, MobileServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
