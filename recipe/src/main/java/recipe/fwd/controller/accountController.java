package recipe.fwd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import recipe.fwd.service.AccountService;
import recipe.fwd.vo.MemberVo;

@Controller
public class accountController {
	
	@Autowired
	private AccountService accountService;
	
	// mypage 호출
//	@GetMapping("/mypage")
//	public String myPage() {
//		System.out.println("mypageCon");
//		return "mypage";
//	}
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {
				
		return "mypage";
	}
	
	// 이름 수정
	@RequestMapping(value = "/nameupdate", method = RequestMethod.POST)
	public String nameupdate(MemberVo memberVo) throws Exception{

		
		return "mypage";
	}
	
	
}
