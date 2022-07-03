package recipe.fwd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import recipe.fwd.service.BoardMapper;
import recipe.fwd.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BoardVo> list() throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.list();
	}
	@Override
	public void boardinsert(BoardVo boardVo) throws Exception{
		
		System.out.println("boardDao");
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.boardinsert(boardVo);
	}
	
	@Override
	public BoardVo boarddetail(int m_no) throws Exception {
		System.out.println("dao");
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.boarddetail(m_no);
	}
	
	@Override
	public List<BoardVo> myboard(int m_no) throws Exception{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		return mapper.myboard(m_no);
	}
	
	// 게시물 수정
		@Override
		public void update(BoardVo boardVo) throws Exception {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			mapper.update(boardVo);
			
		}

		// 게시물 삭제
		@Override
		public void delete(int m_no) throws Exception {
			BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
			mapper.delete(m_no);
			
		}
	
	
	
}
