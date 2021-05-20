package com.dongogong.dao.mybatis;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.dao.DataAccessException;

import com.dongogong.dao.mybatis.mapper.ProductCategoryMapper;

public class MybatisProductCategoryDao {
	private ProductCategoryMapper pcMapper;
	
		//모든 글 정렬
		public List<Category> getCategoryList() throws DataAccessException {
			return pcMapper.getCategoryList();
		}
		
		//카테고리 이름 출력
		public Category getCategory(String name) throws DataAccessException {
			return pcMapper.getCategory(name);
		}
}
