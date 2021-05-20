package com.dongogong.dao;

import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.Relation;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ChatMessageDao {
    //    채팅방 리스트 불러오기
    List<ChatMessage> getChatRoomList(String userId) throws DataAccessException;;

    //    채팅리스트에서 채팅방 클릭 시 채팅창 화면 불러오기
    List<ChatMessage> getChatMessageList(int relationIdx) throws DataAccessException;;

    //    처음 연락하는 관계에 있을 때 (동일한 사람이라도 게시물에 따라 구별되어 보여짐)
    void insertRelation(String userId, String registerId) throws DataAccessException;;

    //    채팅방 들어갈 때 안읽음 -> 읽음 변경
    void updateReadYn(String relationIdx, String userIdx) throws DataAccessException;;

    //    메세지 전송 시 저장
    void insertMessage(ChatMessage chatMessage) throws DataAccessException;;
}
