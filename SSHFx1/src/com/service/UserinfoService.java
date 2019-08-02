package com.service;

import java.util.List;

import com.model.Userinfo;

public interface UserinfoService {
	
	public List<Userinfo> findAll();
	
	//Ìí¼Ó
	public void save(Userinfo userinfo);
}
