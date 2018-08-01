package com.jf.dao;

import java.util.List;

import com.jf.entity.Playstar;

public interface PlayStarDao {
	
	/**
	 * 查询所有成员
	 * */
	public List<Playstar> findAll();

	/**
	 * 根据id获取成员信息
	 * */
	public Playstar getById(Integer id);

	/**
	 * 更新成员信息
	 * */
	public void update(Playstar playstar);

	/**
	 * 根据id查询
	 * @return 
	 * */
	public void delete(Playstar playstar);

	/**
	 * 添加成员信息
	 * */
	public void add(Playstar ps);


	
}
