package com.dongogong.dao;

import org.springframework.dao.DataAccessException;

public interface RelationDao {

    //    처음 연락하는 관계에 있을 때 (동일한 사람이라도 게시물에 따라 구별되어 보여짐)
//    void insertRelation(String userId, String registerId, int postIdx) throws DataAccessException;

    //    게시글에서 메세지 보낼 때 관계가 존재하는 지
//    Relation isRelationExist(String userId, String registerId, int postIdx) throws DataAccessException;

    //    게시글 작성자와 유저 관계 idx 가져오기
//    int findRelationIdx(String userId, String registerId) throws DataAccessException;
}
