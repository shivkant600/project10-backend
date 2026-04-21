package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MaskingDAOInt;
import com.rays.dto.MaskingDTO;

@Service
@Transactional
public class MaskingServiceImpl extends BaseServiceImpl<MaskingDTO, MaskingDAOInt> implements maskingServiceInt{

}
