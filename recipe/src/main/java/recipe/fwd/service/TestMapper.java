package recipe.fwd.service;

import java.util.List;

import recipe.fwd.vo.TestVo;

public interface TestMapper {
	
	public List<TestVo> selectList(TestVo testVo) throws Exception;
}
