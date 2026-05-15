package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SmartParkingDAOInt;
import com.rays.dto.SmartParkingDTO;

@Service
@Transactional
public class SmartParkingServiceImpl extends BaseServiceImpl<SmartParkingDTO, SmartParkingDAOInt>
		implements SmartParkingServiceInt {

}
