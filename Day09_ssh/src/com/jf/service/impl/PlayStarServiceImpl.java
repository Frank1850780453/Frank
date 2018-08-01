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
	 * ��ѯ���г�Ա
	 * @return
	 * */
	@Override
	public List<Playstar> findAll() {
		
		return playStarDao.findAll();
	}


	/**
	 * ����id��ȡ��Ա��Ϣ
	 * */
	@Override
	public Playstar getById(Integer id) {

		
		return playStarDao.getById(id);
	}


	/**
	 * �༭��Ա��Ϣ
	 * */
	@Override
	public void edit(Integer id, Playstar ps) {
		//ͨ��id��ѯ��Ա��Ϣ
		Playstar playstar = playStarDao.getById(id);
		//�жϳ�Ա�Ƿ����
		if(playstar != null){
			BeanUtils.copyProperties(ps, playstar);
		}
		playStarDao.update(playstar);
	}


	/**
	 * ɾ����Ա��Ϣ
	 * */
	@Override
	public void deleteById(Integer id) {

		Playstar playstar = playStarDao.getById(id);
		//����idɾ����Ա��Ϣ
		if(playstar != null){
			playStarDao.delete(playstar);
		}
	}


	/**
	 * ��ӳ�Ա��Ϣ
	 * */
	@Override
	public void add(Playstar ps) {

		playStarDao.add(ps);
	}

}
