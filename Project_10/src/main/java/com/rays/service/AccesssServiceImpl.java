package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AccessDAOInt;
import com.rays.dto.AccessDTO;

@Service
@Transactional
public class AccesssServiceImpl extends BaseServiceImpl<AccessDTO, AccessDAOInt> implements AccessServiceInt{

}
