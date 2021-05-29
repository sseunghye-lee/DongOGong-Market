package com.dongogong.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dongogong.dao.UserInfoDao;
import com.dongogong.dao.mybatis.mapper.UserInfoMapper;
import com.dongogong.domain.UserInfo;

@Repository
public class MybatisUserInfoDao implements UserInfoDao{
   
      @Autowired
      private UserInfoMapper userInfoMapper;
      
      public UserInfo getUserInfo(String userId) throws DataAccessException {
         return userInfoMapper.getUserInfoByUserId(userId);
      }
      
      public UserInfo getUserInfo(String userId, String password) throws DataAccessException {
         return userInfoMapper.getUserInfoByUserIdAndPassword(userId, password);
      }
      
      public void insertUserInfo(UserInfo userInfo) throws DataAccessException {
         userInfoMapper.insertUserInfo(userInfo);
        // userInfoMapper.insertLogin(userInfo);
      }
      
      public void updateUserInfo(UserInfo userInfo) throws DataAccessException {
         userInfoMapper.updateUserInfo(userInfo);
      }
      
      /*public void deleteUserInfo(UserInfo userInfo) throws DataAccessException {
         userInfoMapper.deleteUserInfo(userInfo);
         if (userInfo.getPassword() != null && userInfo.getPassword().length() > 0) {
            userInfoMapper.updateLogin(userInfo);
         }
      }
      */
      
      public UserInfo deleteUserInfo(String userId) throws DataAccessException {
         return userInfoMapper.deleteUserInfo(userId);
      }
      
      /*boolean passChk(UserInfo userInfo, UserInfo passward) throws DataAccessException {
         
      }
      */
      
      public List<String> getUsernameList() throws DataAccessException {
         return userInfoMapper.getUsernameList();
      }
      
      /*public List<UserInfo> findUserList() throws DataAccessException {
         return userMapper.findUserList();
      }
      
      public List<UserInfo> findUserList(int currentPage, int countPerPage) throws DataAccessException {
         return userMapper.findUserList(currentPage, countPerPage);
      }
       */
}