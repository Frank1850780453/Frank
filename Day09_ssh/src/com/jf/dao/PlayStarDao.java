package com.jf.dao;

import java.util.List;

import com.jf.entity.Playstar;

public interface PlayStarDao {
	
	/**
	 * ��ѯ���г�Ա
	 * */
	public List<Playstar> findAll();

	/**
	 * ����id��ȡ��Ա��Ϣ
	 * */
	public Playstar getById(Integer id);

	/**
	 * ���³�Ա��Ϣ
	 * */
	public void update(Playstar playstar);

	/**
	 * ����id��ѯ
	 * @return 
	 * */
	public void delete(Playstar playstar);

	/**
	 * ��ӳ�Ա��Ϣ
	 * */
	public void add(Playstar ps);


	
}
