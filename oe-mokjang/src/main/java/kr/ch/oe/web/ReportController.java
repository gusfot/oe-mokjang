package kr.ch.oe.web;


import java.util.List;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.User;
import kr.ch.oe.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
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
	
	@RequestMapping("/list.oe")
	public String list() {
		return "report/report_list";
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
		
		return "report/mokjangReport_regist";
	}
	
	@RequestMapping(value="/mokjang/regist.oe", method=RequestMethod.POST)
	public @ResponseBody String regist(@ModelAttribute MokjangReport mokjangReport, Model model) {
		
		System.out.println(mokjangReport.toString());
		JsonObject innerObject = new JsonObject();
		innerObject.addProperty("success", true);
		innerObject.addProperty("data", "data1");
		
		return innerObject.toString();
	}
	
	@RequestMapping("/detail.oe")
	public String detail() {
		return "report/report_detail";
	}
}

