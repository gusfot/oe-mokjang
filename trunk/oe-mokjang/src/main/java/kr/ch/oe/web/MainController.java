/**
 * 
 */
package kr.ch.oe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.model.SessionUserVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 메인 controller
 * @author gusfot
 *
 */
//@RequestMapping("")
@Controller
public class MainController {

	
	@RequestMapping(value="/main.oe")
	public String main(HttpServletRequest request, HttpServletResponse response){
		
		String mainPage = "main";
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		
		if("목자".equals(sessionUserVO.getRoleName()) ){
			mainPage = "report/report_main";
		}else {
			mainPage = "main";
		}
		return mainPage;
	}
	
	
	@RequestMapping("/fileUpTest.oe")
	public String fileUpTest(){
		
		return "test/fileSend";
	}
	
	@RequestMapping("/fileDownTest.oe")
	public String fileDownTest(){
		
		return "test/fileDown";
	}
	
	
	
	
	
}
