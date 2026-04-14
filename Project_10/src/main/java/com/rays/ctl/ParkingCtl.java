package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ParkingDTO;
import com.rays.form.ParkingForm;
import com.rays.service.ParkingServiceInt;

@RestController
@RequestMapping(value = "Parking")
public class ParkingCtl extends BaseCtl<ParkingForm, ParkingDTO, ParkingServiceInt>{
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}


}
