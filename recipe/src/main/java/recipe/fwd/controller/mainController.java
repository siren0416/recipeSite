package recipe.fwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import recipe.fwd.service.TestService;
import recipe.fwd.vo.TestVo;

@Controller
public class mainController {
	
	@Autowired
	private TestService testService;
	
	// Test 메인화면 호출
	@GetMapping("/main")
	public String testPage() {
		return "main";
	}
	
	// Test 메인화면 정보조회
	@RequestMapping(value="/testList")
	public String testList(TestVo testVo, Model model) throws Exception{
		System.out.println("testController");
		model.addAttribute("list", testService.selectList(testVo));
		
		return "testList";
	}
	
	
	
	
	
}
