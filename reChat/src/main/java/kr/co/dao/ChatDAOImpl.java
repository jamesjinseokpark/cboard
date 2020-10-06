package kr.co.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.vo.Chat;
import kr.co.vo.Criteria;

@Repository
public class ChatDAOImpl implements ChatDAO {

	@Autowired
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(Chat chat) throws Exception {
		sqlSession.insert("chatMapper.insert", chat);
		System.out.println("daoimpl 호출");
		
	}
	
	// 게시물 목록 조회
	@Override
	public List<Chat> list(Criteria cri) throws Exception {
	
		return sqlSession.selectList("chatMapper.listPage", cri);

	}
	
	// 게시물 토탈 갯수 
	
	@Override
	public int listCount() throws Exception{
		return sqlSession.selectOne("chatMapper.listCount");
	}
	
	
	
	// 게시 상세 조회하기
	@Override
	public Chat read (int c_no) throws Exception{
		return sqlSession.selectOne("chatMapper.read", c_no);
	}
	
	// 게시물 업데이트 
	@Override
	public void update (Chat chat) throws Exception{
		sqlSession.update("chatMapper.update", chat); 
	}
	
	//게시물 삭제하기
	@Override
	public void delete (int c_no) throws Exception{
		sqlSession.update("chatMapper.delete", c_no);
	}

}
