package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SponsorDAOInt;
import com.rays.dto.SponsorDTO;

@Service
@Transactional
public class SponsorServiceimpl extends BaseServiceImpl<SponsorDTO, SponsorDAOInt> implements SponsorServiceint{

}
