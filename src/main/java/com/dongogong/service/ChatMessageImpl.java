package com.dongogong.service;

import com.dongogong.dao.ChatMessageDao;
import com.dongogong.dao.RelationDao;
import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.Relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageImpl implements ChatMessageFacade {

    @Autowired(required = false)
    private RelationDao relationDao;
    @Autowired(required = false)
    private ChatMessageDao chatMessageDao;

    @Override
    public List<ChatMessage> getChatRoomList(String userId) {
        return chatMessageDao.getChatRoomList(userId);
    }

    @Override
    public List<ChatMessage> getChatMessageList(int relationIdx) {
        return chatMessageDao.getChatMessageList(relationIdx);
    }

    @Override
    public void insertMessage(ChatMessage chatMessage) {
        chatMessageDao.insertMessage(chatMessage);
    }

    @Override
    public boolean isRelationExist(String userId, String registerId) {
        return relationDao.isRelationExist(userId, registerId);
    }

    @Override
    public int findRelationIdx(String userId, String registerId) {
        return relationDao.findRelationIdx(userId, registerId);
    }

    @Override
    public void updateReadYn(String relationIdx, String userIdx) {
        chatMessageDao.updateReadYn(relationIdx, userIdx);
    }

    @Override
    public void insertRelation(String userId, String registerId) {
        relationDao.insertRelation(registerId, userId);
    }
}
