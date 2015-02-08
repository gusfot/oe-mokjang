package kr.ch.oe.web;	

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;
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
				@RequestParam(value="id", required=true ,defaultValue ="sms")String farmmerId,
					HttpSession session)throws Exception {
		////////임시세션////////
		User userSession = userService.getUser(farmmerId);
		session.setAttribute("sessionId", userSession);
		//////////////////
		ModelAndView mav = new ModelAndView();
		Paging<User>pagingList =  userService.getFarmUserList(farmmerId);
		System.out.println(pagingList.getItems().get(0).getRoleName());
		mav.addObject("pageList", pagingList);
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
		Date date = new java.util.Date();
		
		// FIXME : 교회 등록 날짜는 화면에서 입력 받아 처리해야 할 듯..
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
		String regdate = sd.format(date);
		
		DepartmentExample example = new DepartmentExample();
		List<Department>deptList= deptService.getDeptList(example);
		
		mav.addObject("deptList", deptList);
		mav.addObject("regdate", regdate);
		mav.setViewName("user/regist");
		
		return mav;
	}
	
	// FIXME : 시간이 좀 있으면 ajax 처리하자
	@RequestMapping(value = { "/regist.oe" }, method = RequestMethod.POST)	
	public String registerUser(
			@RequestParam(value="email", required=true)String email,
			@RequestParam(value="password", required=true)String password,
			@RequestParam(value="name", required=true)String name,
			@RequestParam(value="job", required=true)String job,
			@RequestParam(value="address", required=true)String addr,
			@RequestParam(value="birthday", required=true)String birth,
			@RequestParam(value="mobilePhone", required=true)String mobilePhone,
			@RequestParam(value="homePhone", required=true)String homephone,
			@RequestParam(value="gender", required=true)String gneder,
			@RequestParam(value="userId", required=true)String userId,
			@RequestParam(value="regDate", required=true)String regDate,
			@RequestParam(value="role", required=true)long roleSeq,
			@RequestParam(value="gyogu", required=true)long gyogu,
			@RequestParam(value="flag", required=true)String flag
			) {
		// @ModelAttribute 를 사용하면 request form을 좀 더 편하게 할 수 있을듯..
		// FIXME : @ModelAttribute User user
		
		User user = new User();
		
		
		// FIXME : "-" replace는 db insert 할때 replace 하자~
		String rebirth = birth.replace("-","");
		String remobilePhone = mobilePhone.replace("-","");
		String rehomePhone = homephone.replace("-","");
		String reRegDate= regDate.replace("-","");
		
		System.out.println(gyogu);

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
	
	
	// FIXME : Sheep이란 단어보다는 공통적인 User를 사용하는게 어때?
	@RequestMapping(value = { "/registSheepForm.oe" }, method = RequestMethod.GET)
	public String registerSheepForm(
			) {
		
		return "user/registSheep";
	}
	
	
	@RequestMapping(value = { "/overlapUserId.oe" }, method = RequestMethod.GET)
	public @ResponseBody boolean overlaUserId(
			@RequestParam(value="userId") String userId
			) {
		System.out.println(userId);
		
		// FIXME checkId라는 변수가 다시 사용하지 않으면 변수에 담지 않고 바로 return 하는게 좋을거 같아
		// FIXME return userService.overlapUserId(userId);
		
		boolean checkId = userService.overlapUserId(userId);
		return checkId;
	}
	
	// FIXME : 시간이 좀 있으면 ajax 처리하자
	@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
	public String modifyUser(
			HttpServletResponse response,
			@RequestParam(value="email", required=true) String email,
			@RequestParam(value="name", required=true) String name,
			@RequestParam(value="job", required=true) String job,
			@RequestParam(value="address", required=true) String addr,
			@RequestParam(value="birthday", required=true) String birth,	
			@RequestParam(value="mobilePhone", required=true) String mobilePhone,
			@RequestParam(value="userId", required=true) String userId,
			@RequestParam(value="homePhone", required=true) String homephone
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
			@RequestParam(value="userId")String userId,
			@RequestParam(value="flag")long flag
			
			) {
					
		userService.removeSheep(userId, flag);
		
		return "redirect:../user/list.oe";
	}
	
	
	@RequestMapping(value = { "/saintList.oe" }, method = RequestMethod.GET)
	public ModelAndView getSaintList(
				@RequestParam(value="id", required=true ,defaultValue ="admin")String sessionId,
				HttpSession session) throws Exception{
		
		///////임시 세션//////////
		User userSession = userService.getUser(sessionId);
		session.setAttribute("sessionId", userSession);
		//////////////////
		ModelAndView mav = new ModelAndView();
		Paging<User>pagingList =  userService.getPagingUserList(1, 10, "");
		mav.addObject("pageList", pagingList);
		mav.setViewName("user/saint/saint_list");
		
		return mav;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
