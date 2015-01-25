package kr.ch.oe.dao;

import java.util.HashMap;
import java.util.Map;

import kr.ch.oe.model.MokjangReport;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class MokjangReportMapperTest {
	
	@Autowired
	private MokjangReportMapper mokjangReportMapper;
	
	@Test
	public void selectMokjangReport() {
		Map<String, Object> params = new HashMap<>();
		params.put("deptSeq", 14);
		params.put("weeks", 2);
		MokjangReport mokjangReport = mokjangReportMapper.selectMokjangReport(params);
		
		System.out.println(mokjangReport.getWorshipDt());
		System.out.println(mokjangReport.getReports().size());
		Assert.assertTrue(mokjangReport != null);
	}
	
}
