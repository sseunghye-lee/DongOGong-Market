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
		private UserInfoMapper userMapper;
		
		@Override
		public void insertUser(UserInfo user) throws DataAccessException {
			userMapper.insertUser(user);
			userMapper.insertSignon(user);
		}
		
		@Override
		public void updateUser(UserInfo user) throws DataAccessException {
			userMapper.updateUser(user);
			userMapper.updateSignon(user);
		}
		
		@Override
		public void deleteUser(UserInfo user) throws DataAccessException {
			userMapper.deleteUser(user);
		}
		
		@Override
		public List<UserInfo> findUserList() throws DataAccessException {
			return userMapper.findUserList();
		}
		
		@Override
		public List<UserInfo> findUserList(int currentPage, int countPerPage) throws DataAccessException {
			return userMapper.findUserList(currentPage, countPerPage);
		}

}
