package com.action;

import java.util.List;

import com.model.Userinfo;
import com.service.UserinfoService;

public class TestAction {
	
	private UserinfoService userinfoService;

	public UserinfoService getUserinfoService() {
		return userinfoService;
	}
	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}
	
	public String findUserinfoAll() {
		System.out.println("�����̨�������� ��ѯ��������Userinfo");
		List<Userinfo> findAll = userinfoService.findAll();
		System.out.println(findAll);
		
		Userinfo info = new Userinfo();
		info.setUsercard("1111111");
		info.setUserpwd("123");
		info.setUserphone("12332112312");
		info.setUseraddress("��¼��as");
		userinfoService.save(info);
		System.out.println("ִ�������ϣ�");
		return "success";
	}
	
}
