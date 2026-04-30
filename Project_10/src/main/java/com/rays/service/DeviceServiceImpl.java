package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DeviceDAOInt;
import com.rays.dto.DeviceDTO;

@Service
@Transactional
public class DeviceServiceImpl extends BaseServiceImpl<DeviceDTO, DeviceDAOInt> implements DeviceServiceInt{

}
