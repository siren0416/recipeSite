package recipe.fwd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import recipe.fwd.service.BoardService;
import recipe.fwd.vo.BoardVo;

@Controller
public class boardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardPage(Model model) {
		
		try {
			model.addAttribute("list", boardService.list());
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return "board";
	}
	/*
	 * @RequestMapping(value="/list", method= RequestMethod.GET) public String
	 * list(Model model) throws Exception{
	 * 
	 * model.addAttribute("list", boardService.list());
	 * 
	 * 
	 * return "reboard"; }
	 */
	
	
	
	
}
