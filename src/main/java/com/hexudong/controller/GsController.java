package com.hexudong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hexudong.entity.GS;
import com.hexudong.entity.Vo;
import com.hexudong.service.GsService;

@Controller
public class GsController {

	@Autowired
	GsService service;
	/**
	 * 
	    * @Title: getList
	    * @Description: 列表
	    * @param @param vo
	    * @param @param model
	    * @param @param pageNum
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("list")
	private String getList(Vo vo,Model model,@RequestParam(defaultValue="1")int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<GS> list = service.getList(vo);
		
		PageInfo<GS> info = new PageInfo<>(list);
		
		model.addAttribute("list", list);
		model.addAttribute("vo", vo);
		model.addAttribute("info", info);
		
		
		return "list";
	}
	
	/**
	 * 
	    * @Title: xg
	    * @Description:跳到修改
	    * @param @param id
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("xg")
	private String xg(int id,Model model) {
		GS gs = service.getGsByid(id);
		model.addAttribute("gs", gs);
		return "xg";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
