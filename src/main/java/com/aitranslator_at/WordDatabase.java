package com.aitranslator_at;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WordDatabase extends JpaRepository<Word, Integer> {
}