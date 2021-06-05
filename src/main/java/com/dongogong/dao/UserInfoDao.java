package com.dongogong.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.dongogong.domain.UserInfo;

public interface UserInfoDao {   //회원
   
   UserInfo getUserInfo(String userId) throws DataAccessException;
   
   UserInfo getUserInfo(String userId, String password) throws DataAccessException;
   
   void insertUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 가입
   
   void updateUserInfo(UserInfo userInfo) throws DataAccessException;      //회원 수정
   
   void deleteUserInfo(String userId, String password) throws DataAccessException; 
   void deleteAuctionInfo(String userId) throws DataAccessException;
   void deletePostInfo(String userId) throws DataAccessException;
   void deleteChatInfo(String userId) throws DataAccessException;
   void deleteRelation(String userId) throws DataAccessException;
   void deleteTransaction(String userId) throws DataAccessException;
   //회원 탈퇴
   //UserInfo deleteUserInfo(String userId) throws DataAccessException;
   
   //boolean passChk(UserInfo userInfo, UserInfo passward) throws DataAccessException;   //회원 탈퇴 시 패스워드 체크
   
   List<String> getUsernameList() throws DataAccessException;
   
   int idChk(UserInfo userInfo) throws DataAccessException;	//회원가입 시 아이디 중복 체크
   
   //int nickNameChk(UserInfo userInfo) throws DataAccessException;	// 회원가입 시 닉네입 중복 체크
   //List<UserInfo> findUserList() throws DataAccessException;
   
   //List<UserInfo> findUserList(int currentPage, int countPerPaga) throws DataAccessException;
   
}
