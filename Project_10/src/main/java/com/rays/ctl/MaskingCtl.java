package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.MaskingDTO;
import com.rays.form.MaskingForm;
import com.rays.service.maskingServiceInt;

@RestController
@RequestMapping(value = "Masking")
public class MaskingCtl extends BaseCtl<MaskingForm, MaskingDTO, maskingServiceInt> {

	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
