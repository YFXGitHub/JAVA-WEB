package com.dao;

import java.util.List;

import com.model.Userinfo;

public interface UserinfoDao {

	public List<Userinfo> findAll();
	
	//���
		public void save(Userinfo userinfo);
}
