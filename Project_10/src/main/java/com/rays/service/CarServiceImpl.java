package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CarDAOInt;
import com.rays.dto.CarDTO;

@Service
@Transactional
public class CarServiceImpl extends BaseServiceImpl<CarDTO, CarDAOInt>  implements CarServiceInt{

}
