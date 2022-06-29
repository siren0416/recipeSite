package recipe.fwd.dao;


import recipe.fwd.vo.MemberVo;

public interface RegisterDao {

	
	// 회원가입 인서트
	public void insertReg(MemberVo memberVo) throws Exception;
	
	/*
	 * // 아이디 중복 검사 public int check_id(String m_id) throws Exception;
	 * 
	 * // 이메일 중복 검사 public int check_email(String m_email) throws Exception;
	 */
}
