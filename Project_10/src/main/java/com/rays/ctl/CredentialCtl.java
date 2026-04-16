package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CredentialDTO;
import com.rays.form.CredentialForm;
import com.rays.service.CredentialServiceInt;

@RestController
@RequestMapping(value = "Credential")
public class CredentialCtl extends BaseCtl<CredentialForm, CredentialDTO, CredentialServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
