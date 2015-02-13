package kr.ch.oe.rest;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		//Paging<User> pageList = userService.getPagingUserList(example,1);
		
		return null;
	}

	@RequestMapping(value = { "rest/user/registSheep.oe" }, method = RequestMethod.GET)
	public @ResponseBody Paging<User> registerSheep(Model model,
			@RequestParam(value="page", required=true ,defaultValue ="1")int page,
			@RequestParam(value="keyword", required=false ,defaultValue = "" )String keyword
			) {
		System.out.println(page);
		Paging<User>pagingList =  userService.getPagingUserList(page, 5, keyword);
		return pagingList;
	}
	

}


