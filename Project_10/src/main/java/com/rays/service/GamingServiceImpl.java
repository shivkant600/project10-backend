package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GamingDAOInt;
import com.rays.dto.GamingDTO;

@Service
@Transactional
public class GamingServiceImpl  extends BaseServiceImpl<GamingDTO, GamingDAOInt> implements GamingServiceInt{

}
