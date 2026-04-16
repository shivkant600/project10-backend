package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CredentialDAOInt;
import com.rays.dto.CredentialDTO;

@Service
@Transactional
public class CredentialServiceImp extends BaseServiceImpl<CredentialDTO, CredentialDAOInt> implements CredentialServiceInt{

}
