package testcase.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.Group;
import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class ReportTest {

	@Autowired
	ReportMapper reportMapper;
	
	@Test
	public void insertPersonalReport(){
		Group group = new Group();
		group.setId(1);
		PersonalReport personalReport = new PersonalReport();
		personalReport.setMemberNameMokjang("김현래");
		personalReport.setAttendMokjang(1);
		personalReport.setEnrollMokjang(1);
		personalReport.setAttend8weeksMokjang(1);
		personalReport.setEnrollChurchAfterEnrollMokjang(1);
		personalReport.setGraduateNurtureMokjang(1);
		personalReport.setGroup(group);
		reportMapper.insertPersonalReport(personalReport);
		
	}
	
	@Test
	//@Transactional
	public void insertReport(){
		Group group = new Group();
		group.setId(1);
		
		List<PersonalReport> personalReports = new ArrayList<PersonalReport>();
		
		PersonalReport personalReport1 = new PersonalReport();
		personalReport1.setWeeks(50);
		personalReport1.setMemberNameMokjang("김현래1");
		personalReport1.setAttendMokjang(1);
		personalReport1.setEnrollMokjang(1);
		personalReport1.setAttend8weeksMokjang(1);
		personalReport1.setEnrollChurchAfterEnrollMokjang(1);
		personalReport1.setGraduateNurtureMokjang(1);
		personalReport1.setGroup(group);
		personalReports.add(personalReport1);
		
		PersonalReport personalReport2 = new PersonalReport();
		personalReport2.setWeeks(50);
		personalReport2.setMemberNameMokjang("조명래1");
		personalReport2.setAttendMokjang(1);
		personalReport2.setEnrollMokjang(1);
		personalReport2.setAttend8weeksMokjang(1);
		personalReport2.setEnrollChurchAfterEnrollMokjang(1);
		personalReport2.setGraduateNurtureMokjang(1);
		personalReport2.setGroup(group);
		personalReports.add(personalReport2);
		
		
		
		Report report = new Report();
		report.setWeeks(51);
		report.setMeetingPlace("오병이어교회 기도실");
		report.setMeetingDate("20131230");
		report.setWelcomeMember("김현래");
		report.setWorshipMember("조명래");
		report.setWordMember("김세영");
		report.setWorkMember("오준석");
		report.setNextMeetingPlace("오병이어교회 새벽홀");
		report.setOffering(3000);
		report.setPersonalReports(personalReports);
		report.setGroup(group);
		for(PersonalReport personalReport : report.getPersonalReports()){
			personalReport.setMokjangReport(report);
			//reportMapper.insertPersonalReport(personalReport);
		}
		
		reportMapper.insertMokjangReport(report);
	}
	
	@Test
	public void selectReport(){
		
	}
}
