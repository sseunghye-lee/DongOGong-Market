package com.dongogong.dao.mybatis;

import com.dongogong.dao.RelationDao;
import com.dongogong.dao.SequenceDao;
import com.dongogong.dao.mybatis.mapper.ChatMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MybatisRelationDao implements RelationDao {

    @Autowired
    private ChatMessageMapper chatMessageMapper;
    @Autowired
    private SequenceDao sequenceDao;

    //    처음 연락하는 관계에 있을 때 (동일한 사람이라도 게시물에 따라 구별되어 보여짐)
    @Transactional
    public void insertRelation(String userId, String registerId) throws DataAccessException {
        chatMessageMapper.insertRelation(userId, registerId);

    }

    //    게시글에서 메세지 보낼 때 관계가 존재하는 지
    @Transactional
    public boolean isRelationExist(String userId, String registerId) throws DataAccessException {
        return (chatMessageMapper.getRelation(userId, registerId) > 0);
    }

    //    게시글 작성자와 유저 관계 idx 가져오기
    @Transactional
    public int findRelationIdx(String userId, String registerId) throws DataAccessException {
        return chatMessageMapper.findRelationIdx(userId, registerId);
    }
}
