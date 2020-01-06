package com.hexudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;

public interface GsMapper {

	int add(GS gs);

	List<GS> getList(Vo vo);

	@Select("select * from gs where id =#{id}")
	GS getGsByid(int id);

}
