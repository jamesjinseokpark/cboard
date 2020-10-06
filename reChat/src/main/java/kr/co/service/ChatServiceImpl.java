package kr.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dao.ChatDAO;
import kr.co.vo.Chat;
import kr.co.vo.Criteria;

@Service
public class ChatServiceImpl implements ChatService {

	@Autowired
	private ChatDAO dao;

	// 게시글 작성
	@Override
	public void write(Chat chat) throws Exception {
		System.out.println(chat.toString());
		System.out.println("serviceimpl 호출");
		dao.write(chat);
		System.out.println("serviceimpl >dao ");
	}

	// 게시물 목록 조회
	@Override
	public List<Chat> list(Criteria cri) throws Exception {

		return dao.list(cri);
	}
	
	// 게시물 토탈 개수
	@Override
	public int listCount() throws Exception{
		return dao.listCount();
	}
	
	
	
	// 게시물 상세 조회하기 
	@Override
	public Chat read(int c_no) throws Exception{
		
		return dao.read(c_no);
	}
	
	// 게시물 업데이트하기
	@Override
	public void update(Chat chat) throws Exception{
		System.out.println(chat.toString());
		dao.update(chat);
		
		
	}	

	// 게시물 삭제하기
	@Override
	public void delete(int c_no) throws Exception{
		dao.delete(c_no);
	}

}
