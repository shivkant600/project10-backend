package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AccountDAOInt;
import com.rays.dto.AccountDTO;

@Service
@Transactional
public class AccountServiceImpl extends BaseServiceImpl<AccountDTO, AccountDAOInt> implements AccountServiceInt{

}
