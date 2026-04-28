package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PasswordDAOInt;
import com.rays.dto.PasswordDTO;

@Service
@Transactional
public class PasswordServiceImpl extends BaseServiceImpl<PasswordDTO, PasswordDAOInt> implements PasswordServiceInt{

}
