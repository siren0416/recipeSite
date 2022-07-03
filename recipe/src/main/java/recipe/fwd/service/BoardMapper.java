package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.BoardVo;

public interface BoardMapper {

	public List<BoardVo> list() throws Exception;
	
	public void boardinsert(BoardVo boardVo) throws Exception;
	
	public BoardVo boarddetail(int r_no) throws Exception;

	public List<BoardVo> myboard(int m_no) throws Exception;
	
	public void update(BoardVo boardVo) throws Exception;
	
	public void delete(int m_no) throws Exception;
	
	
}
