package kr.co.service;

import java.util.List;

import kr.co.vo.Chat;
import kr.co.vo.Criteria;

public interface ChatService {

	// 게시글 작성
	public void write(Chat chat) throws Exception;

	// 게시물 목록 조회
	public List<Chat> list(Criteria cri) throws Exception;
	
	//게시물 토탈 개수
	public int listCount() throws Exception;
	

	// 게시물 조회하기
	
	public Chat read(int c_no) throws Exception;
	
	// 게시물 업데이트
	public void update(Chat chat) throws Exception;
	
	// 게시물 삭제하기
	
	public void delete(int c_no) throws Exception;
}
