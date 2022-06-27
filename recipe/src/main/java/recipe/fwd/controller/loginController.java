package recipe.fwd.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import recipe.fwd.vo.MemberVo;

@Controller
public class loginController {

	// login 호출
	@GetMapping("/loginpage")
	public String loginPage() {
		return "loginpage";
	}
	
	// login
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(MemberVo memeberVo, Model model, HttpSession session) throws Exception {
		System.out.println("loginController");
		
		List<MemberVo> login = loginService.login(memberVo);
		
		
		return "main";
	}
	
	
	
}
