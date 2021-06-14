package com.dongogong.dao;

import com.dongogong.domain.AuctionPrice;
import com.dongogong.domain.ChatMessage;
import com.dongogong.domain.ChatSummary;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ChatMessageDao {
    //    채팅방 리스트 불러오기
    List<ChatSummary> getChatRoomList(String userId) throws DataAccessException;

    //    채팅리스트에서 채팅방 클릭 시 채팅창 화면 불러오기
    List<ChatSummary> getChatMessageList(int relationIdx) throws DataAccessException;

    //    채팅방 들어갈 때 안읽음 -> 읽음 변경
    void updateReadYn(int relationIdx, String userIdx) throws DataAccessException;

    //    메세지 전송 시 저장
    ChatMessage insertMessage(ChatMessage chatMessage) throws DataAccessException;

    //    시퀀스
    ChatMessage getMaxChatMessageIdx() throws DataAccessException;
}
