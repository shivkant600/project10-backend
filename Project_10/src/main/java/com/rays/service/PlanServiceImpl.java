package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PlanDAOInt;
import com.rays.dto.PlanDTO;
@Service
@Transactional
public class PlanServiceImpl extends BaseServiceImpl<PlanDTO, PlanDAOInt> implements PlanServiceInt{

}
