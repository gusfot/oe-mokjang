package kr.ch.oe.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 목장보고서 관련 controller
 * @author gusfot
 *
 */
@Controller
@RequestMapping("/report")
public class ReportController {

	@RequestMapping("/list.oe")
	public String list() {
		return "report/report_list";
	}
	
	@RequestMapping("/view.oe")
	public String view() {
		return "report/report_view";
	}
	
	@RequestMapping("/regist.oe")
	public String regist() {
		return "report/report_regist";
	}
	
	@RequestMapping("/detail.oe")
	public String detail() {
		return "report/report_detail";
	}
}

