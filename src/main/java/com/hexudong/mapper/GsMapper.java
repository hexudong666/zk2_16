package com.hexudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;

public interface GsMapper {
	//添加
	int add(GS gs);
	//查询
	List<GS> getList(Vo vo);

	//回显
	@Select("select * from gs where id =#{id}")
	GS getGsByid(int id);

}
