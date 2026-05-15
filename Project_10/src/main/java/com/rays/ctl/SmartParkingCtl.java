package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SmartParkingDTO;
import com.rays.form.SmartParkingForm;
import com.rays.service.SmartParkingServiceInt;

@RestController
@RequestMapping(value = "Smartparking")
public class SmartParkingCtl extends BaseCtl<SmartParkingForm, SmartParkingDTO, SmartParkingServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
