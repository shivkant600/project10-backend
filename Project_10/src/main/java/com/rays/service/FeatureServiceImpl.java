package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeatureDAOInt;
import com.rays.dto.FeatureDTO;

@Service
@Transactional
public class FeatureServiceImpl extends BaseServiceImpl<FeatureDTO, FeatureDAOInt> implements FeatureServiceInt{

}
