package recipe.fwd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.fwd.dao.BoardDao;
import recipe.fwd.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardVo> list() throws Exception {

		return boardDao.list();
	}
}
