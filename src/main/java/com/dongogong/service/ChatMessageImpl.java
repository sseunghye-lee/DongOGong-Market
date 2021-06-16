package com.dongogong.service;

import com.dongogong.dao.ChatMessageDao;
import com.dongogong.dao.RelationDao;
import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import com.dongogong.domain.Relation;
import com.dongogong.repository.ChatMessageRepository;
import com.dongogong.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ChatMessageImpl implements ChatMessageFacade {

    @Autowired
    private RelationDao relationDao;
    @Autowired
    private ChatMessageDao chatMessageDao;
    @Autowired
    private ChatMessageRepository chatMessageRepository;
    @Autowired
    private RelationRepository relationRepository;

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
    public Relation isRelationExist(String userId, String registerId, int postIdx) {
        Optional<Relation> optionalRelation = relationRepository.findByUser1IdAndUser2IdAndPostIdx(userId, registerId, postIdx);
        
        if(! optionalRelation.isPresent())
            return null;
        return optionalRelation.get();
    }

//    @Override
//    public int findRelationIdx(String userId, String registerId) {
//        return relationDao.findRelationIdx(userId, registerId);
//    }

    @Override
    public ChatMessage getMaxChatMessageIdx() {
        return chatMessageDao.getMaxChatMessageIdx();
    }

    @Override
    public Relation getMaxRelationIdx() {
        return chatMessageDao.getMaxRelationIdx();
    }

    @Override
    public void updateReadYn(int relationIdx, String userIdx) {
        chatMessageDao.updateReadYn(relationIdx, userIdx);
    }

    @Override
    public int insertRelation(String userId, String registerId, int postIdx) {
        int sequence = getMaxRelationIdx().getRelationIdx()+1;
        Relation relation = new Relation();
        relation.setRelationIdx(sequence);
        relation.setUser1Id(userId);
        relation.setUser2Id(registerId);
        relation.setPostIdx(postIdx);
        relationRepository.save(relation);
        return sequence;
    }
}
