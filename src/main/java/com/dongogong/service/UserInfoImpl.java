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
   
	@Override
	public void deleteUserInfo(String userId, String password) {
		userInfoDao.deleteUserInfo(userId, password);
		
	}
	
	@Override
	public void deleteAuctionInfo(String userId) {
		userInfoDao.deleteAuctionInfo(userId);
		
	}
	
	@Override
	public void deletePostInfo(String userId) {
		userInfoDao.deletePostInfo(userId);
		
	}
	
	@Override
	public void deleteChatInfo(String userId) {
		userInfoDao.deleteChatInfo(userId);
		
	}

	@Override
	public void deleteRelation(String userId) {
		userInfoDao.deleteRelation(userId);
		
	}
	
	@Override
	public void deleteTransaction(String userId) {
		userInfoDao.deleteTransaction(userId);
		
	}
	   
    public int idChk(UserInfo userInfo) {
	    int result = userInfoDao.idChk(userInfo);
	    return result;
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