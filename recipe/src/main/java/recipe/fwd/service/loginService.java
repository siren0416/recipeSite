package recipe.fwd.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import recipe.fwd.vo.MemberVo;

public interface loginService {
	
	// 로그인
	public MemberVo login(MemberVo memberVo) throws Exception;
	

	
}
