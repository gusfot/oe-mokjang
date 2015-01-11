package testcase.service;

import java.util.List;

import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class MemberServiceTest {

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void selectUsers() {
		
		
		UserExample example = new UserExample();
		List<User> userList = userMapper.selectByExample(example );
		
		Assert.assertTrue(userList.size()>0);
	}
	
	@Test
	public void selectUser() {
		
		
		User user = userMapper.selectByPrimaryKey("admin");
		
		Assert.assertTrue(user != null);
	}
}
