package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dongogong.domain.UserInfo;

@Mapper
public interface UserInfoMapper {

	//int insertUser(User user_id);
	void insertUser(UserInfo user);
	//void insertUser(User user_id);	
	
	void insertSignon(UserInfo user);
	//void insertSignon(User user_id);
	
	//int updateUser(User user_id);
	void updateUser(UserInfo user);
	//void updateUser(User user_id);
	
	void updateSignon(UserInfo user);
	//void updateSignon(User user_id);
	
	//int userRemove(String user_id);
	void deleteUser(UserInfo user);
	//void deleteUser(String user_id);
	
	UserInfo findUser(String user_id);
	
	List<UserInfo> findUserList();
	
	List<UserInfo> findUserList(int currentPage, int countPerPaga);
	
	boolean existingUser(String user_id);	
}
