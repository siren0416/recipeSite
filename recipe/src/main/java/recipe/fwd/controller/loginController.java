package recipe.fwd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

	// login 호출
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
}
