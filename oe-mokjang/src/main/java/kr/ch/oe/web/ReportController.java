package kr.ch.oe.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 목장보고서 관련 controller
 * @author gusfot
 *
 */
@RequestMapping("/report")
@Controller
public class ReportController {

	@RequestMapping("/list.oe")
	public String list() {
		return "report/report_list";
	}
	
	@RequestMapping("/view.oe")
	public String view() {
		return "report/report_view";
	}
	
	@RequestMapping("/mokjang/regist.oe")
	public String regist() {
		return "report/mokjangReport";
	}
	
	@RequestMapping("/detail.oe")
	public String detail() {
		return "report/report_detail";
	}
}

