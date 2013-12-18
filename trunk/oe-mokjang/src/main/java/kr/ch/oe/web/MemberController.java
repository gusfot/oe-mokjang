package kr.ch.oe.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Member;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.GET)
	public String regist(){
		return "/member/regist.oe";
	}
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.POST)
	public String regist(@ModelAttribute Member member) {
		
		memberService.regist(member);
		
		return "redirect:list.oe";
	}
	
	@RequestMapping(value="/list.oe", method=RequestMethod.GET)
	public String list(Model model){
		Map criteria = new HashMap();
		List<Member> persons = memberService.getMembers(criteria);
		model.addAttribute(persons);
		
		return "list.oe";
	}
}
