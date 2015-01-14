package kr.ch.oe.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
@RequestMapping("/list.oe")
public String getUserList() {
	
	return "user/list";
	
}
	
@RequestMapping("/userInfo.oe")
public String getUserInfo() {
	
	return "user/modify";
}
	
@RequestMapping("/register.oe")
public String registerUser(){
	
	return"user/regist";
	
}

}
