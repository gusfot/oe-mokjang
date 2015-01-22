package kr.ch.oe.web;


import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController  {
	
@Autowired
private UserService userService;
	
	
@RequestMapping(value={"/list.oe"},method=RequestMethod.GET)
public String getUserList(Model model ){
		
	return "user/list";
}
	
@RequestMapping("/userInfo.oe")
public String getUserInfo() {
	
	return "user/modify";
}
	
@RequestMapping(value={"/register.oe"},method=RequestMethod.GET)
public @ResponseBody Paging<User>registerUser(Model model ){
	System.out.println("************Ajax In? ************");
	UserExample example = null;
	Paging<User> pageList = userService.getPagingUserList(example,1);
	return pageList;
}

}
