package kr.ch.oe.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gusfot
 *
 */

@RequestMapping("/report")
@Controller
public class ReportController {

	@RequestMapping("/list.oe")
	public String list(){
		return "report/report_list";
	}
	
	@RequestMapping("/detail.oe")
	public String detail(){
		return "report/report_detail";
	}
	
	@RequestMapping("/delete.oe")
	public String delete(){
		return "report/report_delete";
	}
	
	@RequestMapping("/modify.oe")
	public String modify(){
		return "report/report_modify";
	}
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.GET)
	public String registPage(){
		return "report/report_regist";
	}
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.POST)
	public String regist(@RequestParam("name") List<String> nameList){
		
		for (String name : nameList) {
			System.out.println("이름 : " + name);
		}
		return "redirect:list.oe";
	}
}
