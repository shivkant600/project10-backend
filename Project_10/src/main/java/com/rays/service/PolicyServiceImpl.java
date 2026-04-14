package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PolicyDAOInt;
import com.rays.dto.PolicyDTO;

@Service
@Transactional
public class PolicyServiceImpl extends BaseServiceImpl<PolicyDTO, PolicyDAOInt>  implements policyServiceInt{

}
