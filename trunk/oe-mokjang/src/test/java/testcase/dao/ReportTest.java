package testcase.dao;

import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class ReportTest {

	@Autowired
	ReportMapper reportMapper;
	
	@Test
	public void testInsertReport(){
		Report report = new Report();

		PersonalReport personalReport = new PersonalReport();
		personalReport.setId(1);
		personalReport.setMemberNameMokjang("김현래");
		personalReport.setAttendMokjang(1);
		personalReport.setEnrollMokjang(1);
		personalReport.setAttend8weeksMokjang(1);
		personalReport.setEnrollChurchAfterEnrollMokjang(1);
		personalReport.setGraduateNurtureMokjang(1);
		
		reportMapper.insert(report);
		
	}
}
