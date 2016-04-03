package kr.ch.oe.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.Report;
import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

@RunWith(SpringJUnit4ClassRunner.class) 
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
//		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
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
	
	/**
	 * 목장 보고서 조회 
	 */
	@Test
	public void getMokjangReport() {
		MokjangReport mokjangReport = mokjangReportService.getMokjangReport(1l);
		Assert.assertTrue(mokjangReport != null);
	}
	
	/**
	 * 목장보고서 목록 조회 
	 */
	@Test
	public void getMokjangReports() {
		List<MokjangReport> mokjangReports = mokjangReportService.getMokjangReports(14);
		Assert.assertTrue(mokjangReports.size() > 0);
	}
	
	/**
	 * 특정 목장의 특정 주의 보고서 제출여부 확
	 */
	@Test
	public void isSubmited() {
		boolean result = mokjangReportService.isSubmited(84, 20);
		Assert.assertTrue(result);
	}
	
	@Test
	public void getTotalPointByDeptSeq() {
		long deptSeq = 84;
		int totalPoint = mokjangReportService.getTotalPointByDeptSeq(deptSeq );
		Assert.assertTrue(totalPoint>0);
	}
	
	
	private static String templateFileName = "src/main/resources/mokjangReport.xls";
	private static String destFileName = "target/mokjangReport_output.xls";
	    
	@Test
	public void getXls() throws ParsePropertyException, InvalidFormatException, IOException {

		MokjangReport mokjangReport = mokjangReportService.getMokjangReport(40l);
        Map beans = new HashMap();
        beans.put("mokjangReport", mokjangReport);
        XLSTransformer transformer = new XLSTransformer();
        transformer.transformXLS(templateFileName, beans, destFileName);
        Assert.assertTrue(mokjangReport != null);
	}
	
	
}
