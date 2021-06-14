package com.dongogong.repository;

import com.dongogong.domain.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Integer> {
    @Override
    <S extends ChatMessage> S save(S entity);
}