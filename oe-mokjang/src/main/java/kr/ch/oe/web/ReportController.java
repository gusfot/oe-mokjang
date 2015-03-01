package kr.ch.oe.web;


import java.util.List;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.User;
import kr.ch.oe.service.DepartmentService;
import kr.ch.oe.service.MokjangReportService;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;


/**
 * 목장보고서 관련 controller
 * @author gusfot
 *
 */
@RequestMapping("/report")
@Controller
public class ReportController {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private MokjangReportService mokjangReportService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/mokjang/list.oe")
	public String list(Model model) {
		
		// TODO : 목장보고서 목록을 가져온다.
		// session에 저장되어 있는 로그인 사용자의 dept 정보기준으로 하위의 목장보고서 목록을 가져온다.
		
		// FIXME : 차후에 session에서 가져온다.
		long deptSeq = 14l;
		model.addAttribute("mokjangReports", mokjangReportService.getMokjangReports(deptSeq ));
		
		return "report/mokjangReport_list";
	}
	
	@RequestMapping("/view.oe")
	public String view() {
		return "report/report_view";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.GET)
	public String registForm(Model model) {
		
		// FIXME : 목자가 목장보고서 등록할 경우..테스트 data, 차후에 session에서 가져온다.
		long deptSeq = 14l;
		List<User> mokjangUsers = departmentService.getMokjangUsers(deptSeq);
		model.addAttribute("mokjangUsers", mokjangUsers);
		User user = userService.getUserByUserId("gusfot");
		//userService.get
		model.addAttribute("mokja", user);
		
		return "report/mokjangReport_regist";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.POST)
	public @ResponseBody String regist(@ModelAttribute MokjangReport mokjangReport, Model model) {
		
		// 목장모임을 한 날짜를 기준으로 해당주의 목장보고서를 등록한다.
		String[] worshiDate = mokjangReport.getWorshipDt().split("-");
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(worshiDate[0]), Integer.parseInt(worshiDate[1]), Integer.parseInt(worshiDate[2]));
		System.out.println(weeks + "번째 주입니다.");
		System.out.println(mokjangReport.toString());
		
		// TODO : 목장보고서를 등록한다.
		mokjangReport.setWeeks(weeks);
		mokjangReport.setRegId("gusfot");
		for(Report report : mokjangReport.getReports()){
			report.setWeeks(weeks);
			report.setRegId("gusfot");
			report.setDeptSeq(mokjangReport.getDeptSeq());
		}
		boolean result = mokjangReportService.regist(mokjangReport);
		
		JsonObject innerObject = new JsonObject();
		innerObject.addProperty("success", result);
		innerObject.addProperty("data", "data1");
		
		return innerObject.toString();
	}
	
	@RequestMapping(value="/mokjang/detail.oe", method=RequestMethod.GET)
	public String detail(@RequestParam long mokjangReportSeq, Model model) {
		
		// TODO : 선택한 목장보고서의 상세화면을 제공한다.
		model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(mokjangReportSeq));
		
		return "report/mokjangReport_detail";
	}
}

