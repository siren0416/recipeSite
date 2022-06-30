package recipe.fwd.dao;

import java.util.List;

import recipe.fwd.vo.BoardVo;

public interface BoardDao {
	
	public List<BoardVo> list() throws Exception;
	
}
