package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserClass {
	@Id
private int userid;
private String uname;
private String password;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
