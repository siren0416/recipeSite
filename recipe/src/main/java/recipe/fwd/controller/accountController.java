package recipe.fwd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import recipe.fwd.service.AccountService;

@Controller
public class accountController {
	
	// mypage 호출
	@GetMapping("/mypage")
	public String myPage() {
		System.out.println("mypageCon");
		return "mypage";
	}
	
	
}
