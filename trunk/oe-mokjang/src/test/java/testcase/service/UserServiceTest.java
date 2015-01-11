package testcase.service;

import kr.ch.oe.dao.DepartmentMapper;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.User;
import kr.ch.oe.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Autowired
	
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setUserId("test");
		user.setPassword("test");
		user.setGender("1");
		user.setUserName("TEST");
		user.setDeptSeq(2l);
		user.setRoleSeq(8l);
		
		
	}
	
}
