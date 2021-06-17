package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.dongogong.domain.UserInfo;

public interface UserInfoDao {   //회원
   
   UserInfo getUserInfo(String userId) throws DataAccessException;
   
   UserInfo getUserInfo(String userId, String password) throws DataAccessException;
   
   void insertUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 가입
   
   void updateUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 수정
   
   //회원 탈퇴
   void deleteUserInfo(String userId, String password) throws DataAccessException; 
   void deleteAuctionInfo(String userId) throws DataAccessException;
   void deletePostInfo(String userId) throws DataAccessException;
   void deleteChatInfo(String userId) throws DataAccessException;
   void deleteRelation(String userId) throws DataAccessException;
   void deleteTransaction(String userId) throws DataAccessException;
   
   List<String> getUsernameList() throws DataAccessException;
   
   UserInfo myInfo(String userId) throws DataAccessException;
}
