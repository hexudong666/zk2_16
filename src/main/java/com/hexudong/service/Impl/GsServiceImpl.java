package com.hexudong.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;
import com.hexudong.mapper.GsMapper;
import com.hexudong.service.GsService;

@Service
public class GsServiceImpl implements GsService {

	@Autowired
	GsMapper mapper;
	
	@Override
	public int add(GS gs) {
		return mapper.add(gs);
	}
	
	@Override
	public List<GS> getList(Vo vo) {
		return mapper.getList(vo);
	}
	@Override
	public GS getGsByid(int id) {
		
		return mapper.getGsByid(id);
	}
	
}
