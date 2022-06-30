package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.BoardVo;

public interface BoardService {

	public List<BoardVo> list() throws Exception;
}
