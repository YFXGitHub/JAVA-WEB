package com.service;

import java.util.List;

import com.model.Userinfo;

public interface UserinfoService {
	
	public List<Userinfo> findAll();
	
	//���
	public void save(Userinfo userinfo);
}
