package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.TestVo;

public interface TestService {
	// Test 목록 조회
	public List<TestVo> selectList(TestVo testVo) throws Exception;
}
