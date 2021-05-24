package com.dongogong.controller;

import java.io.Serializable;

import com.dongogong.domain.UserInfo;

@SuppressWarnings("serial")
public class UserInfoForm implements Serializable{
	private UserInfo userInfo;
	
	private boolean newUserInfo;
	
	private String repeatedPassword;
	
	public UserInfoForm(UserInfo userInfo) {
		this.userInfo = userInfo;
		this.newUserInfo = false;
	}
	
	public UserInfoForm() {
		this.userInfo = new UserInfo();
		this.newUserInfo = true;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}
	
	public boolean isNewUserInfo() {
		return newUserInfo;
	}

	public String getRepeatedPassword() {
		return repeatedPassword;
	}

	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}
}
