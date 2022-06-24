package recipe.fwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import recipe.fwd.service.RegisterService;
import recipe.fwd.vo.MemberVo;

@Controller
public class registerController {
	
	@Autowired
	private RegisterService registerService;

	// 회원가입 페이지 호출
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String registerPage() {
		System.out.println("regPageController");
		
		return "register";
	}
	
	// 회원 가입 인서트
	@RequestMapping(value="insertreg", method = RequestMethod.POST)
	public String insertreg(MemberVo memberVo, Model model) throws Exception{
		System.out.println("insertregController");
		System.out.println(memberVo.getM_id());
		
		registerService.insertReg(memberVo);
		System.out.println(memberVo.getM_pw());
		
		return "login";
	}
	
	
}
