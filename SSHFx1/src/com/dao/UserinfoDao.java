package com.dao;

import java.util.List;

import com.model.Userinfo;

public interface UserinfoDao {

	public List<Userinfo> findAll();
	
	//Ìí¼Ó
		public void save(Userinfo userinfo);
}
