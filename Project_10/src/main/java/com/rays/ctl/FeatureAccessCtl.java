package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.FeatureAccesssDTO;
import com.rays.form.FeatureAccessForm;
import com.rays.service.FeatureAccessServiceInt;

@RestController
@RequestMapping(value = "FeatureAccess")
public class FeatureAccessCtl extends BaseCtl<FeatureAccessForm, FeatureAccesssDTO, FeatureAccessServiceInt>{
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {

		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "updated");
		map.put(2, "notupdated");
		map.put(3, "processing");
		map.put(4, "underprocess");
		
		res.addResult("status", map);

		return res;
	}

}
