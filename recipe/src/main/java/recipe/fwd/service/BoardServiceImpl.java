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
	
	@Override
	public void boardinsert(BoardVo boardVo) throws Exception{
		System.out.println("boardService");
		boardDao.boardinsert(boardVo);
	}

	@Override
	public BoardVo boarddetail(int m_no) {
		
		try {
			return boardDao.boarddetail(m_no);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<BoardVo> myboard(int m_no) throws Exception {
		
		return boardDao.myboard(m_no);
	}

	@Override
	public void update(BoardVo boardVo) throws Exception {
		boardDao.update(boardVo);
	}

	@Override
	public void delete(int m_no) throws Exception {
		boardDao.delete(m_no);
	}
	
	
}
