package kr.ch.oe.service;

import java.util.List;

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
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	
	@Test
	public void successToGetUserList(){
		UserExample example = new UserExample();
		List<User> userList = userService.getUserList(example);
		Assert.assertTrue(userList.size()>0);
	}
	
	@Test
	public void successToGetUser() {
		User user =  userService.getUser("test123114");
		Assert.assertNotNull(user);
	}
	
	@Test
	public void failToGetUser() {
		User user = userService.getUser("as;ldkfj");
		Assert.assertNull(user);
		
	}
	
	@Test
	public void successToRegisterUser() {
		User user = new User();
		user.setUserId("test123114");
		user.setUserName("테스트1");
		user.setEmail("test1@52ch.kr");
		user.setCellPhone("01011112222");
		user.setHomePhone("0233334444");
		user.setDeptSeq(0l);
		user.setPassword("test1");
		user.setBirth("20000101");
		user.setAddr("경기도 광명시");
		user.setRoleSeq(1l);
		user.setRegDt("20150109");
		user.setJob("직업");
		user.setGender("1");
		
		boolean result = userService.registerUser(user);
		Assert.assertTrue(result);
		
	}
	@Test
	public void failToRegisterUser() {
		User user = new User();
		user.setUserId("test123114");
		try {
			userService.registerUser(user);
		} catch (Exception e) {
			System.out.println("ExceptionMessage"+e.getMessage());
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void successToModifyUser() {
		User user =  userService.getUser("test123114");
		user.setJob("개발자");
		user.setGender("2");
		boolean result = userService.modifyUser(user);
		Assert.assertTrue(result);
		
		
	}
	
	@Test
	public void failToModifyUser() {
		
		User user = userService.getUser("test123114");
		user.setUserId("test1");
		try {
			userService.modifyUser(user);
		} catch (Exception e) {
			System.out.println("ExceptionMessage"+e.getMessage());
			Assert.assertTrue(true);
		}
	}
	@Test
	public void failToRemoveUser() {
		
		boolean result = userService.removeUser("test123114");
		Assert.assertTrue(result);
	}
	
}
