/**
 * 
 */
package kr.ch.oe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gusfot
 *
 */
@Controller
public class LoginController {

	@RequestMapping("/login.oe")
	public String login(){
		return "login";
		
	}
}
