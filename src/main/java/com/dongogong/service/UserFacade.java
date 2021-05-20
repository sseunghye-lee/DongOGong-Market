package com.dongogong.service;

import com.dongogong.domain.UserInfo;

public interface UserFacade {
	UserInfo getUserInfo(String string);
	UserInfo getUserInfo(String username, String password);

	//int insertUser(User user_id);
	//void insertUser(User user);
	void insertUser(UserInfo userInfo);
	
	//void insertSignon(User user);
	void insertSignon(UserInfo userInfo);
	
	//int updateUser(User user_id);
	//void updateUser(User user);
	void updateUser(UserInfo userInfo);
	
	//void updateSignon(User user);
	void updateSignon(UserInfo userInfo);
	
	//int userRemove(String user_id);
	void deleteUser(String userId);
}
