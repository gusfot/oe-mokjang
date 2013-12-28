package kr.ch.oe.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;
import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.service.MokjangService;
import kr.ch.oe.service.ReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@Autowired
	private ReportService reportService;
	
	@Autowired
	private MokjangService mokjangService;
	
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
	public String regist(HttpServletRequest request, Model model){
		HttpSession session = request.getSession();
		
		Member member = (Member) session.getAttribute("loggedMember");
		Mokjang mokjang = mokjangService.getMokjangByLeader(member);
		System.out.println(mokjang.getId());
		
		model.addAttribute("members", mokjang.getMembers());
		System.out.println(mokjang.getMembers().size());
		return "report/report_regist";
	}
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.POST)
	public String regist(
			
						@RequestParam("memberId") List<String> idList
						,@RequestParam("name") List<String> nameList
						,@RequestParam("attendMokjang") List<String> attendMokjangList
						,@RequestParam("enrollMokjang") List<String> enrollMokjangList
						,@RequestParam("attend8weeksMokjang") List<String> attend8weeksMokjangList
						,@RequestParam("attendMokjangAfterChurch") List<String> attendMokjangAfterChurchList
						,@RequestParam("graduateNutureMokjang") List<String> graduateNutureMokjangList
						,@RequestParam("graduateSchoolChurch") List<String> graduateSchoolChurchList
						,@RequestParam("enrollChurch") List<String> enrollChurchList
						,@RequestParam("enrollChurchAfterEnrollMokjang") List<String> enrollChurchAfterEnrollMokjangList
						,@RequestParam("decreaseAttendantMokjangChurch") List<String> decreaseAttendantMokjangChurchList
						,@RequestParam("sent") List<String> sentChurchList
						,@RequestParam("restaurantService") List<String> restaurantServiceChurchList
						,HttpServletRequest request){
		
		PersonalReport personalReport =null;
		for(int i=0; i<nameList.size();i++){
			Member member = new Member();
			member.setId(Long.parseLong(idList.get(i)));
			personalReport = new PersonalReport();
			personalReport.setMember(member);
			personalReport.setAttendMokjang(Integer.parseInt(attendMokjangList.get(i)));
			personalReport.setEnrollMokjang(Integer.parseInt(enrollMokjangList.get(i)));
			personalReport.setAttend8weeksMokjang(Integer.parseInt(attend8weeksMokjangList.get(i)));
			personalReport.setAttendMokjangAfterChurch(Integer.parseInt(attendMokjangAfterChurchList.get(i)));
			personalReport.setGraduateNurtureMokjang(Integer.parseInt(graduateNutureMokjangList.get(i)));
			personalReport.setGraduateSchoolChurch(Integer.parseInt(graduateSchoolChurchList.get(i)));
			personalReport.setEnrollChurch(Integer.parseInt(enrollChurchList.get(i)));
			personalReport.setEnrollChurchAfterEnrollMokjang(Integer.parseInt(enrollChurchAfterEnrollMokjangList.get(i)));
			personalReport.setDecreaseAttendantMokjangChurch(Integer.parseInt(decreaseAttendantMokjangChurchList.get(i)));
			personalReport.setSentChurch(Integer.parseInt(sentChurchList.get(i)));
			personalReport.setRestaurantServiceChurch(Integer.parseInt(restaurantServiceChurchList.get(i)));
			
			reportService.registPersonalReport(personalReport);
			
			System.out.println("name : " );
			
		}
		return "redirect:list.oe";
	}
}
