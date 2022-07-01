package recipe.fwd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import recipe.fwd.service.BoardService;
import recipe.fwd.vo.BoardVo;
import recipe.fwd.vo.MemberVo;

@Controller
public class boardController {

	@Autowired
	private BoardService boardService;
	
	// 게시판 불러오기
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardPage(Model model) {
		
		try {
			model.addAttribute("list", boardService.list());
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return "board";
	}
	
	// 보드인서트 페이지
	@RequestMapping(value="boardinsert", method= RequestMethod.GET)
	public String boardinsertPage(Model model, MemberVo memberVo, HttpServletRequest request){
		
		HttpSession session =  request.getSession();
		
		Object member = session.getAttribute("member");
		
		model.addAttribute("member", member);
		
//		System.out.println("member : " + member);
		
		return "boardinsert";
	}
	
	// board insert 기능
	@RequestMapping(value="boardinsert", method = RequestMethod.POST)
	public String boardinsert(BoardVo boardVo, HttpServletRequest request) throws Exception{
		HttpSession session =  request.getSession();
		
		MemberVo memberVo = (MemberVo) session.getAttribute("member");
		
		boardVo.setM_no(memberVo.getM_no());
		
		boardService.boardinsert(boardVo);
		
		return "redirect:/board";
	}
	
	// 내가 등록한 레시피 페이지
	
	
	// 내 게시판 불러오기
	@RequestMapping(value = "/myboard", method = RequestMethod.GET)
	public String myboardPage(Model model, HttpServletRequest request, MemberVo memberVo) {
		HttpSession session =  request.getSession();
//		MemberVo memberVo = (MemberVo) session.getAttribute("member");
		
		
		try {
			request.setAttribute("m_no", session)
			model.addAttribute("mylist", boardService.list());
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return "myboard";
	}
	
	
	
	
	
	
	
	
	
	
}
