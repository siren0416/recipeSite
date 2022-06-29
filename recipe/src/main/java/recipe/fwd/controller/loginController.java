package recipe.fwd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import recipe.fwd.service.loginService;
import recipe.fwd.vo.MemberVo;

@Controller
public class loginController {
	
	@Autowired
	private loginService loginService;

	// login 호출
	@GetMapping("/loginpage")
	public String loginPage() {
		System.out.println("loginpageCon");
		return "loginpage";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, MemberVo memberVo, RedirectAttributes rttr) throws Exception {
//  public String login(MemberVO memberVO, Model model, HttpSession session) throws Exception {
//     System.out.println("postmapping");
//     System.out.println("전달된 데이터 : " + memberVO);
  
     HttpSession session = request.getSession();
     MemberVo lvo = loginService.login(memberVo);
     
     if (lvo == null) {            // 일치하지 않는 아이디, 비밀번호 입력했을 경우
        int result = 0;
        rttr.addFlashAttribute("result", result);
        return "redirect:/loginpage";
     }
     
     session.setAttribute("member", lvo);   // 아이디, 비밀번호 일치하는 경우 (로그인 성공)!!, 세션 헤더에 저장
     
     System.out.println("member: " + lvo);
     
     return "redirect:/main";
	
	}
	
	   // 메인페이지 로그아웃
	   @RequestMapping(value="logout", method = RequestMethod.GET)
	   public String logoutMainGET(HttpServletRequest request) throws Exception {
	      
	      HttpSession session = request.getSession();  
	      
	      session.invalidate(); // 기존 세션 제거
	      
	      return "redirect:/main";
	   }
	

	
	
}
