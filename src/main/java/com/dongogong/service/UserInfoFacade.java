package com.dongogong.service;

import java.util.List;

import com.dongogong.domain.UserInfo;

public interface UserInfoFacade {
   
   UserInfo getUserInfo(String userId);
   
   UserInfo getUserInfo(String userId, String password);

   void insertUserInfo(UserInfo userInfo);
      
   void updateUserInfo(UserInfo userInfo);
   
   //void deleteUserInfo(UserInfo userInfo);
   UserInfo deleteUserInfo(String userId);
   //boolean passChk(UserInfo userInfo, UserInfo passward);
   
   List<String> getUsernameList();
}