package com.jf.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jf.dao.PlayStarDao;
import com.jf.entity.Playstar;

@Repository
public class PlayStarDaoImpl implements PlayStarDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	/**
	 * 查询所有成员信息
	 * */
	@Override
	public List<Playstar> findAll() {
		List<Playstar> list = this.getCurrentSession().createQuery("from Playstar").list();
		return list;
	}

	/**
	 * 根据id查询成员信息
	 * */
	@Override
	public Playstar getById(Integer id) {
		
		Playstar ps = (Playstar) this.getCurrentSession().get(Playstar.class, id);
		
		return ps;
	}

	/**
	 * 更新成员信息
	 * */
	@Override
	public void update(Playstar playstar) {

		this.getCurrentSession().update(playstar);
	}

	/**
	 * 根据id删除成员信息
	 * */
	@Override
	public void delete(Playstar playstar) {

		this.getCurrentSession().delete(playstar);
	}

	/**
	 * 添加成员信息
	 * */
	@Override
	public void add(Playstar ps) {
		
		this.getCurrentSession();
	}


		
	

}
