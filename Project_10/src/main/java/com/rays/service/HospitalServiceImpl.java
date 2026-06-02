package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.HospitalDAOInt;
import com.rays.dto.HospitalDTO;

@Service
@Transactional
public class HospitalServiceImpl extends BaseServiceImpl<HospitalDTO, HospitalDAOInt> implements HospitalServiceInt{

}
