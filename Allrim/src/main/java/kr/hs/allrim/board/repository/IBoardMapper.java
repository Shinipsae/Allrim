package kr.hs.allrim.board.repository;

import kr.hs.allrim.board.model.BoardVO;

public interface IBoardMapper {

	void addBoard(BoardVO board);
	
	void modifyBoard(BoardVO board);
	
	void deleteBoard(int BoardNo);
	
	void showBoard(int BoardNo);
	
}
