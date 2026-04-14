package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.StateDAOInt;
import com.rays.dto.StateDTO;

@Service
@Transactional
public class StateServiceImpl extends BaseServiceImpl<StateDTO, StateDAOInt> implements StateServiceInt{

}
