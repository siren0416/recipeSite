package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.MemberVo;

public interface AccountMapper {
	// 마이페이지
	public List<MemberVo> mypageSelectOne(int m_no) throws Exception;
}
