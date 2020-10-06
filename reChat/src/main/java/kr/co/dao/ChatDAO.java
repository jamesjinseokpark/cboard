package kr.co.dao;

import java.util.List;

import kr.co.vo.Chat;
import kr.co.vo.Criteria;

public interface ChatDAO {

	// 게시글 작성
	public void write(Chat chat) throws Exception;

	
	// 게시물 목록 조회
	public List<Chat> list(Criteria cri) throws Exception;
	
	//게시물 토탈 갯수
	public int listCount() throws Exception;
	
	// 게시물 조회하기
	public Chat read(int c_no) throws Exception;
	
	// 작성 게시물 수정하기
	
	public void update(Chat chat) throws Exception;
	
	// 작성 게시물 삭제하기
	
	public void delete(int c_no) throws Exception;
	
	
}
