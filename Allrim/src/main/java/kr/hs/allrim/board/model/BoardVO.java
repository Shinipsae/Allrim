package kr.hs.allrim.board.model;

import javax.xml.crypto.Data;

public class BoardVO {
	private Integer boardNo;
	private Integer cateNo;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private Data boardDate;
	private int boardViewcnt;
	private int boardLike;
	
	public Integer getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}
	public Integer getCateNo() {
		return cateNo;
	}
	public void setCateNo(Integer cateNo) {
		this.cateNo = cateNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Data getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Data boardDate) {
		this.boardDate = boardDate;
	}
	public int getBoardViewcnt() {
		return boardViewcnt;
	}
	public void setBoardViewcnt(int boardViewcnt) {
		this.boardViewcnt = boardViewcnt;
	}
	public int getBoardLike() {
		return boardLike;
	}
	public void setBoardLike(int boardLike) {
		this.boardLike = boardLike;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", cateNo=" + cateNo + ", boardWriter=" + boardWriter + ", boardTitle="
				+ boardTitle + ", boardContent=" + boardContent + ", boardDate=" + boardDate + ", boardViewcnt="
				+ boardViewcnt + ", boardLike=" + boardLike + "]";
	}
	
	
}
