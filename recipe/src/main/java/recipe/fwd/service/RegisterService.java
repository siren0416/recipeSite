package recipe.fwd.service;

import recipe.fwd.vo.MemberVo;

public interface RegisterService {
	
	// 회원 가입 인서트
	public void insertReg(MemberVo memberVo) throws Exception;
	
	
	
}
