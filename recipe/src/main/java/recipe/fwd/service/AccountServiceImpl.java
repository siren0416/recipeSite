package recipe.fwd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.fwd.dao.AccountDao;
import recipe.fwd.vo.MemberVo;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountdao;
	
	@Override
	public List<MemberVo> mypageSelectOne(int m_no) throws Exception{
		return accountdao.mypageSelectOne(m_no);
	}
	
	
}
