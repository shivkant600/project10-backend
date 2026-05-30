package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MobileDAOInt;
import com.rays.dto.MobileDTO;

@Service
@Transactional
public class MobileServiceImpl extends BaseServiceImpl<MobileDTO, MobileDAOInt> implements MobileServiceInt {

}
