/**
 * 
 */
package kr.ch.oe.web;

import kr.ch.oe.model.Church;
import kr.ch.oe.model.Group;
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
		
		//testService.test();
		Group church = new Church();
		church.setId(1);
		church.setName("오병이어교회");
		
		groupService.insert(church);
		
		return "main";
	}
}
