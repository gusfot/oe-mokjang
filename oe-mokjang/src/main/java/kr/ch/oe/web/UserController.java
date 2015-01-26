package kr.ch.oe.web;	

import java.util.Date;

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

@Controller
@RequestMapping("/user")
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
		mav.addObject("pageList", pagingList);
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
			@RequestParam(value="gyogu")long gyogu
			) {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		System.out.println(gyogu);
		Department dept = deptService.getDepatment(1L);
		System.out.println(dept.getDeptName()); 
		
		
		/*
		 * 
		Department dept = deptService.getDepatment(gyogu);
		System.out.println(dept.getDeptSeq()); 
		 * 
		 * user.setAddr(addr);
		user.setBirth(birth);
		user.setCellPhone(mobilePhone);
		user.setJob(job);
		user.setDepartment(dept);
		user.setDeptSeq(dept.getDeptSeq());
		userService.registerUser(user);
		mav.setViewName("user/list");*/
		return null;
	}
	
	@RequestMapping(value = { "/registSheep.oe" }, method = RequestMethod.GET)
	public ModelAndView registerSheep() {
		ModelAndView mav = new ModelAndView();
		Paging<User>pagingList =  userService.getPagingUserList(1, 10);
		mav.addObject("pageList", pagingList);
		mav.setViewName("user/registSheep");
		return mav;
	}
	
	
	
}
