/**
 * 
 */
package kr.ch.oe.web;

import kr.ch.oe.model.Member;
import kr.ch.oe.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gusfot
 *
 */
@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login.oe", method=RequestMethod.GET)
	public String login(){
		return "login";
		
	}

	@RequestMapping(value="/login.oe", method=RequestMethod.POST)
	public String login(@RequestParam String id, @RequestParam String password){
		
		System.out.println(id);
		System.out.println(password);
		return "redirect:main.oe";
		
	}
	
	@RequestMapping(value="/login/regist.oe", method=RequestMethod.GET)
	public String regist(){
		return "login/regist";
	}
	
	@RequestMapping(value="/login/regist.oe", method=RequestMethod.POST)
	public String regist(@ModelAttribute Member member) {
		loginService.regist(member);
		
		return "main";
		
	}
	
}
