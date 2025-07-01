package com.pknu.backboard.repository;

import com.pknu.backboard.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByTitle(String title); // 제목으로검색
}
