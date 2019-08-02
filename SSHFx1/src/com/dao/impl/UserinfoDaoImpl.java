package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dao.UserinfoDao;
import com.model.Userinfo;

public class UserinfoDaoImpl implements UserinfoDao {
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	// 查询所有
	@Override
	public List<Userinfo> findAll() {
		
		return (List<Userinfo>) hibernateTemplate.find("from Userinfo");
	}


	//添加
	@Override
	public void save(Userinfo userinfo) {

		this.hibernateTemplate.save(userinfo);
	}

}
