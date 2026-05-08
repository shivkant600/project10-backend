package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VerificationDAOInt;
import com.rays.dto.VerificationDTO;

@Service
@Transactional
public class VerificationServiceImpl extends BaseServiceImpl<VerificationDTO, VerificationDAOInt> implements VerificationServiceInt{

}
