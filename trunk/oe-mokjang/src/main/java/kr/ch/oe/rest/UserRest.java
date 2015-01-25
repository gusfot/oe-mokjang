package kr.ch.oe.rest;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@Scope(value="request")
@RequestMapping("/user")
public class UserRest {
	@Autowired 
	private UserService userService;
	
	
	@RequestMapping(value = {"rest/user/list"}, method=RequestMethod.GET)
	public @ResponseBody Paging<User> getUserList(){
		UserExample example = null;
		Paging<User> pageList = userService.getPagingUserList(example,1);
		
		return pageList;
		
		
	}
	
	

}