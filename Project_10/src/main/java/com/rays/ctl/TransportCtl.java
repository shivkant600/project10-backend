package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.TransportDTO;
import com.rays.form.TransportForm;
import com.rays.service.TransportServiceInt;

@RestController
@RequestMapping(value = "Transport")
public class TransportCtl extends BaseCtl<TransportForm, TransportDTO, TransportServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
