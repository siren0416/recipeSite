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
		
}
