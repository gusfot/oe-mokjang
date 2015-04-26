package kr.ch.oe.web;


import java.util.ArrayList;
import java.util.List;

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
		
		// TODO DB에 입력하여 관리
		/**
		 * 테스트 데이터 
		 */
		List<ReportItem> items = new ArrayList<>();

		ReportItem item0 = new ReportItem();
		item0.setSeq(0l);
		item0.setItemName("목장모임참석");
		item0.setWeight(5);
		item0.setCode("mokjangYn");
		
		ReportItem item1 = new ReportItem();
		item1.setSeq(1l);
		item1.setItemName("목장새등록자");
		item1.setWeight(10);
		item1.setCode("mokjangYn1");
		
		
		ReportItem item2 = new ReportItem();
		item2.setSeq(2l);
		item2.setItemName("8주차참석자");
		item2.setWeight(2);
		item2.setCode("mokjangYn2");
		
		ReportItem item3 = new ReportItem();
		item3.setSeq(3l);
		item3.setItemName("목장등록후교회등록");
		item3.setWeight(5);
		item3.setCode("mokjangYn3");
		
		ReportItem item4 = new ReportItem();
		item4.setSeq(4l);
		item4.setItemName("양육1권수료자");
		item4.setWeight(5);
		item4.setCode("mokjangYn4");
		
		ReportItem item5 = new ReportItem();
		item5.setSeq(5l);
		item5.setItemName("학교양육1권수료");
		item5.setWeight(5);
		item5.setCode("mokjangYn5");
		
		ReportItem item6 = new ReportItem();
		item6.setSeq(6l);
		item6.setItemName("교회등록");
		item6.setWeight(5);
		item6.setCode("mokjangYn6");
		
		ReportItem item7 = new ReportItem();
		item7.setSeq(7l);
		item7.setItemName("교회등록후목장참석");
		item7.setWeight(5);
		item7.setCode("mokjangYn7");
		
		ReportItem item8 = new ReportItem();
		item8.setSeq(8l);
		item8.setItemName("목장집회1명감소");
		item8.setWeight(5);
		item8.setCode("mokjangYn8");
		
		ReportItem item9 = new ReportItem();
		item9.setSeq(9l);
		item9.setItemName("번식하여나가는분");
		item9.setWeight(5);
		item9.setCode("mokjangYn9");
		
		ReportItem item10 = new ReportItem();
		item10.setSeq(10l);
		item10.setItemName("식당봉사");
		item10.setWeight(5);
		item10.setCode("mokjangYn10");
		
		items.add(item0);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		items.add(item9);
		items.add(item10);
		
		model.addAttribute("reportItems", items);
		
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
	
	@RequestMapping(value="/mokjang/detail.oe", method=RequestMethod.GET)
	public String detail(@RequestParam long seq, Model model) {
		
		model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(seq));
		
		return "report/mokjangReport_detail";
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.GET)
	public String modifyPage(@RequestParam long mokjangReportSeq, Model model) {
		
		model.addAttribute("mokjangReport", mokjangReportService.getMokjangReport(mokjangReportSeq));
		
		return "report/mokjangReport_modify";
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.POST)
	public  @ResponseBody String modify(@ModelAttribute MokjangReport mokjangReport, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		returnObject.addProperty("success", mokjangReportService.modify(mokjangReport));
//		returnObject.addProperty("data", "data1");
		
		return returnObject.toString();
	}
	
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

