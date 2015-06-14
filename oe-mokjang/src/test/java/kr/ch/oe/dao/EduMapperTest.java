package kr.ch.oe.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import kr.ch.oe.model.Edu;
import kr.ch.oe.model.EduExample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {// "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml" })

public class EduMapperTest {

	@Autowired
	private EduMapper eduMapper;
	
	@Test
	public void regist() {
		Edu edu = new Edu();
		int result = eduMapper.insert(edu );
		
		assertTrue(result>0);
	}
	
	@Test
	public void selectList() {
		EduExample example = new EduExample();
		List<Edu> eduList= eduMapper.selectByExample(example);
		
		assertTrue(eduList.size()>0);
	}
	
	@Test
	public void select() {
		Long eduSeq = 1l;
		Edu edu= eduMapper.selectByPrimaryKey(eduSeq);
		
		assertTrue("인간의 삶".equals(edu.getEduName()));
	}
	
}
