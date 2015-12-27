package kr.ch.oe.service;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.model.Report;
import kr.ch.oe.model.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
//		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
public class ReportServiceTest {

	@Autowired
	ReportService reportService;
	
	UserService userService;
	
	
	@Test
	public void regist() {
		
		User user = userService.getUser("gusfot");		// 목자가 등록할 경우
		
		List<Report> reports = new ArrayList<>();
		
		Report report = new Report();
		report.setDeptSeq(user.getDeptSeq());
		report.setRegId(user.getUserId());
		report.setWeeks(1);
		
		reports.add(report);
		
		boolean result = reportService.registReports(reports);
	
		Assert.assertTrue(result);
	}
	
	@Test
	public void getReportsByDeptAndWeeks() {
		
		User user = userService.getUser("gusfot");		// 목자가 등록할 경우
		
		long deptSeq = user.getDeptSeq();
		int weeks = 2;
		List<Report> reports =reportService.getReports(deptSeq, weeks);
		
		Assert.assertTrue(reports.size() > 0);
	}
	
	
}
