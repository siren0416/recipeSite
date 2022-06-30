package recipe.fwd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import recipe.fwd.service.AccountMapper;
import recipe.fwd.vo.MemberVo;

@Repository
public class AccountDaoImpl implements AccountDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MemberVo> mypageSelectOne(int m_no) throws Exception{
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		return mapper.mypageSelectOne(m_no);
	}
	
	
}
