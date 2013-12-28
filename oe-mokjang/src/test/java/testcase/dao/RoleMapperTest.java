package testcase.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.RoleMapper;
import kr.ch.oe.model.Role;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class RoleMapperTest {

	@Autowired
	RoleMapper roleMapper;
	
	@Test
	public void insert(){
		Role role = new Role();
		
		roleMapper.insert(role);
	}
	
	@Test
	public void update(){
		Role role = new Role();
		
		roleMapper.update(role);
	}
	
	@Test
	public void delete(){
		Role role = new Role();
		
		roleMapper.delete(role.getId());
	}
	
	@Test
	public void selecGroupById(){
		
		Role role = roleMapper.selectRoleById(2);
	}
	
	@Test
	public void selectGroupsByCriteria(){
		Map criteria = new HashMap();
		List<Role> roles = roleMapper.selectRolesByCriteria(criteria);
	}
	
	
}
