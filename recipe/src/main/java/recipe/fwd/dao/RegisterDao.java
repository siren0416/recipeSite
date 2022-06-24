package recipe.fwd.dao;

import recipe.fwd.vo.MemberVo;

public interface RegisterDao {

	// 회원가입 인서트
	public void insertReg(MemberVo memberVo) throws Exception;
	
	
	
}
