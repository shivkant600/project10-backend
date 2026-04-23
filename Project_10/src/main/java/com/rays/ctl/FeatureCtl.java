package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.FeatureDTO;
import com.rays.form.FeatureForm;
import com.rays.service.FeatureServiceInt;

@RestController
@RequestMapping(value = "Feature")
public class FeatureCtl extends BaseCtl<FeatureForm, FeatureDTO, FeatureServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}
