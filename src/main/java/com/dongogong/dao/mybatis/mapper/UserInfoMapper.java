package com.dongogong.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dongogong.domain.UserInfo;

@Mapper
public interface UserInfoMapper {

   UserInfo getUserInfoByUserId(String userId);
   
   UserInfo getUserInfoByUserIdAndPassword(String userId, String password);
   
   void insertUserInfo(UserInfo userInfo);
   
   void updateUserInfo(UserInfo userInfo);
   
   void deleteUserInfo(String userId, String password);
   void deleteAuctionInfo(String userId);
   void deletePostInfo(String userId);
   void deleteChatInfo(String userId);
   void deleteRelation(String userId);
   void deleteTransaction(String userId);
   
   //boolean passChk(UserInfo userInfo, UserInfo passward);
   
   int idChk(UserInfo userInfo);
   
   UserInfo findUser(String user_id);
   
   List<String> getUsernameList();
   
   //List<UserInfo> findUserList();
   
   //List<UserInfo> findUserList(int currentPage, int countPerPaga);
   
   //boolean existingUser(String user_id);   
}