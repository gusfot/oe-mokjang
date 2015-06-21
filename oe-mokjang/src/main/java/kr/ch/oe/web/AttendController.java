package kr.ch.oe.web;


import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.model.Attend;
import kr.ch.oe.model.AttendItem;
import kr.ch.oe.model.MokjangAttend;
import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.model.User;
import kr.ch.oe.service.AttendItemService;
import kr.ch.oe.service.DepartmentService;
import kr.ch.oe.service.MokjangAttendService;
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
@RequestMapping("/attend")
@Controller
public class AttendController {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private MokjangAttendService mokjangAttendService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AttendItemService attendItemService;
	
	@RequestMapping("/mokjang/list.oe")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		long deptSeq = sessionUserVO.getDeptSeq();
		
		int weeks = request.getParameter("weeks") !=null ? Integer.parseInt(request.getParameter("weeks")) : DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString())); 
		
		model.addAttribute("mokjangAttends", mokjangAttendService.getMokjangAttends(deptSeq ));
		model.addAttribute("mokjangAttend", mokjangAttendService.getMokjangAttend(deptSeq,weeks));
		model.addAttribute("weeks", weeks);
		
		return "attend/mokjangAttend_list";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.GET)
	public String registForm(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		long deptSeq = sessionUserVO.getDeptSeq();
		
		List<User> mokjangUsers = departmentService.getMokjangUsers(deptSeq);
		model.addAttribute("mokjangUsers", mokjangUsers);
		
		Map<String, Object> params = new HashMap<>();
		List<AttendItem> items = attendItemService.getList(params);

		model.addAttribute("attendItems", items);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
		model.addAttribute("thisWeeks", weeks);
		model.addAttribute("firstDate", DateUtil.getFirstDateByWeeks(year, weeks));
		model.addAttribute("lastDate", DateUtil.getLastDateByWeeks(year, weeks));
		
		return "attend/mokjangAttend_regist";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.POST)
	public @ResponseBody String regist(HttpServletRequest request, HttpServletResponse response, 
									   @ModelAttribute MokjangAttend mokjangAttend, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		String userId = sessionUserVO.getUserId();
		
		// 목장모임을 한 날짜를 기준으로 해당주의 목장보고서를 등록한다.
		String[] worshiDate = {"2015","06","21"};
		
		// 주차
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(worshiDate[0]), Integer.parseInt(worshiDate[1]), Integer.parseInt(worshiDate[2]));
//		System.out.println(weeks + "번째 주입니다.");
//		System.out.println(mokjangReport.toString());
		
		mokjangAttend.setWeeks(weeks);
		mokjangAttend.setRegId(userId);
		for(Attend attend : mokjangAttend.getAttends()){
			attend.setWeeks(weeks);
			attend.setRegId(userId);
			attend.setDeptSeq(mokjangAttend.getDeptSeq());
		}
		
		
		returnObject.addProperty("success", mokjangAttendService.regist(mokjangAttend));
		returnObject.addProperty("seq", mokjangAttend.getMokjangAttendSeq());
		
		return returnObject.toString();
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.POST)
	public @ResponseBody String modify(HttpServletRequest request, HttpServletResponse response, 
									   @ModelAttribute MokjangAttend mokjangAttend, Model model) {
		
		JsonObject returnObject = new JsonObject();
		
		SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
		String userId = sessionUserVO.getUserId();
		
		// 목장모임을 한 날짜를 기준으로 해당주의 목장보고서를 등록한다.
		String[] worshiDate = {"2015","06","21"};
		
		// 주차
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(worshiDate[0]), Integer.parseInt(worshiDate[1]), Integer.parseInt(worshiDate[2]));
//		System.out.println(weeks + "번째 주입니다.");
		
		mokjangAttend.setWeeks(weeks);
		mokjangAttend.setRegId(userId);
		for(Attend attend : mokjangAttend.getAttends()){
			attend.setWeeks(weeks);
			attend.setRegId(userId);
			attend.setDeptSeq(mokjangAttend.getDeptSeq());
		}
		
		
		returnObject.addProperty("success", mokjangAttendService.modify(mokjangAttend));
		returnObject.addProperty("seq", mokjangAttend.getMokjangAttendSeq());
		
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
			model.addAttribute("mokjangAttend", mokjangAttendService.getMokjangAttend(seq));
		}else {
			model.addAttribute("mokjangAttend", mokjangAttendService.getMokjangAttend(deptSeq, weeks));
		}
		Map<String, Object> params = new HashMap<>();
		List<AttendItem> items = attendItemService.getList(params);

		model.addAttribute("attendItems", items);
		
		model.addAttribute("firstDate", DateUtil.getFirstDateByWeeks(year, weeks));
		model.addAttribute("lastDate", DateUtil.getLastDateByWeeks(year, weeks));
		
		int thisWeeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
		model.addAttribute("thisWeeks", thisWeeks);
		
		return "attend/mokjangAttend_detail";
	}
	
	@RequestMapping(value="/mokjang/modify.oe", method=RequestMethod.GET)
	public String modifyPage(@RequestParam long mokjangReportSeq, Model model) {
		
		model.addAttribute("mokjangAttend", mokjangAttendService.getMokjangAttend(mokjangReportSeq));
		
		return "attend/mokjangAttend_modify";
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
        
        MokjangAttend mokjangAttend= mokjangAttendService.getMokjangAttend(14l);
 
        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("excelView", "mokjangReport", mokjangAttend);
    }
    
    @RequestMapping(value="/testExcel.oe", method=RequestMethod.GET)
    public String testExcel(Model model) {
    	
    	MokjangAttend mokjangAttend= mokjangAttendService.getMokjangAttend(14l);
    	model.addAttribute("mokjangReport", mokjangAttend);
        return "excelView";
    }
}

