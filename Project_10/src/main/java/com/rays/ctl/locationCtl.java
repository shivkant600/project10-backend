package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LocationDTO;
import com.rays.form.LocationForm;
import com.rays.service.LocationServiceInt;

@RestController
@RequestMapping(value = "Location")
public class locationCtl extends BaseCtl<LocationForm, LocationDTO, LocationServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
