package kr.ch.oe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	// TODO : 로그인 하기(아이디, 비밀번호 입력 후 로그인. 로그인 사용자 세션에 저장
	// TODO : 로그아웃 하기(로그 아웃 시 세션에서 로그인 사용자 세션에서 삭제)

	
	@RequestMapping("/login.oe")
	public String loginUser(){
		
		return"login";
	}
	
	
}
