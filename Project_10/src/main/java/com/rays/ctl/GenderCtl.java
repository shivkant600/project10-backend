package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.GenderDTO;
import com.rays.form.GenderForm;
import com.rays.service.GenderServiceInt;

@RestController
@RequestMapping(value = "Gender")
public class GenderCtl extends BaseCtl<GenderForm, GenderDTO, GenderServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
