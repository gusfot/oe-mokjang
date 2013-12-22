package testcase.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.MokjangMapper;
import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class MokjangMapperTest {

	@Autowired
	MokjangMapper mokjangMapper;
	
	@Test
	public void insert(){
		
		Member leader = new Member();
		leader.setMemberId(1);
		Group group =new Group();
		group.setChurchId(1);
		group.setGyoguId(1);
		Mokjang mokjang = new Mokjang();
		mokjang.setGroup(group);
		mokjang.setLeader(leader);
		
		mokjangMapper.insert(mokjang);
	}
	
	//@Test
	public void update(){
		Mokjang mokjang = new Mokjang();
		
		mokjangMapper.update(mokjang);
	}
	
	//@Test
	public void delete(){
		Mokjang mokjang = new Mokjang();
		
		mokjangMapper.delete(mokjang.getMokjangId());
	}
	
	//@Test
	public void selecGroupById(){
		
		Group group = mokjangMapper.selectMokjangById(1);
	}
	
	//@Test
	public void selectGroupsByCriteria(){
		Map criteria = new HashMap();
		List<Group> groups = mokjangMapper.selectMokjangsByCriteria(criteria);
	}
	
	
}
