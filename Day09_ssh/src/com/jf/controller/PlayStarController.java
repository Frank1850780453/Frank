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
	 * ��ѯ���г�Ա��Ϣ,������list.jspҳ��
	 * */
	@RequestMapping("/findAll")
	public String findAll(Model model){
		
		List<Playstar> list = playStarServcie.findAll();
		model.addAttribute("list", list);
		
		return "/jsp/list";
	}
	
	/**
	 * ����id��ѯ��Ա��Ϣ,��ת��edit�༭ҳ��
	 * */
	@RequestMapping("/getById")
	public String getById(Integer id,Model model ) {
		
		Playstar ps = playStarServcie.getById(id);
		
		model.addAttribute("playStarList", ps);
		
		return "/jsp/edit";
	}
	
	/**
	 * �༭��,��ת��list.jspҳ��
	 * 
	 * */
	@RequestMapping("/edit")
	public String edit(Model model,Integer id,@ModelAttribute("playSatrList") Playstar ps){
		
		playStarServcie.edit(id,ps);
		return "forward:findAll.action";
	}
	
	/**
	 * ɾ����Ա��Ϣ
	 * */
	@RequestMapping("/deleteById")
	public String deleteById(Model model,Integer id){
		playStarServcie.deleteById(id);
		return "forward:findAll.action";
	}
	
	/**
	 * ��ӳ�Ա
	 * */
	@RequestMapping("/add")
	public String add(Model model,Playstar ps){
		
		playStarServcie.add(ps);
		return null;
	}
}
