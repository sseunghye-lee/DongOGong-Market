package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dongogong.domain.UserInfo;

@Mapper
public interface UserInfoMapper {

   UserInfo getUserInfoByUserId(String userId);
   
   UserInfo getUserInfoByUserIdAndPassword(String userId, String password);
   
   void insertUserInfo(UserInfo userInfo);
   
  // void insertLogin(UserInfo userInfo);
   
   void updateUserInfo(UserInfo userInfo);
   
   void updateLogin(UserInfo userInfo);
   
   //void deleteUserInfo(UserInfo userInfo);
   UserInfo deleteUserInfo(String userId);
   
   //boolean passChk(UserInfo userInfo, UserInfo passward);
   
   UserInfo findUser(String user_id);
   
   List<String> getUsernameList();
   
   //List<UserInfo> findUserList();
   
   //List<UserInfo> findUserList(int currentPage, int countPerPaga);
   
   //boolean existingUser(String user_id);   
}