package com.dongogong.dao.mybatis.mapper;

import java.util.List;
import java.util.Locale.Category;


public interface ProductCategoryMapper {
	

	//모든 카테고리 출력
	List<Category> getCategoryList();
	
	//카테고리 이름 출력
	Category getCategory(String name);
	
	//레코드 삽입
	void categoryInsert(String name, int postIdx);

}
