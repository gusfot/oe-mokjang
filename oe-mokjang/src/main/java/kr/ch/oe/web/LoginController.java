/**
 * 
 */
package kr.ch.oe.web;

import kr.ch.oe.model.Person;
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
		Person person = new Person();
		person.setId(id);
		person.setPassword(password);
		loginService.login(person);
		
		return "login";
		
	}
	
	@RequestMapping(value="/login/regist.oe", method=RequestMethod.GET)
	public String regist(){
		return "login/regist";
	}
	
	@RequestMapping(value="/login/regist.oe", method=RequestMethod.POST)
	public String regist(@ModelAttribute Person person) {
		loginService.regist(person);
		
		return "main";
		
	}
	
}
