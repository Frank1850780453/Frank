package com.jf.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jf.dao.PlayStarDao;
import com.jf.entity.Playstar;
import com.jf.service.PlayStarServcie;

@Service
@Transactional
public class PlayStarServiceImpl implements PlayStarServcie {

	@Autowired
	private PlayStarDao playStarDao;
	
	
	
	/**
	 * 查询所有成员
	 * @return
	 * */
	@Override
	public List<Playstar> findAll() {
		
		return playStarDao.findAll();
	}


	/**
	 * 根据id获取成员信息
	 * */
	@Override
	public Playstar getById(Integer id) {

		
		return playStarDao.getById(id);
	}


	/**
	 * 编辑成员信息
	 * */
	@Override
	public void edit(Integer id, Playstar ps) {
		//通过id查询成员信息
		Playstar playstar = playStarDao.getById(id);
		//判断成员是否存在
		if(playstar != null){
			BeanUtils.copyProperties(ps, playstar);
		}
		playStarDao.update(playstar);
	}


	/**
	 * 删除成员信息
	 * */
	@Override
	public void deleteById(Integer id) {

		Playstar playstar = playStarDao.getById(id);
		//根据id删除成员信息
		if(playstar != null){
			playStarDao.delete(playstar);
		}
	}


	/**
	 * 添加成员信息
	 * */
	@Override
	public void add(Playstar ps) {

		playStarDao.add(ps);
	}

}
