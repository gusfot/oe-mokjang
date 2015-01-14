package kr.ch.oe.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
@RequestMapping("/list.oe")
public String getUserList() {
	
	return "/";
	
}
	
	
@RequestMapping("/userInfo.oe")
public String getUserInfo() {
	
	return "/";
}
	
@RequestMapping("/register.oe")
public String registerUser(){
	
	return"/";
	
}

}
