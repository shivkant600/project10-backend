package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SchedulerDAOInt;
import com.rays.dto.SchedulerDTO;

@Service
@Transactional
public class SchedulerServiceImpl extends BaseServiceImpl<SchedulerDTO, SchedulerDAOInt> implements SchedulerServiceInt{

}
