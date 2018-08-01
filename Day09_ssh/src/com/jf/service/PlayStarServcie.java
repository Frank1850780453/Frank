package com.jf.service;

import java.util.List;

import com.jf.entity.Playstar;

public interface PlayStarServcie {
	/**
	 * 查询所有
	 * */
	public List<Playstar> findAll();

	/**
	 * 根据id查找
	 * */
	public Playstar getById(Integer id);

	/**
	 * 编辑信息
	 * */
	public void edit(Integer id, Playstar ps);

	/**
	 * 根据id删除
	 * */
	public void deleteById(Integer id);

	/**
	 * 添加成员
	 * */
	public void add(Playstar ps);
}
