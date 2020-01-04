package com.karthik.rest.webservices.restfulwebservices.user;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {

	private Integer uid;
	private String name;
	private Date birthday;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User(Integer uid, String name, Date birthday) {
		super();
		this.uid = uid;
		this.name = name;
		this.birthday = birthday;
	}
	public User(){
		
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", birthday=" + birthday + "]";
	}
	
	
	
}
