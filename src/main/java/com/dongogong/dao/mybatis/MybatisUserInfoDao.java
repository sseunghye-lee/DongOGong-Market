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
      
      /*
      public UserInfo deleteUserInfo(String userId) throws DataAccessException {
         return userInfoMapper.deleteUserInfo(userId);
      }
      */
      
      public int idChk(UserInfo userInfo) throws DataAccessException {
    	  int result = userInfoMapper.idChk(userInfo);
    	  return result;
      }
      
      /*boolean passChk(UserInfo userInfo, UserInfo passward) throws DataAccessException {
         
      }
      */
      
      public List<String> getUsernameList() throws DataAccessException {
         return userInfoMapper.getUsernameList();
      }

	@Override
	public void deleteUserInfo(String userId, String password) throws DataAccessException {
		userInfoMapper.deleteUserInfo(userId, password);
		
	}

	@Override
	public void deleteAuctionInfo(String userId) throws DataAccessException {
		userInfoMapper.deleteAuctionInfo(userId);
		
	}

	@Override
	public void deletePostInfo(String userId) throws DataAccessException {
		userInfoMapper.deletePostInfo(userId);
		
	}

	@Override
	public void deleteChatInfo(String userId) throws DataAccessException {
		userInfoMapper.deleteChatInfo(userId);
		
	}

	@Override
	public void deleteRelation(String userId) throws DataAccessException {
		userInfoMapper.deleteRelation(userId);
		
	}

	@Override
	public void deleteTransaction(String userId) throws DataAccessException {
		userInfoMapper.deleteTransaction(userId);
		
	}
      
      /*public List<UserInfo> findUserList() throws DataAccessException {
         return userMapper.findUserList();
      }
      
      public List<UserInfo> findUserList(int currentPage, int countPerPage) throws DataAccessException {
         return userMapper.findUserList(currentPage, countPerPage);
      }
       */
}