package com.dongogong.service;

import java.util.List;
import com.dongogong.domain.UserInfo;

public interface UserInfoService {
	void insertUser(UserInfo user);
	void insertSignon(UserInfo user);
	void updateUser(UserInfo user);
	void updateSignon(UserInfo user);
	void deleteUser(UserInfo user);
	UserInfo findUser(String user_id);
	List<UserInfo> findUserList();
	List<UserInfo> findUserList(int currentPage, int countPerPaga);
}
