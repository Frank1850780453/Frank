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
	 * ��ѯ���г�Ա��Ϣ
	 * */
	@Override
	public List<Playstar> findAll() {
		List<Playstar> list = this.getCurrentSession().createQuery("from Playstar").list();
		return list;
	}

	/**
	 * ����id��ѯ��Ա��Ϣ
	 * */
	@Override
	public Playstar getById(Integer id) {
		
		Playstar ps = (Playstar) this.getCurrentSession().get(Playstar.class, id);
		
		return ps;
	}

	/**
	 * ���³�Ա��Ϣ
	 * */
	@Override
	public void update(Playstar playstar) {

		this.getCurrentSession().update(playstar);
	}

	/**
	 * ����idɾ����Ա��Ϣ
	 * */
	@Override
	public void delete(Playstar playstar) {

		this.getCurrentSession().delete(playstar);
	}

	/**
	 * ��ӳ�Ա��Ϣ
	 * */
	@Override
	public void add(Playstar ps) {
		
		this.getCurrentSession();
	}


		
	

}
