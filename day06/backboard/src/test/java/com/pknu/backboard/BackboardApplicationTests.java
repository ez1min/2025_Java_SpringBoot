package com.pknu.backboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;

@SpringBootTest
class BackboardApplicationTests {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void contextLoads() {
	}

	// INSERT 테스트
	@Test
	void testInsertJpa() {
		Board board1 = new Board();
		board1.setTitle("첫번째 게시글입니다.");
		board1.setContent("내용은 없습니다.");
		board1.setCreateDate(LocalDateTime.now());

		Board board2 = new Board();
		board2.setTitle("두번째 게시글 입니다.");
		board2.setContent("내용은 없어요");
		board2.setCreateDate(LocalDateTime.now());

		this.boardRepository.save(board1);
		this.boardRepository.save(board2);
	}

	@Test // SELECT * 테스트
	void testSelectJpa() {
		List<Board> all = this.boardRepository.findAll();
		// 테스트시 내가 기대한느값과 현재 값이 같은지 확인 메서드
		assertEquals(2, all.size());

		Board board = all.get(0);
		assertEquals("두번째 게시글입니다", board.getTitle());
	}

	@Test
	void testSelectOneJpa() {
		Optional<Board> opBoard = this.boardRepository.findById((2L));
		if (opBoard.isPresent()) {
			Board board = opBoard.get();
			assertEquals("내용없음", board.getContent());
		}
	}

	@Test
	void testSelectByTitle() {
		Board board = this.boardRepository.findByTitle(("두번째 게시글입니다"));
		assertEquals(2L, board.getBno());
	}

	@Test // select from like
	void testSelectByTitleLike() {
		Board boards = this.boardRepository.findByTitle("%게시글");
		assertEquals(4, boards.size());

		Board board = boards.get(0); // 첫번째게시글
		assertEquals("첫번째 게시글입니다.", board.getTitle());
	}

	@Test
	void testDeleteLastOne() {

		assertEquals(4, boardRepository.count());
		Optional<Board> opBoard = this.boardRepository.findById(2L);
		assertTrue(opBoard.isPresent());

		Board board = opBoard.get();
		this.boardRepository.delete(board);
		assertEquals(3, boardRepository.count());
	}
}
