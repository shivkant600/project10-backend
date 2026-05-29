package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CyberSecurityDAOInt;
import com.rays.dto.CyberSecurityDTO;

@Service
@Transactional
public class CyberSecurityServiceImpl extends BaseServiceImpl<CyberSecurityDTO, CyberSecurityDAOInt>
		implements CyberSecurityServiceInt {

}
