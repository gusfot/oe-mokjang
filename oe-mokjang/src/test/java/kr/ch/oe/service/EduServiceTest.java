
package kr.ch.oe.service;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Edu;
import kr.ch.oe.model.EduStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
public class EduServiceTest {

	@Autowired
	private EduService eduService;
	
	@Test
	public void regist() {

		EduStatus eduStatus = new EduStatus();
		boolean result = eduService.regist(eduStatus );
		
		assertTrue(result);
	}
	
	@Test
	public void getEduStatusList() {

		Map<String, Object> params = new HashMap<>();
		List<EduStatus> eduStatusList = eduService.getEduStatusList(params );
		
		assertTrue(eduStatusList.size()>0);
	}

	@Test
	public void eduEduList() {

		Map<String, Object> params = new HashMap<>();
		List<Edu> eduList = eduService.getEduList(params );
		
		assertTrue(eduList.size()>0);
	}
	
	@Test
	public void getEdu() {

		Long edusSeq = 1l;
		Edu edu = eduService.getEdu(edusSeq  );
		
		assertTrue(edu.equals("인간의 삶"));
	}

	
}
