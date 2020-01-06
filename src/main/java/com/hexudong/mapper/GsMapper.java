package com.hexudong.mapper;

import java.util.List;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;

public interface GsMapper {

	int add(GS gs);

	List<GS> getList(Vo vo);

}
