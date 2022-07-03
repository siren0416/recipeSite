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
	
	// 게시판 조회
	@RequestMapping(value="/boarddetail", method = RequestMethod.GET)
	public String boarddetail(BoardVo boardVo, Model model) throws Exception{
		System.out.println("detailcontroller");
		model.addAttribute("boarddetail", boardService.boarddetail(boardVo.getM_no()));
		
		return "boarddetail";
	}
	
	// 보드인서트 페이지
	@RequestMapping(value="boardinsert", method= RequestMethod.GET)
	public String boardinsertPage(Model model, MemberVo memberVo, HttpServletRequest request){
		
		HttpSession session =  request.getSession();
		
		Object member = session.getAttribute("member");
		
		model.addAttribute("member", member);
		String m_no = (String)session.getAttribute("m_no");
		System.out.println(m_no);
		
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
	
	
	
	// 내 게시판 불러오기
	@RequestMapping(value = "/myboard", method = RequestMethod.GET)
	public String myboardPage(Model model, HttpServletRequest request, BoardVo boardVo) throws Exception {
		HttpSession session =  request.getSession();
//		MemberVo memberVo = (MemberVo) session.getAttribute("member");

		System.out.println("controller");
		request.setAttribute("m_no", session);
		String m_no = (String)session.getAttribute("m_no");
			model.addAttribute("myboard", boardService.myboard(boardVo.getM_no()));
			System.out.println(boardVo.getM_no());
		return "myboard";
	}
	
	// 게시판 수정뷰
		@RequestMapping(value = "/updateView", method = RequestMethod.GET)
		public String updateView(BoardVo boardVo, Model model) throws Exception{
			
			model.addAttribute("update", boardService.boarddetail(boardVo.getM_no()));
			System.out.println(boardVo.getM_no());
			return "updateView";
		}
		
		// 게시판 수정
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(BoardVo boardVo) throws Exception{
			
			boardService.update(boardVo);
			
			return "redirect:/myboard";
		}

		// 게시판 삭제
		@RequestMapping(value = "/delete", method = RequestMethod.POST)
		public String delete(BoardVo boardVo) throws Exception{
			
			boardService.delete(boardVo.getM_no());
			
			return "redirect:/board";
		}
	
	
	
	
	
	
	
	
}
