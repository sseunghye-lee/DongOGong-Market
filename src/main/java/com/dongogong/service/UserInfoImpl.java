package com.dongogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dongogong.dao.UserInfoDao;
import com.dongogong.domain.UserInfo;

@Service
@Transactional
public class UserInfoImpl implements UserInfoFacade{

   @Autowired
   private UserInfoDao userInfoDao;
   
   public UserInfo getUserInfo(String userId) {
      return userInfoDao.getUserInfo(userId);
   }
   
   public UserInfo getUserInfo(String userId, String password) {
      return userInfoDao.getUserInfo(userId, password);
   }
   
   public void insertUserInfo(UserInfo userInfo) {
      userInfoDao.insertUserInfo(userInfo);
   }

   public void updateUserInfo(UserInfo userInfo) {
      userInfoDao.updateUserInfo(userInfo);
   }
   
   /*public void deleteUserInfo(UserInfo userInfo) {   
      userInfoDao.deleteUserInfo(userInfo);
   }*/
   
   public UserInfo deleteUserInfo(String userId) {   
      return userInfoDao.deleteUserInfo(userId);
   }

   /*public boolean passChk(UserInfo userInfo, UserInfo password) {
      boolean result = userInfoDao.passChk(userInfo, password);
      return result;
   }
   */
   public List<String> getUsernameList() {
      return userInfoDao.getUsernameList();
   }
}