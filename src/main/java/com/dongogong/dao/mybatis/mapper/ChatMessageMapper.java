package com.dongogong.dao.mybatis.mapper;

import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface ChatMessageMapper {
    //    채팅방 리스트 불러오기
    List<ChatSummary> getChatRoomList(String userId) throws DataAccessException;

    //    채팅리스트에서 채팅방 클릭 시 채팅창 화면 불러오기
    List<ChatSummary> getChatMessageList(int relationIdx) throws DataAccessException;

    //    처음 연락하는 관계에 있을 때 (동일한 사람이라도 게시물에 따라 구별되어 보여짐)
    void insertRelation(String userId, String registerId) throws DataAccessException;

    //    채팅방 들어갈 때 안읽음 -> 읽음 변경
    void updateReadYn(int relationIdx, String userIdx) throws DataAccessException;

    //    메세지 전송 시 저장
    ChatMessage insertMessage(ChatMessage chatMessage) throws DataAccessException;

    //    게시글에서 메세지 보낼 때 관계가 존재하는 지
    boolean isRelationExist(String userId, String registerId) throws DataAccessException;

    int getRelation(String userId, String registerId) throws DataAccessException;

    //    게시글 작성자와 유저 관계 idx 가져오기
    int findRelationIdx(String userId, String registerId) throws DataAccessException;

    ChatMessage getMaxChatMessageIdx() throws DataAccessException;
}
