package kr.hs.allrim.board.service;

import kr.hs.allrim.board.model.BoardVO;

public interface IBoardService {
	
	void addBoard(BoardVO board) throws Exception; // 글작성
	
	void modifyBoard(BoardVO board) throws Exception; // 글수정
	
	void deleteBoard(int BoardNo) throws Exception; // 글삭제
	
	void showBoard(int BoardNo) throws Exception; // 글조회
	

}
