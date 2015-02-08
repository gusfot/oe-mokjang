package kr.ch.oe.web;

import javax.servlet.http.HttpSession;

import kr.ch.oe.model.User;
import kr.ch.oe.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	// TODO : 로그인 하기(아이디, 비밀번호 입력 후 로그인. 로그인 사용자 세션에 저장
	// TODO : 로그아웃 하기(로그 아웃 시 세션에서 로그인 사용자 세션에서 삭제)

	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(value="/loginForm.oe", method=RequestMethod.GET)
	public String login() {
		return "/login";
	}
	
	
	// FIXME : 시간이 좀 있으면 ajax 처리하자
	@RequestMapping(value="/login.oe", method=RequestMethod.POST)
	public String login(
			HttpSession session,
			@RequestParam(value="userId",required=true)String userId,
			@RequestParam(value="pw",required=true)String pw) throws Exception {
		
		 User loginUser = loginService.loginUser(userId, pw);
		 session.setAttribute("user", loginUser);
			
		return loginUser != null ? "user/list" : "login";
		
	}
	@RequestMapping(value="/editAccount", method=RequestMethod.GET)
	public String editAccount() {
		return "users/editAccount";
	}
	/*
	@RequestMapping(value="/editAccount", method=RequestMethod.POST)
	public String editAccount(User user, HttpSession session) throws Exception {
		User loginUser = (User) session.getAttribute("user");
		String email = loginUser.getEmail(); //세션에 저장된 사용자 정보로부터 이메일을 알아낸다.
		
		if (user.getName() == null) {
			user.setName(loginUser.getName());
		}
		if (user.getMobile() == null) {
			user.setMobile(loginUser.getMobile());
		}
		
		user.setEmail(email);
		int check = userService.modify(user);
		if (check == 1) {
			session.setAttribute("user",user);
		}
		
		return "users/changePasswd";
		
	}
	
	@RequestMapping(value="/changePasswd", method=RequestMethod.GET)
	public String changePasswd() {
		return "users/changePasswd";
	}
	
	@RequestMapping(value="/changePasswd", method=RequestMethod.POST)
	public String changePasswd(String passwd, HttpSession session) throws Exception {
		String email = ((User)session.getAttribute("user")).getEmail();
		
		User user = new User();
		user.setEmail(email);
		user.setPasswd(passwd);
		
		userService.changePasswd(user);
		
		return "users/confirm";
	}
	
	@RequestMapping(value="/bye", method=RequestMethod.GET)
	public String bye(HttpSession session) {
		User user = (User)session.getAttribute("user");
		userService.bye(user);
		session.invalidate();
		
		return "users/login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("user");

		return "users/login";

	}*/
}
	
	
