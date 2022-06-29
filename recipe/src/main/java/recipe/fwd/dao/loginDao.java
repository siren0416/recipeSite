package recipe.fwd.dao;

import java.util.List;

import recipe.fwd.vo.MemberVo;

public interface loginDao {

	// 로그인
	public MemberVo login(MemberVo memberVo) throws Exception;
	

}
