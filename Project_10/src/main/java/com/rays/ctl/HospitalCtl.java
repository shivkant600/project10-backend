package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.HospitalDTO;
import com.rays.form.HospitalForm;
import com.rays.service.HospitalServiceInt;

@RestController
@RequestMapping(value = "Hospital")
public class HospitalCtl extends BaseCtl<HospitalForm, HospitalDTO, HospitalServiceInt> {

	@Autowired
	HospitalServiceInt HospitalService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		HospitalDTO dto = new HospitalDTO();
		List<DropdownList> list = HospitalService.search(dto, userContext);
		res.addResult("hospitalList", list);

		return res;
	}
}
