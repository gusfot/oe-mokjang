package kr.ch.oe.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user")
public class UserController  {
	
@Autowired
private UserService userService;
	
	
@RequestMapping(value={"/list.oe"},method=RequestMethod.GET)
public String getUserList(Model model) {
	
	System.out.println("************Controller In? ************");
	UserExample example = null;
	List<User> userList =  userService.getUserList(example);
	model.addAttribute("userList", userList);
	return "user/list";
}
	
@RequestMapping("/userInfo.oe")
public String getUserInfo() {
	
	return "user/modify";
}
	
@RequestMapping(value={"/register.oe"},method=RequestMethod.GET)
public String registerUser(Model model ){
	
	System.out.println("************Ajax In? ************");
	UserExample example = null;
	List<User> userList =  userService.getUserList(example);
	 Map resultMap = new HashMap();
     resultMap.put("list", userList);
	//model.addAttribute("response", userList);
	return"user/regist";
	
}

}
