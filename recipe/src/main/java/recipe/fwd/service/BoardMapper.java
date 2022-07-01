package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.BoardVo;

public interface BoardMapper {

	public List<BoardVo> list() throws Exception;
	
	public void boardinsert(BoardVo boardVo) throws Exception;
	
}
