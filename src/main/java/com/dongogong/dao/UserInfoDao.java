package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.dongogong.domain.UserInfo;

public interface UserInfoDao {	//회원
	//int insertUser(User user_id) throws DataAccessException;
	void insertUser(UserInfo user) throws DataAccessException;
	//void insertUser(User user_id) throws DataAccessException;	//회원 가입
	
	//int updateUser(User user_id) throws DataAccessException;
	void updateUser(UserInfo user) throws DataAccessException;
	//void updateUser(User user_id) throws DataAccessException;	//회원 수정
	
	//int userRemove(String user_id) throws DataAccessException;
	void deleteUser(UserInfo user) throws DataAccessException;		//회원 탈퇴
	
	List<UserInfo> findUserList() throws DataAccessException;
	
	List<UserInfo> findUserList(int currentPage, int countPerPaga) throws DataAccessException;
	
}

