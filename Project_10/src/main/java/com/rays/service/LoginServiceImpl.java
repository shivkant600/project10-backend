package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LoginDAOInt;
import com.rays.dto.LoginDTO;

@Service
@Transactional
public class LoginServiceImpl extends BaseServiceImpl<LoginDTO, LoginDAOInt> implements LoginServiceInt{

}
