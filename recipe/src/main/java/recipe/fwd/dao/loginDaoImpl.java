package recipe.fwd.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import recipe.fwd.service.loginMapper;
import recipe.fwd.vo.MemberVo;

@Repository
public class loginDaoImpl implements loginDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MemberVo login(MemberVo memberVo) throws Exception{
		loginMapper mapper = sqlSession.getMapper(loginMapper.class);
		System.out.println("loginDaoImpl");
		return mapper.login(memberVo);
	}
	

}
