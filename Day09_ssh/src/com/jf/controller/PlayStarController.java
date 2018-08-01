package com.jf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jf.entity.Playstar;
import com.jf.service.PlayStarServcie;

@Controller
@RequestMapping("/playStar")
public class PlayStarController {
	
	@Autowired
	private PlayStarServcie playStarServcie;
	
	/**
	 * 查询所有成员信息,反馈到list.jsp页面
	 * */
	@RequestMapping("/findAll")
	public String findAll(Model model){
		
		List<Playstar> list = playStarServcie.findAll();
		model.addAttribute("list", list);
		
		return "/jsp/list";
	}
	
	/**
	 * 根据id查询成员信息,跳转到edit编辑页面
	 * */
	@RequestMapping("/getById")
	public String getById(Integer id,Model model ) {
		
		Playstar ps = playStarServcie.getById(id);
		
		model.addAttribute("playStarList", ps);
		
		return "/jsp/edit";
	}
	
	/**
	 * 编辑后,跳转到list.jsp页面
	 * 
	 * */
	@RequestMapping("/edit")
	public String edit(Model model,Integer id,@ModelAttribute("playSatrList") Playstar ps){
		
		playStarServcie.edit(id,ps);
		return "forward:findAll.action";
	}
	
	/**
	 * 删除成员信息
	 * */
	@RequestMapping("/deleteById")
	public String deleteById(Model model,Integer id){
		playStarServcie.deleteById(id);
		return "forward:findAll.action";
	}
	
	/**
	 * 添加成员
	 * */
	@RequestMapping("/add")
	public String add(Model model,Playstar ps){
		
		playStarServcie.add(ps);
		return null;
	}
}
