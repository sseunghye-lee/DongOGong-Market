package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.dongogong.domain.UserInfo;

public interface UserInfoDao {   //회원
   
   UserInfo getUserInfo(String userId) throws DataAccessException;
   
   UserInfo getUserInfo(String userId, String password) throws DataAccessException;
   
   void insertUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 가입
   
   void updateUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 수정
   
   //void deleteUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 탈퇴
   UserInfo deleteUserInfo(String userId) throws DataAccessException;
   
   //boolean passChk(UserInfo userInfo, UserInfo passward) throws DataAccessException;   //회원 탈퇴 시 패스워드 체크
   
   List<String> getUsernameList() throws DataAccessException;
   
   //List<UserInfo> findUserList() throws DataAccessException;
   
   //List<UserInfo> findUserList(int currentPage, int countPerPaga) throws DataAccessException;
   
}
