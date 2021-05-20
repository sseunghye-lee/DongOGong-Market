package com.dongogong.dao;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.dao.DataAccessException;

public interface ProductCategoryDao {
	
	//모든 카테고리 출력
	List<Category> getCategoryList() throws DataAccessException;
	//카테고리 이름 출력
	Category getCategory(String name) throws DataAccessException;
	
	//레코드 삽입
	Category categoryInsert(String name, int postIdx) throws DataAccessException;
}
