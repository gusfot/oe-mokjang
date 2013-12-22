package kr.ch.oe.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;
import kr.ch.oe.model.Role;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String regist(//@ModelAttribute Member member,
						@RequestParam String name, @RequestParam String email, 
						@RequestParam String password, @RequestParam String homePhone, 
						@RequestParam String mobilePhone, @RequestParam String job, 
						@RequestParam String birthday, @RequestParam String gyogu, 
						@RequestParam("role") String roleValue, @RequestParam String address) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(homePhone);
		System.out.println(mobilePhone);
		System.out.println(job);

		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		member.setBirthday(birthday);
		member.setHomePhone(homePhone);
		member.setMobilePhone(mobilePhone);
		member.setName(name);
		member.setAddress(address);
		
		Role role = new Role();
		role.setType("목자");
		
		
		member.setRole(role);
		
		Group group = new Group();
		group.setChurchId(1);
		group.setGyoguId(3);
		
		Mokjang mokjang = new Mokjang();
		mokjang.setGroup(group);
		mokjang.setMokjangId(3);
		member.setMokjang(mokjang);
		
		memberService.regist(member);
		
		return "redirect:list.oe";
	}
	
	@RequestMapping(value="/list.oe", method=RequestMethod.GET)
	public String list(Model model){
		Map criteria = new HashMap();
		List<Member> persons = memberService.getMembers(criteria);
		model.addAttribute(persons);
		
		return "redirect:list.oe";
	}
}
