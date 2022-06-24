package recipe.fwd.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import recipe.fwd.service.RegisterMapper;
import recipe.fwd.vo.MemberVo;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	// 회원 가입 인서트
	@Override
	public void insertReg(MemberVo memberVo) throws Exception{
		RegisterMapper mapper = sqlSession.getMapper(RegisterMapper.class);
	}
}
