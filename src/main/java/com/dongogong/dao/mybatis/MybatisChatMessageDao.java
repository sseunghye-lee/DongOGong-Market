package com.dongogong.dao.mybatis;

import com.dongogong.dao.ChatMessageDao;
import com.dongogong.dao.SequenceDao;
import com.dongogong.dao.mybatis.mapper.ChatMessageMapper;
import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import com.dongogong.domain.Relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MybatisChatMessageDao implements ChatMessageDao {

    @Autowired
    private ChatMessageMapper chatMessageMapper;
    @Autowired
    private SequenceDao sequenceDao;

    //    채팅방 리스트 불러오기
    public List<ChatSummary> getChatRoomList(String userId) throws DataAccessException {
        return chatMessageMapper.getChatRoomList(userId);
    }

    //    채팅리스트에서 채팅방 클릭 시 채팅창 화면 불러오기
    @Transactional
    public List<ChatSummary> getChatMessageList(int relationIdx) throws DataAccessException {
        return chatMessageMapper.getChatMessageList(relationIdx);
    }

    //    채팅방 들어갈 때 안읽음 -> 읽음 변경
    public void updateReadYn(int relationIdx, String userIdx) throws DataAccessException {
        chatMessageMapper.updateReadYn(relationIdx, userIdx);
    }

//    //    메세지 전송 시 저장
//    @Transactional
//    public ChatMessage insertMessage(ChatMessage chatMessage) throws DataAccessException {
//        return chatMessageMapper.insertMessage(chatMessage);
//    }

    @Transactional
    public ChatMessage getMaxChatMessageIdx() throws DataAccessException {
        return chatMessageMapper.getMaxChatMessageIdx();
    }

    public Relation getMaxRelationIdx() throws DataAccessException {
        return chatMessageMapper.getMaxRelationIdx();
    }
}
