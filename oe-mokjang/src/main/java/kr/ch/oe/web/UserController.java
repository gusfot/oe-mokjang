package kr.ch.oe.web;	

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.User;
import kr.ch.oe.service.DepartmentService;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService deptService;
	
	@RequestMapping(value = { "/list.oe" }, method = RequestMethod.GET)
	public ModelAndView getUserList(
				@RequestParam(value="id", required=true ,defaultValue ="sms")String farmmerId) {
		
		ModelAndView mav = new ModelAndView();
		Paging<User>pagingList =  userService.getFarmUserList(farmmerId);
		System.out.println(pagingList.getItems().get(0).getRoleName()); 
		mav.addObject("pageList", pagingList);
		mav.addObject("pageList", userService.getFarmUserList(farmmerId));
		mav.setViewName("user/list");
		return mav;
	}

	@RequestMapping("/userInfo.oe")
	public ModelAndView getUserInfo() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/detail");
		
		return mav;
	}

	@RequestMapping("/detail.oe")
	public ModelAndView getUser() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/detail");
		
		return mav;
	}

	@RequestMapping(value = { "/registForm.oe"}, method = RequestMethod.GET)
	public ModelAndView registerUserForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/regist");
		
		return mav;
	}
	@RequestMapping(value = { "/regist.oe" }, method = RequestMethod.POST)
	public ModelAndView registerUser(
			@RequestParam(value="email")String email,
			@RequestParam(value="password")String password,
			@RequestParam(value="name")String name,
			@RequestParam(value="job")String job,
			@RequestParam(value="address")String addr,
			@RequestParam(value="birthday")String birth,
			@RequestParam(value="mobilePhone")String mobilePhone,
			@RequestParam(value="homePhone")String homephone,
			@RequestParam(value="gender")String gneder,
			@RequestParam(value="userId")String userId,
			@RequestParam(value="gyogu")long gyogu
			) {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		String rebirth = birth.replace("-","");
		Department dept = deptService.getDepatment(gyogu);
 	    user.setUserName(name);
		user.setAddr(addr);
		user.setBirth(rebirth );
		user.setCellPhone(mobilePhone);
		user.setJob(job);
		user.setDepartment(dept);
		user.setDeptSeq(dept.getDeptSeq());
		user.setUserId(userId);
		user.setGender(gneder);
		user.setPassword(password);
		userService.registerUser(user);
		mav.setViewName("user/list");
		return mav;
	}
	
/*	@RequestMapping(value = { "/registSheep.oe" }, method = RequestMethod.GET)
	public ModelAndView registerSheep(
			@RequestParam(value="page", required=true ,defaultValue ="1")int page
			) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println(page);
		Paging<User>pagingList =  userService.getPagingUserList(page, 5);
		mav.addObject("pageList", pagingList);
		
		mav.addObject("pageList", userService.getPagingUserList(1, 10));
		mav.setViewName("user/registSheep");
		
		return mav;
	}
*/	
	
	@RequestMapping(value = { "/registSheep.oe" }, method = RequestMethod.GET)
	public String registerSheep(
			) {
		
		return "user/registSheep";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
