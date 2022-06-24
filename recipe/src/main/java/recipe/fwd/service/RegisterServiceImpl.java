package recipe.fwd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.fwd.dao.RegisterDao;
import recipe.fwd.vo.MemberVo;

@Service
public class RegisterServiceImpl implements RegisterService{
		
	@Autowired
	private RegisterDao registerDao;
	
	// 회원가입 인서트
	@Override
	public void insertReg(MemberVo memberVo) throws Exception{
		registerDao.insertReg(memberVo);
	}
	
	
	
	
	
}
