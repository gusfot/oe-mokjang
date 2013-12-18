package testcase.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.GroupMapper;
import kr.ch.oe.model.Group;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class GroupMapperTest {

	@Autowired
	GroupMapper groupMapper;
	
	@Test
	public void insert(){
		Group group = new Group();
		group.setType(1);
		
		groupMapper.insert(group);
	}
	
	@Test
	public void update(){
		Group group = new Group();
		
		groupMapper.update(group);
	}
	
	@Test
	public void delete(){
		Group group = new Group();
		
		groupMapper.delete(group.getId());
	}
	
	@Test
	public void selecGroupById(){
		
		Group group = groupMapper.selectGroupById(2);
	}
	
	@Test
	public void selectGroupsByCriteria(){
		Map criteria = new HashMap();
		List<Group> groups = groupMapper.selectGroupsByCriteria(criteria);
	}
	
	
}
