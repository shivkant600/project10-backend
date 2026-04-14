package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SponsorDTO;
import com.rays.form.SponsorForm;
import com.rays.service.SponsorServiceint;

@RestController
@RequestMapping(value = "Sponsor")
public class SponsorCtl extends BaseCtl<SponsorForm, SponsorDTO, SponsorServiceint> {

	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
