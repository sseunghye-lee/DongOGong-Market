package com.dongogong.service;

import com.dongogong.dao.ChatMessageDao;
import com.dongogong.dao.RelationDao;
import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import com.dongogong.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
//@Transactional
public class ChatMessageImpl implements ChatMessageFacade {

    @Autowired
    private RelationDao relationDao;

    @Autowired
    private ChatMessageDao chatMessageDao;
    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Override
    public List<ChatSummary> getChatRoomList(String userId) {
        return chatMessageDao.getChatRoomList(userId);
    }

    @Override
    public List<ChatSummary> getChatMessageList(int relationIdx) {
        return chatMessageDao.getChatMessageList(relationIdx);
    }

    @Override
    public ChatMessage insertMessage(ChatMessage chatMessage) {
//        chatMessageDao.insertMessage(chatMessage);
        int sequence = chatMessageDao.getMaxChatMessageIdx().getChatMessageIdx();

        chatMessage.setChatMessageIdx(sequence + 1);
        chatMessage.setCreatedDateTime(new Date());

        chatMessageRepository.save(chatMessage);

        return chatMessage;
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
    public ChatMessage getMaxChatMessageIdx() {
        return chatMessageDao.getMaxChatMessageIdx();
    }

    @Override
    public void updateReadYn(int relationIdx, String userIdx) {
        chatMessageDao.updateReadYn(relationIdx, userIdx);
    }

    @Override
    public void insertRelation(String userId, String registerId) {
        relationDao.insertRelation(registerId, userId);
    }
}
