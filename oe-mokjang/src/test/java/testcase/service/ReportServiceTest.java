package testcase.service;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;
import kr.ch.oe.service.ReportService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class ReportServiceTest {

	@Autowired
	ReportService reportService;
	
	//@Test
	public void insertPersonalReport(){
		//Report report = new Report();

		PersonalReport personalReport = new PersonalReport();
		personalReport.setId(1);
		personalReport.setMemberNameMokjang("김현래");
		personalReport.setAttendMokjang(1);
		personalReport.setEnrollMokjang(1);
		personalReport.setAttend8weeksMokjang(1);
		personalReport.setEnrollChurchAfterEnrollMokjang(1);
		personalReport.setGraduateNurtureMokjang(1);
		
		reportService.registPersonalReport(personalReport);
		
	}
	
	@Test
	public void insertReport(){
		
		List<PersonalReport> personalReports = new ArrayList<PersonalReport>();
		
		PersonalReport personalReport1 = new PersonalReport();
		personalReport1.setId(1);
		personalReport1.setMemberNameMokjang("김현래");
		personalReport1.setAttendMokjang(1);
		personalReport1.setEnrollMokjang(1);
		personalReport1.setAttend8weeksMokjang(1);
		personalReport1.setEnrollChurchAfterEnrollMokjang(1);
		personalReport1.setGraduateNurtureMokjang(1);
		personalReports.add(personalReport1);
		
		PersonalReport personalReport2 = new PersonalReport();
		personalReport2.setId(2);
		personalReport2.setMemberNameMokjang("조명래");
		personalReport2.setAttendMokjang(1);
		personalReport2.setEnrollMokjang(1);
		personalReport2.setAttend8weeksMokjang(1);
		personalReport2.setEnrollChurchAfterEnrollMokjang(1);
		personalReport2.setGraduateNurtureMokjang(1);
		personalReports.add(personalReport2);
		
		
		
		Report report = new Report();
		report.setId(1);
		report.setMeetingPlace("오병이어교회 기도실");
		report.setMeetingDate("20131214");
		report.setWelcomeMember("김현래");
		report.setWorshipMember("조명래");
		report.setWordMember("김세영");
		report.setWorkMember("오준석");
		report.setNextMeetingPlace("오병이어교회 새벽홀");
		report.setOffering(5000);
		report.setPersonalReports(personalReports);

		
		reportService.registMokjangReport(report);
	}
}
