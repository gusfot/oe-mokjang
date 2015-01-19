package kr.ch.oe.rest;

import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@Scope(value="request")
public class UserRest {
	@Autowired 
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = {"rest/user/list"}, method=RequestMethod.POST)
	public String getUserList(){

		return "";
		
	}
	
	

}
