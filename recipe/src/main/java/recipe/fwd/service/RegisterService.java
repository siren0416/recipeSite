package recipe.fwd.service;

import javax.servlet.http.HttpServletResponse;

import recipe.fwd.vo.MemberVo;

public interface RegisterService {
	
	// 회원 가입 인서트
	public void insertReg(MemberVo memberVo) throws Exception;
	
	/*
	 * // 아이디 중복 public void check_id(String m_id, HttpServletResponse
	 * response)throws Exception;
	 * 
	 * // 이메일 public void check_email(String email, HttpServletResponse response)
	 * throws Exception;
	 */
}
