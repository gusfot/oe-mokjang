package kr.ch.oe.web;


import java.util.List;

import kr.ch.oe.model.Person;
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
	public String regist(@ModelAttribute Person person) {
		
		memberService.regist(person);
		
		return "redirect:list.oe";
	}
	
	@RequestMapping(value="/list.oe", method=RequestMethod.GET)
	public String list(Model model){
		
		List<Person> persons = memberService.list();
		model.addAttribute(persons);
		
		return "list.oe";
	}
}
