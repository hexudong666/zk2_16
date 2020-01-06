package com.hexudong.service;

import java.util.List;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;

public interface GsService {

	int add(GS gs);

	List<GS> getList(Vo vo);

	GS getGsByid(int id);

}
