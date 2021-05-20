package com.dongogong.controller;

import com.dongogong.domain.UserInfo;

public class UserSession {

	private UserInfo userInfo;
	
	public UserSession(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
}
