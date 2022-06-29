package recipe.fwd.service;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.fwd.dao.loginDao;
import recipe.fwd.vo.MemberVo;

@Service
public class loginServiceImpl implements loginService{
	
	@Autowired
	private loginDao logindao;
	
	// 로그인
	@Override
	public MemberVo login(MemberVo memberVo) throws Exception{
		
		return logindao.login(memberVo);
	}
	
}
