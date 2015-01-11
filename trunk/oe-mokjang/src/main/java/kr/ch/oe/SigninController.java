package kr.ch.oe;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SigninController {
	
	private static final Logger logger = LoggerFactory.getLogger(SigninController.class);
	
	
	@RequestMapping("/signin.oe")
	public String test(HttpServletRequest request, Model model){
		
		return "signin";
		
	}
	
}
