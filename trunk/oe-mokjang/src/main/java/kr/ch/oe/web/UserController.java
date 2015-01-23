package kr.ch.oe.web;	

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = { "/list.oe" }, method = RequestMethod.GET)
	public ModelAndView getUserList() {
		ModelAndView mav = new ModelAndView();
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

	@RequestMapping(value = { "/register.oe" }, method = RequestMethod.GET)
	public ModelAndView registerUser() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/regist");
		return mav;
	}
}
