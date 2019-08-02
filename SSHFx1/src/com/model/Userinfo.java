package com.model;

public class Userinfo {
	private Integer uid;
	private String usercard;
	private String userpwd;
	private String userphone;
	private String useraddress;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsercard() {
		return usercard;
	}
	public void setUsercard(String usercard) {
		this.usercard = usercard;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	@Override
	public String toString() {
		return "Userinfo [uid=" + uid + ", usercard=" + usercard + ", userpwd=" + userpwd + ", userphone=" + userphone
				+ ", useraddress=" + useraddress + "]";
	}
	
}
