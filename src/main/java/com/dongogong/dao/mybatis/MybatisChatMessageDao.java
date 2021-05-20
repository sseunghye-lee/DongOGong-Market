package com.dongogong.dao.mybatis;

import com.dongogong.dao.ChatMessageDao;
import com.dongogong.dao.SequenceDao;
import com.dongogong.dao.mybatis.mapper.ChatMessageMapper;
import com.dongogong.domain.ChatMessage;
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

    @Transactional
    //    채팅방 리스트 불러오기
    public List<ChatMessage> getChatRoomList(String userId) throws DataAccessException {
        return chatMessageMapper.getChatRoomList(userId);
    }

    @Transactional
    //    채팅리스트에서 채팅방 클릭 시 채팅창 화면 불러오기
    public List<ChatMessage> getChatMessageList(int relationIdx) throws DataAccessException {
        return chatMessageMapper.getChatMessageList(relationIdx);
    }

    @Transactional
    //    채팅방 들어갈 때 안읽음 -> 읽음 변경
    public void updateReadYn(String relationIdx, String userIdx) throws DataAccessException {
        chatMessageMapper.updateReadYn(relationIdx, userIdx);
    }

    @Transactional
    //    메세지 전송 시 저장
    public void insertMessage(ChatMessage chatMessage) throws DataAccessException {
        chatMessageMapper.insertMessage(chatMessage);
    }
}
