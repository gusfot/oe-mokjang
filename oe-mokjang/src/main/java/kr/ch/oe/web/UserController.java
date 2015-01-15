package kr.ch.oe.web;


import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController  {
	
@Autowired
private UserService userService;
	
	
@RequestMapping(value={"/list.oe"},method=RequestMethod.GET)
public String getUserList() {
	UserExample example = null;
	userService.getUserList(example);
	
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
