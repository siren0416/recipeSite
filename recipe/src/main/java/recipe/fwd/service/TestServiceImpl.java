package recipe.fwd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.fwd.dao.TestDao;
import recipe.fwd.vo.TestVo;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public List<TestVo> selectList(TestVo testVo) throws Exception{
		
		return testDao.selectList(testVo);
	}
	
		
	
	
}
