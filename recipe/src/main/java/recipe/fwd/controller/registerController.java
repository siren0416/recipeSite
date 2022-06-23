package recipe.fwd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registerController {

	// regitster 호출
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	
}
