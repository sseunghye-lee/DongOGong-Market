//package com.dongogong.repository;
//
//import com.dongogong.domain.ChatMessage;
//import com.dongogong.domain.ChatSummary;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface ChatMessageRepository extends JpaRepository<ChatMessage, String> {
//    @Query("SELECT chatMessageIdx, " +
//            "               senderId, " +
//            "               receiverId, " +
//            "               chatRelationIdx, " +
//            "               postIdx, " +
//            "               readYn, " +
//            "               CONTENT, " +
//            "               createDateTime, " +
//            "               senderNickName, " +
//            "               receiverNickName " +
//            "        FROM (SELECT C.CHAT_MESSAGE_IDX  AS chatMessageIdx, " +
//            "                     C.SENDER_ID         AS senderId, " +
//            "                     C.RECEIVER_ID       AS receiverId, " +
//            "                     C.CHAT_RELATION_IDX AS chatRelationIdx, " +
//            "                     C.POST_IDX          AS postIdx, " +
//            "                     C.READ_YN           AS readYn, " +
//            "                     C.CONTENT, " +
//            "                     C.CREATED_DATE_TIME AS createDateTime, " +
//            "                     U1.NICK_NAME        AS senderNickName, " +
//            "                     U2.NICK_NAME        AS receiverNickName " +
//            "              From CHAT_MESSAGE C " +
//            "                       LEFT JOIN USERINFO U1 ON C.SENDER_ID = U1.USER_ID " +
//            "                       LEFT JOIN USERINFO U2 ON C.RECEIVER_ID = U2.USER_ID " +
//            "              WHERE C.CHAT_MESSAGE_IDX IN (SELECT MAX(CHAT_MESSAGE_IDX) " +
//            "                                           From CHAT_MESSAGE C " +
//            "                                           WHERE CHAT_RELATION_IDX IN " +
//            "                                                 (SELECT RELATION_IDX " +
//            "                                                  FROM RELATION " +
//            "                                                  WHERE USER1_ID = :userIdx " +
//            "                                                     OR USER2_ID = :userIdx) " +
//            "                                           GROUP BY CHAT_RELATION_IDX))")
//    List<ChatSummary> findChatRoomOrderByCreatedDateTime(@Param("userIdx") String userIdx);
//}
