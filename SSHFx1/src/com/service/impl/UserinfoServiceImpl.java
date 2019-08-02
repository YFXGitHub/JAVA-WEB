package com.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.UserinfoDao;
import com.model.Userinfo;
import com.service.UserinfoService;

@Transactional
public class UserinfoServiceImpl implements UserinfoService {
	
	private UserinfoDao userinfoDao;
	
	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}
	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	//查询所有
	@Override
	public List<Userinfo> findAll() {

		return userinfoDao.findAll();
	}
	
	//添加
	@Override
	public void save(Userinfo userinfo) {
		
		userinfoDao.save(userinfo);
	}

}
