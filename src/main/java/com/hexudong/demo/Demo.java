package com.hexudong.demo;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.hexudong.cms.utils.entity.FileUtils;
import com.hexudong.cms.utils.entity.StringUtils;
import com.hexudong.entity.GS;
import com.hexudong.service.GsService;

public class Demo {

	@Autowired
	private GsService service;
	/**
	 * 
	    * @Title: testReadLines
	    * @Description: 读取文件
	    * @param @throws IOException    参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testReadLines() throws IOException {
		
		List<String> lines = FileUtils.readByLines("E:\\cms附件-机械设备公司年检信息.txt");
		
		
		for (String string : lines) {
			String[] split = string.split("\\	");
			//添加
			GS gs = new GS();
			
			//id
			if (StringUtils.isNumber(split[0])==true) {
				gs.setId(split[0]);
			}else {
				System.err.println(gs.getId()+"不是数字");
			}
			
			//关键字
			if (StringUtils.haveValue(split[1])==true) {
				gs.setGjz(split[1]);
			}else {
				System.err.println(gs.getId()+"关键字没有值");
			}
			
			//描述
			if (StringUtils.haveValue(split[2])==true) {
				gs.setMs(split[2]);
			}else {
				System.err.println(gs.getId()+"描述没有值");
			}
			
			//公司名字
			if (StringUtils.haveValue(split[3])==true) {
				gs.setGsname(split[3]);
			}else {
				System.err.println(gs.getId()+"公司名字没有值");
			}
			
			
			//主营产品
			if (StringUtils.haveValue(split[4])==true) {
				gs.setGsname(split[4]);
			}else {
				System.err.println(gs.getId()+"主营产品没有值");
			}
			
			//地址
			if (StringUtils.haveValue(split[5])==true) {
				gs.setGsname(split[5]);
			}else {
				System.err.println(gs.getId()+"地址没有值");
			}
			
			
			//注册资本
			gs.setZb(split[6]);
			
			//成立时间
			if (StringUtils.haveValue(split[7])==true) {
				gs.setGsname(split[7]);
			}else {
				System.err.println(gs.getId()+"成立时间没有值");
			}
			
			//年检时间
			if (StringUtils.haveValue(split[8])==true) {
				gs.setGsname(split[8]);
			}else {
				System.err.println(gs.getId()+"年检时间没有值");
			}
			
			//年检状态
			if (StringUtils.haveValue(split[9])==true) {
				gs.setGsname(split[9]);
			}else {
				System.err.println(gs.getId()+"年检状态没有值");
			}
			
			
			//备注
			if (StringUtils.haveValue(split[10])==true) {
				gs.setGsname(split[10]);
			}else {
				System.err.println(gs.getId()+"备注没有值");
			}
			
			System.out.println(gs);
			
			service.add(gs);
			
		}
		
	}
	
}
