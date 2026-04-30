package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ComplaintDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.ComplaintForm;
import com.rays.service.ComplaintServiceImpl;
import com.rays.service.ComplaintServiceInt;

@RestController
@RequestMapping(value = "Complaint")
public class ComplaintCtl extends BaseCtl<ComplaintForm, ComplaintDTO, ComplaintServiceInt> {
	    
	@Autowired
	ComplaintServiceInt ComplaintService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		ComplaintDTO dto = new ComplaintDTO();
	
		List<DropdownList> list = ComplaintService.search(dto, userContext);
		res.addResult("ComplaintList", list);
		return res;
	}

}
