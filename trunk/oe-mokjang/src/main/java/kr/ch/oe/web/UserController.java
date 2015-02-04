package kr.ch.oe.web;	

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.bind.annotation.ResponseBody;
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


	@RequestMapping(value={"/detail.oe"},method=RequestMethod.GET)
	public ModelAndView detailUserInfo(
				@RequestParam(value="userId")String userId
			) {
		ModelAndView mav = new ModelAndView();
		User user = userService.getUser(userId);

		String birth = user.getBirth();
		StringBuffer sb = new StringBuffer();
		sb.append(birth);
		sb.insert(4, "-");
		sb.insert(7, "-");
		
		mav.addObject("birth", sb);
		mav.addObject("user", user);
		mav.setViewName("user/detail");
		return mav;
	}

	@RequestMapping(value = { "/registForm.oe"}, method = RequestMethod.GET)
	public ModelAndView registerUserForm() {
		
		ModelAndView mav = new ModelAndView();
		System.out.println("registForm? ");
		Date date = new java.util.Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
		String regdate = sd.format(date);
		mav.addObject("regdate", regdate);
		mav.setViewName("user/regist");
		return mav;
	}
	
	@RequestMapping(value = { "/regist.oe" }, method = RequestMethod.POST)
	public String registerUser(
			HttpServletResponse response,
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
			@RequestParam(value="regDate")String regDate,
			@RequestParam(value="role")long roleSeq,
			@RequestParam(value="gyogu")long gyogu,
			@RequestParam(value="flag")long flag
			) {
		
		User user = new User();
		String rebirth = birth.replace("-","");
		String remobilePhone = mobilePhone.replace("-","");
		String rehomePhone = homephone.replace("-","");
		String reRegDate= regDate.replace("-","");
		

		Department dept = deptService.getDepatment(gyogu);
		user.setEmail(email);
		user.setUserName(name);
		user.setAddr(addr);
		user.setBirth(rebirth );
		user.setCellPhone(remobilePhone);
		user.setJob(job);
		user.setDepartment(dept);
		user.setDeptSeq(dept.getDeptSeq());
		user.setUserId(userId);
		user.setGender(gneder);
		user.setPassword(password);
		user.setHomePhone(rehomePhone);
		user.setRegDt(reRegDate);
		user.setRoleSeq(roleSeq);
		user.setFlag(flag);
		userService.registerUser(user);
		return "redirect:../user/list.oe";
	}
	
	
	@RequestMapping(value = { "/registSheepForm.oe" }, method = RequestMethod.GET)
	public String registerSheepForm(
			) {
		
		return "user/registSheep";
	}
	
	
	@RequestMapping(value = { "/overlapUserId.oe" }, method = RequestMethod.GET)
	public @ResponseBody boolean overlaUserId(
			@RequestParam(value="userId") String userId
			) {
		boolean checkId = userService.overlapUserId(userId);
		return checkId;
	}
	
	@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
	public String modifyUser(
			HttpServletResponse response,
			@RequestParam(value="email")String email,
			@RequestParam(value="name")String name,
			@RequestParam(value="job")String job,
			@RequestParam(value="address")String addr,
			@RequestParam(value="birthday")String birth,
			@RequestParam(value="mobilePhone")String mobilePhone,
			@RequestParam(value="userId")String userId,
			@RequestParam(value="homePhone")String homephone
			) {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		String rebirth = birth.replace("-","");
		System.out.println(rebirth);
 	    user.setUserName(name);
		user.setAddr(addr);
		user.setBirth(rebirth);
		user.setCellPhone(mobilePhone);
		user.setJob(job);
		user.setUserId(userId);
		userService.modifyUser(user);
		mav.setViewName("user/list");
		return "redirect:../user/list.oe";
	}
	@RequestMapping(value = { "/registSheep.oe"}, method = RequestMethod.GET)
	public String registerSheep(
			@RequestParam(value="userId")String userId,
			@RequestParam(value="farmmerId")String farmmerId
			) {
		String[] result = userId.split(",");
			userService.registUserFarm(result, farmmerId);
		
			return "redirect:../user/list.oe";
	}
	
	@RequestMapping(value = { "/removeSheep.oe"}, method = RequestMethod.GET)
	public String removeSheep(
			@RequestParam(value="userId")String userId
			) {
					userService.removeUser(userId);
		return "redirect:../user/list.oe";
	}
	
}
