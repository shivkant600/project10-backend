package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeatureAccessDAOInt;
import com.rays.dto.FeatureAccesssDTO;

@Service
@Transactional
public class FeatureAccesssServiceImpl extends BaseServiceImpl<FeatureAccesssDTO, FeatureAccessDAOInt> implements FeatureAccessServiceInt{

}
