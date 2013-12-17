/**
 * 
 */
package kr.ch.oe.web;

import kr.ch.oe.service.GroupService;
import kr.ch.oe.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gusfot
 *
 */
@Controller
public class MainController {

	@Autowired
	TestService testService ;
	
	@Autowired
	GroupService groupService;
	
	@RequestMapping("/main.oe")
	public String main(){
		
		return "main";
	}
}
