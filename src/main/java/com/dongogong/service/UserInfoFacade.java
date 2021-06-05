package com.dongogong.service;

import java.util.List;

import com.dongogong.domain.UserInfo;

public interface UserInfoFacade {
   
   UserInfo getUserInfo(String userId);
   
   UserInfo getUserInfo(String userId, String password);

   //회원 등록
   void insertUserInfo(UserInfo userInfo);
      
   // 회원 수정
   void updateUserInfo(UserInfo userInfo);
   
   //회원 탈퇴
   void deleteUserInfo(String userId, String password);
   void deleteAuctionInfo(String userId);
   void deletePostInfo(String userId);
   void deleteChatInfo(String userId);
   void deleteRelation(String userId);
   void deleteTransaction(String userId);
   
   //UserInfo deleteUserInfo(String userId);
   //boolean passChk(UserInfo userInfo, UserInfo passward);
   
   int idChk(UserInfo userInfo);
   
   List<String> getUsernameList();
}