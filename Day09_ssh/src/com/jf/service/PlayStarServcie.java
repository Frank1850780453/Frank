package com.jf.service;

import java.util.List;

import com.jf.entity.Playstar;

public interface PlayStarServcie {
	/**
	 * ��ѯ����
	 * */
	public List<Playstar> findAll();

	/**
	 * ����id����
	 * */
	public Playstar getById(Integer id);

	/**
	 * �༭��Ϣ
	 * */
	public void edit(Integer id, Playstar ps);

	/**
	 * ����idɾ��
	 * */
	public void deleteById(Integer id);

	/**
	 * ��ӳ�Ա
	 * */
	public void add(Playstar ps);
}
