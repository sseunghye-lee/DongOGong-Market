package com.dongogong.controller;

import java.io.Serializable;

import com.dongogong.domain.UserInfo;

@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private UserInfo userInfo;
	
	public UserSession(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
}
