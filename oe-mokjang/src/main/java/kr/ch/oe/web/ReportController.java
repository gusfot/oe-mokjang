package kr.ch.oe.web;


import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.ReportItem;
import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.model.User;
import kr.ch.oe.service.DepartmentService;
import kr.ch.oe.service.MokjangReportService;
import kr.ch.oe.service.ReportItemService;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@Autowired
	private ReportItemService reportItemService;
	
	@RequestMapping("/mokjang/list.oe")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		long deptSeq = sessionUserVO.getDeptSeq();
		
		int weeks = request.getParameter("weeks") !=null ? Integer.parseInt(request.getParameter("weeks")) : DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString())); 
		
		model.addAttribute("mokjangReports", mokjangReportService.getMokjangReports(deptSeq ));
		model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(deptSeq,weeks));
		model.addAttribute("weeks", weeks);
		
		return "report/mokjangReport_list";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.GET)
	public String registForm(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		long deptSeq = sessionUserVO.getDeptSeq();
		
		List<User> mokjangUsers = departmentService.getMokjangUsers(deptSeq);
		model.addAttribute("mokjangUsers", mokjangUsers);
		
		Map<String, Object> params = new HashMap<>();
		List<ReportItem> items = reportItemService.getList(params);

		model.addAttribute("reportItems", items);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
		
		model.addAttribute("thisWeeks", weeks);
		model.addAttribute("firstDate", DateUtil.getFirstDateByWeeks(year, weeks));
		model.addAttribute("lastDate", DateUtil.getLastDateByWeeks(year, weeks));
		
		
		int totalPoint = mokjangReportService.getTotalPointByDeptSeq(deptSeq);
		model.addAttribute("totalPoint", totalPoint);
		
		return "report/mokjangReport_regist";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.POST)
	public @ResponseBody String regist(HttpServletRequest request, HttpServletResponse response, 
									   @ModelAttribute MokjangReport mokjangReport, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		String userId = sessionUserVO.getUserId();
		
		// 목장모임을 한 날짜를 기준으로 해당주의 목장보고서를 등록한다.
		String[] worshiDate = mokjangReport.getWorshipDt().split("-");
		
		// 주차
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(worshiDate[0]), Integer.parseInt(worshiDate[1]), Integer.parseInt(worshiDate[2]));
//		System.out.println(weeks + "번째 주입니다.");
//		System.out.println(mokjangReport.toString());
		
		mokjangReport.setWeeks(weeks);
		mokjangReport.setRegId(userId);
		for(Report report : mokjangReport.getReports()){
			report.setWeeks(weeks);
			report.setRegId(userId);
			report.setDeptSeq(mokjangReport.getDeptSeq());
		}
		
		
		returnObject.addProperty("success", mokjangReportService.regist(mokjangReport));
		returnObject.addProperty("seq", mokjangReport.getMokjangReportSeq());
		
		return returnObject.toString();
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.POST)
	public @ResponseBody String modify(HttpServletRequest request, HttpServletResponse response, 
									   @ModelAttribute MokjangReport mokjangReport, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		String userId = sessionUserVO.getUserId();
		
		// 목장모임을 한 날짜를 기준으로 해당주의 목장보고서를 등록한다.
		String[] worshiDate = mokjangReport.getWorshipDt().split("-");
		
		// 주차
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(worshiDate[0]), Integer.parseInt(worshiDate[1]), Integer.parseInt(worshiDate[2]));
//		System.out.println(weeks + "번째 주입니다.");
//		System.out.println(mokjangReport.toString());
		
		mokjangReport.setWeeks(weeks);
		mokjangReport.setRegId(userId);
		for(Report report : mokjangReport.getReports()){
			report.setWeeks(weeks);
			report.setRegId(userId);
			report.setDeptSeq(mokjangReport.getDeptSeq());
		}
		
		
		returnObject.addProperty("success", mokjangReportService.modify(mokjangReport));
		returnObject.addProperty("seq", mokjangReport.getMokjangReportSeq());
		
		return returnObject.toString();
	}
	
	@RequestMapping(value="/mokjang/detail.oe", method=RequestMethod.GET)
	public String detail(HttpServletRequest request, HttpServletResponse response, 
						@RequestParam(required=false, defaultValue="0") long seq, 
						@RequestParam(required=false, defaultValue="0") int weeks,
						@RequestParam(required=false, defaultValue="2015") int year,
						Model model) {
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		long deptSeq = sessionUserVO.getDeptSeq();
		
		List<User> mokjangUsers = departmentService.getMokjangUsers(deptSeq);
		model.addAttribute("mokjangUsers", mokjangUsers);
		
		if(seq != 0) {
			model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(seq));
		}else {
			model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(deptSeq, weeks));
		}
		Map<String, Object> params = new HashMap<>();
		List<ReportItem> items = reportItemService.getList(params);

		model.addAttribute("reportItems", items);
		
		model.addAttribute("firstDate", DateUtil.getFirstDateByWeeks(year, weeks));
		model.addAttribute("lastDate", DateUtil.getLastDateByWeeks(year, weeks));
		
		int thisWeeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
		model.addAttribute("thisWeeks", thisWeeks);
		
		return "report/mokjangReport_detail";
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.GET)
	public String modifyPage(@RequestParam long mokjangReportSeq, Model model) {
		
		model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(mokjangReportSeq));
		
		return "report/mokjangReport_modify";
	}
	
/*	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.POST)
	public  @ResponseBody String modify(@ModelAttribute MokjangReport mokjangReport, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		returnObject.addProperty("success", mokjangReportService.modify(mokjangReport));
//		returnObject.addProperty("data", "data1");
		
		return returnObject.toString();
	}*/
	
	/**
     * Handle request to download an Excel document
     */
    @RequestMapping(value = "/downMokjang", method = RequestMethod.GET)
    public ModelAndView downloadExcel() {
        
        MokjangReport mokjangReport= mokjangReportService.getMokjangReport(14l);
 
        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("excelView", "mokjangReport", mokjangReport);
    }
    
    @RequestMapping(value="/testExcel.oe", method=RequestMethod.GET)
    public String testExcel(Model model) {
    	
    	MokjangReport mokjangReport= mokjangReportService.getMokjangReport(14l);
    	model.addAttribute("mokjangReport", mokjangReport);
        return "excelView";
    }
}

