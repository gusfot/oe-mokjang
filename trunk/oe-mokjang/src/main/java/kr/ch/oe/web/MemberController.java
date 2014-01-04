package kr.ch.oe.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ch.oe.model.Member;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.GET)
	public String regist(){
		return "/member/regist";
	}
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.POST)
	public String regist(@ModelAttribute Member member
						//@RequestParam String name, @RequestParam String email, 
						//@RequestParam String password, @RequestParam String homePhone, 
						//@RequestParam String mobilePhone, @RequestParam String job, 
						//@RequestParam String birthday, @RequestParam String gyogu, 
						//@RequestParam("role") String roleValue, @RequestParam String address
						) {
		
		return "redirect:/login.oe";
	}
	
	@RequestMapping(value="/modify.oe", method=RequestMethod.GET)
	public String modify(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loggedMember");	
		
		model.addAttribute("member", member);
		
		return "redirect:/login.oe";
	}
	
	@RequestMapping(value="/modify.oe", method=RequestMethod.POST)
	public String modify(@ModelAttribute Member member
						//@RequestParam String name, @RequestParam String email, 
						//@RequestParam String password, @RequestParam String homePhone, 
						//@RequestParam String mobilePhone, @RequestParam String job, 
						//@RequestParam String birthday, @RequestParam String gyogu, 
						//@RequestParam("role") String roleValue, @RequestParam String address
						) {
		
		return "redirect:/detail.oe";
	}
	
	@RequestMapping(value="/detail.oe", method=RequestMethod.POST)
	public String detail(@RequestParam long id, Model model	) {
		
		Member member = memberService.getMember(id);
		model.addAttribute("member", member);
		
		return "member/detail";
	}
	
	@RequestMapping(value="/list.oe", method=RequestMethod.GET)
	public String list(Model model){
		Map criteria = new HashMap();
		List<Member> persons = memberService.getMembers(criteria);
		model.addAttribute(persons);
		
		return "redirect:list.oe";
	}
	
	@RequestMapping(value="/myPage.oe", method=RequestMethod.POST)
	public String myPage(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loggedMember");	
		
		model.addAttribute("member", member);
		
		return "member/myPage";
		
	}
}
