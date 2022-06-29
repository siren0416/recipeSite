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
		mapper.insertReg(memberVo);
		
	}
	
	/*
	 * // 아이디 중복 검사
	 * 
	 * @Override public int check_id(String m_id) throws Exception{ return
	 * sqlSession.selectOne("memberVo.check_id", m_id); }
	 * 
	 * // 이메일 중복 검사
	 * 
	 * @Override public int check_email(String m_email) throws Exception{ return
	 * sqlSession.selectOne("member.check_email", m_email); }
	 */
	
}
