package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LocationDAOInt;
import com.rays.dto.LocationDTO;

@Service
@Transactional
public class LocationServiceImp extends BaseServiceImpl<LocationDTO, LocationDAOInt> implements LocationServiceInt {

}
