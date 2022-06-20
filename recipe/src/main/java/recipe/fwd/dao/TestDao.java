package recipe.fwd.dao;

import java.util.List;

import recipe.fwd.vo.TestVo;

public interface TestDao {
	
	public List<TestVo> selectList(TestVo testVo) throws Exception;
	
}
