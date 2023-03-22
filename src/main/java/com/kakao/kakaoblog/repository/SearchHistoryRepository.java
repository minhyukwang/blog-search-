package com.kakao.kakaoblog.repository;

import com.kakao.kakaoblog.entity.SearchHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, String> {
}
