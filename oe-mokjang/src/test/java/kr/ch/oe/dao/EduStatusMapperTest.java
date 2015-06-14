package kr.ch.oe.dao;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.EduStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {// "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml" })

public class EduStatusMapperTest {

	@Autowired
	private EduStatusMapper eduStatusMapper;
	
	@Test
	public void regist() {
		EduStatus eduStatus = new EduStatus();
		int result = eduStatusMapper.insert(eduStatus );
		
		assertTrue(result>0);
	}
	
	@Test
	public void selectList() {
		
		Map<String, Object> params = new HashMap<>();
		List<EduStatus> eduStusList = eduStatusMapper.selectEduStatusList(params );
		
		assertTrue(eduStusList.size()>0);
	}
	
	@Test
	public void select() {
		Long eduSeq = 1l;
		EduStatus eduStatus= eduStatusMapper.selectByPrimaryKey(eduSeq);
		
		assertTrue("인간의 삶".equals(eduStatus.getEduName()));
	}
	
}
