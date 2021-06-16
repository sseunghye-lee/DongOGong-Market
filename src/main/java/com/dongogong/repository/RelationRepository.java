package com.dongogong.repository;

import com.dongogong.domain.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RelationRepository extends JpaRepository<Relation, Integer> {
    Optional<Relation> findByUser1IdAndUser2IdAndPostIdx(String userId, String registerId, int postIdx);
}