package com.hexudong.service;

import java.util.List;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;

public interface GsService {
	//添加
	int add(GS gs);
	//列表
	List<GS> getList(Vo vo);

	//回显
	GS getGsByid(int id);

}
