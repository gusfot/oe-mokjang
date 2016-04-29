/**
 * 
 */
package kr.ch.oe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.service.MokjangReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@Autowired
	private MokjangReportService mokjangReportService;
	
	@RequestMapping(value="/main.oe")
	public String main(HttpServletRequest request, HttpServletResponse response, Model model){
		
		String mainPage = "main";
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		
		
		
		
		
		if("목자".equals(sessionUserVO.getRoleName()) ){
			long deptSeq = sessionUserVO.getDeptSeq();
			int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
			model.addAttribute("isSubmited",mokjangReportService.isSubmited(deptSeq, weeks));
			mainPage = "main_renew";
		}else {
			mainPage = "main_renew";
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
