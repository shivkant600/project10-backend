package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.GamingDTO;
import com.rays.form.GamingForm;
import com.rays.service.GamingServiceInt;

@RestController
@RequestMapping(value = "Gaming")
public class GamingCtl extends BaseCtl<GamingForm, GamingDTO, GamingServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
