package kr.ch.oe.service;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.Report;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class MokjangReportServiceTest {

	@Autowired
	MokjangReportService mokjangReportService;
	
	@Autowired
	UserService userService;
	
	/**
	 * 목장보고서 등록
	 */
	@Test
	public void regist() {
		MokjangReport mokjangReport = new MokjangReport();
		mokjangReport.setDeptSeq(14l);
		mokjangReport.setOffering(2000l);
		mokjangReport.setRegId("gusfot");
		mokjangReport.setWeeks(2);
		mokjangReport.setWorshipDt("20140110");
		mokjangReport.setWorshipPlace("오병이어교회");
		
		List<Report> reports = new ArrayList<>();
		Report report1 = new Report();
		report1.setDeptSeq(14l);
		report1.setRegId("gusfot");
		report1.setUserId("gusfot");
		report1.setWeeks(2);
		
		Report report2 = new Report();
		report2.setDeptSeq(14l);
		report2.setRegId("kjy");
		report2.setUserId("kjy");
		report2.setWeeks(2);
		
		reports.add(report1);
		reports.add(report2);
		mokjangReport.setReports(reports);
		
		mokjangReportService.regist(mokjangReport);
		
	}
	
	@Test
	public void getMokjangReport() {
		MokjangReport mokjangReport = mokjangReportService.getMokjangReport(1l);
		Assert.assertTrue(mokjangReport != null);
	}
	
	@Test
	public void getMokjangReports() {
		List<MokjangReport> mokjangReports = mokjangReportService.getMokjangReports(14);
		Assert.assertTrue(mokjangReports.size() > 0);
	}
	
	
	@Test
	public void isSubmited() {
		boolean result = mokjangReportService.isSubmited(84, 20);
		Assert.assertTrue(result);
	}
	
	
}
