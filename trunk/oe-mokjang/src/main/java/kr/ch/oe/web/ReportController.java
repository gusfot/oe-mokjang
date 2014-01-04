package kr.ch.oe.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;
import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;
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
	public String detail(@RequestParam long reportId, Model model){
		Report report  = reportService.getMokjangReport(reportId);
		model.addAttribute("report",report);
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
	public String regist(@RequestParam String meetingDate
						,@RequestParam String meetingPlace
						,@RequestParam String welcomeMember
						,@RequestParam String wordMember
						,@RequestParam String workMember
						,@RequestParam String worshipMember
						,@RequestParam String offering
						,@RequestParam String nextMeetingPlace
						//,@RequestParam("memberName") String[] nameList
						,@RequestParam("memberId[]") String[] idList
						,@RequestParam("attendMokjang[]") String[] attendMokjangList
						,@RequestParam("enrollMokjang[]") String[] enrollMokjangList
						,@RequestParam("attend8weeksMokjang[]") String[] attend8weeksMokjangList
						,@RequestParam("attendMokjangAfterChurch[]") String[] attendMokjangAfterChurchList
						,@RequestParam("graduateNutureMokjang[]") String[] graduateNutureMokjangList
						,@RequestParam("graduateSchoolChurch[]") String[] graduateSchoolChurchList
						,@RequestParam("enrollChurch[]") String[] enrollChurchList
						,@RequestParam("enrollChurchAfterEnrollMokjang[]") String[] enrollChurchAfterEnrollMokjangList
						,@RequestParam("decreaseAttendantMokjangChurch[]") String[] decreaseAttendantMokjangChurchList
						,@RequestParam("sentChurch[]") String[] sentChurchList
						,@RequestParam("restaurantService[]") String[] restaurantServiceChurchList
						,HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		Member loggedMember = (Member) session.getAttribute("loggedMember");
		Group group = loggedMember.getGroup();

		Report report = new Report();
		report.setGroup(group);
		report.setMeetingDate(meetingDate);
		report.setMeetingPlace(meetingPlace);
		//report.setMokjang(mokjang);
		report.setWeeks(DateUtil.getWeeks());
		report.setWelcomeMember(welcomeMember);
		report.setWordMember(wordMember);
		report.setWorkMember(workMember);
		report.setWorshipMember(worshipMember);
		report.setOffering(Integer.parseInt(offering));
		report.setNextMeetingPlace(nextMeetingPlace);
		
		List<PersonalReport> personalReports = new ArrayList<PersonalReport>();
		PersonalReport personalReport =null;
		for(int i=0; i<idList.length;i++){
			Member member = new Member();
			member.setId(Long.parseLong(idList[i]));
			personalReport = new PersonalReport();
			personalReport.setMember(member);
			personalReport.setGroup(group);
			personalReport.setWeeks(DateUtil.getWeeks());
			personalReport.setAttendMokjang(Integer.parseInt(attendMokjangList[i]));
			personalReport.setEnrollMokjang(Integer.parseInt(enrollMokjangList[i]));
			personalReport.setAttend8weeksMokjang(Integer.parseInt(attend8weeksMokjangList[i]));
			personalReport.setAttendMokjangAfterChurch(Integer.parseInt(attendMokjangAfterChurchList[i]));
			personalReport.setGraduateNurtureMokjang(Integer.parseInt(graduateNutureMokjangList[i]));
			personalReport.setGraduateSchoolChurch(Integer.parseInt(graduateSchoolChurchList[i]));
			personalReport.setEnrollChurch(Integer.parseInt(enrollChurchList[i]));
			personalReport.setEnrollChurchAfterEnrollMokjang(Integer.parseInt(enrollChurchAfterEnrollMokjangList[i]));
			personalReport.setDecreaseAttendantMokjangChurch(Integer.parseInt(decreaseAttendantMokjangChurchList[i]));
			personalReport.setSentChurch(Integer.parseInt(sentChurchList[i]));
			personalReport.setRestaurantServiceChurch(Integer.parseInt(restaurantServiceChurchList[i]));
			personalReports.add(personalReport);
			
		}
		report.setPersonalReports(personalReports);
		
		reportService.registMokjangReport(report);
		
		return "redirect:detail.oe?reportId="+report.getId();
	}
}
