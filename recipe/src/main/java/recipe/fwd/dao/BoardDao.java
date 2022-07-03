package recipe.fwd.dao;

import java.util.List;

import recipe.fwd.vo.BoardVo;

public interface BoardDao {
	
	public List<BoardVo> list() throws Exception;
	
	// 보드 인서트
	public void boardinsert(BoardVo boradVo) throws Exception;
	
	// 조회
	public BoardVo boarddetail(int m_no) throws Exception;
	
	// 내가 쓴 보드 리스트
	public List<BoardVo> myboard(int m_no) throws Exception;
	
	public void update(BoardVo boardVo) throws Exception;
	
	public void delete(int m_no) throws Exception;
	
	
}
