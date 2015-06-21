package kr.ch.oe.service;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.model.Attend;
import kr.ch.oe.model.MokjangAttend;
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
public class MokjangAttendtServiceTest {

	@Autowired
	MokjangAttendService mokjangAttendService;
	
	@Autowired
	UserService userService;
	
	/**
	 * 목장보고서 등록
	 */
	@Test
	public void regist() {
		MokjangAttend mokjangAttend = new MokjangAttend();
		mokjangAttend.setDeptSeq(14l);
		mokjangAttend.setRegId("gusfot");
		mokjangAttend.setWeeks(2);
		
		List<Attend> attends = new ArrayList<>();
		Attend attend1 = new Attend();
		attend1.setDeptSeq(14l);
		attend1.setRegId("gusfot");
		attend1.setUserId("gusfot");
		attend1.setWeeks(2);
		
		Attend attend2 = new Attend();
		attend2.setDeptSeq(14l);
		attend2.setRegId("kjy");
		attend2.setUserId("kjy");
		attend2.setWeeks(2);
		
		attends.add(attend1);
		attends.add(attend2);
		mokjangAttend.setAttends(attends);
		
		mokjangAttendService.regist(mokjangAttend);
		
	}
	
	@Test
	public void getMokjangReport() {
		MokjangAttend mokjangAttend = mokjangAttendService.getMokjangAttend(1l);
		Assert.assertTrue(mokjangAttend != null);
	}
	
	@Test
	public void getMokjangReports() {
		List<MokjangAttend> mokjangAttends = mokjangAttendService.getMokjangAttends(14);
		Assert.assertTrue(mokjangAttends.size() > 0);
	}
	
	
	@Test
	public void isSubmited() {
		boolean result = mokjangAttendService.isSubmited(84, 20);
		Assert.assertTrue(result);
	}
	
	
}
