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
public class MainController {

	@RequestMapping("/main.oe")
	public String main(){
		return "main";
	}
}
