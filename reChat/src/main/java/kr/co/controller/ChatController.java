package kr.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.ChatService;
import kr.co.vo.Chat;
import kr.co.vo.Criteria;
import kr.co.vo.PageMaker;

@Controller
@RequestMapping("/chat/*")
public class ChatController {

	@Autowired
	ChatService service;
	

	// 게시판 글 작성 화면
	@GetMapping(value = "/chat/writeView")
	public String writeView() throws Exception{
		
		System.out.println("writeView 들어옴");

		return "/chat/writeView";

	}

	// 게시판 글 작성
	@PostMapping(value = "/chat/write")
	public String write(Chat chat) throws Exception{

		System.out.println("write 들어옴");
		
		// Session 처리해야함.. 
		//chat.setW_id("aaa");
		
		System.out.println(chat.toString());
		
		service.write(chat);
		
		
		System.out.println("writeService호출");

		return "redirect:/chat/list";
	}

	// 게시판 목록 조회
	@GetMapping(value = "/list")
	public String list(Criteria cri, Model model) throws Exception{

		model.addAttribute("list",service.list(cri));

		PageMaker pageMaker = new PageMaker();
		
		pageMaker.setCri(cri);
		
		pageMaker.setTotalCount(service.listCount());
		
		model.addAttribute("pageMaker", pageMaker);
		
		return "chat/list";

	}

	// 게시판글 조회하기
	@GetMapping (value="/readView")
	public String read (Chat chat, Model model) throws Exception{
		model.addAttribute("read", service.read(chat.getC_no()));
		
		System.out.println("readView 들어옴");
		
//		List<ChatComment> commentList = commentService.readComment(chat.getC_no());
//		model.addAttribute("commentList", commentList);
		return "chat/readView";
	}

	// 게시판 수정뷰
	@GetMapping(value = "/updateView")
	public String updateView(Chat chat, Model model) throws Exception{
		System.out.println("updateView 들어옴");

		model.addAttribute("update", service.read(chat.getC_no()));

		return "chat/updateView";
	}

	// 게시판 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Chat chat) throws Exception{


		service.update(chat);
		
		System.out.println("update 들어옴");

		return "redirect:/chat/list";
	}

	// 게시글 삭제
	@PostMapping(value = "/delete")
	public String delete(Chat chat) throws Exception{


		service.delete(chat.getC_no());
		
		System.out.println("delete 들어옴");

		return "redirect:/chat/list";
	}
	
}
