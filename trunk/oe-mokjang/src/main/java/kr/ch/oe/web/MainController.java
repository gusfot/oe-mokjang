/**
 * 
 */
package kr.ch.oe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 메인 controller
 * @author gusfot
 *
 */
@RequestMapping("")
@Controller
public class MainController {

	
	@RequestMapping("/main.oe")
	public String main(){
		
		return "main";
	}
}
