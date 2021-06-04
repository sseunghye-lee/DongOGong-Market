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
   
   //void deleteUserInfo(UserInfo userInfo);
   UserInfo deleteUserInfo(String userId);
   //boolean passChk(UserInfo userInfo, UserInfo passward);
   
   List<String> getUsernameList();
}