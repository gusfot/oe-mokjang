package kr.ch.oe.dao;

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
@ContextConfiguration(locations = {// "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml" })
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void successToselectUser() {
		User user = userMapper.selectByPrimaryKey("admin");
		System.out.println(user.getUserName());
		Assert.assertTrue(user != null);
	}
	
	@Test
	public void failToSelectUser(){
		User user = userMapper.selectByPrimaryKey("1234");
		Assert.assertNull(user);
	}
	

	@Test
	public void successToselectUsers() {
		UserExample example = new UserExample();
		List<User> userList = userMapper.selectByExample(example);
		System.out.println(userList.size());
		Assert.assertTrue(userList.size() > 0);
	}
	

	@Test
	public void successToinsertUser() {
		User user = new User();

		user.setUserId("test12");
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

		int result = userMapper.insertSelective(user);

		Assert.assertTrue(result > 0);
	}
	
	@Test
	public void failToInsertUser() {
		User user = new User();
		user.setUserId("admin");
		try {
			userMapper.insertSelective(user);
		} catch (Exception e) {
			System.out.println("ExceptionMessage"+e.getMessage());
			Assert.assertTrue(true);
		}		

	}
	
	
	@Test
	public void successToUpdateUser() {
		User user = userMapper.selectByPrimaryKey("test12");
				user.setUserName("update테스트");
	  int reuslt = userMapper.updateByPrimaryKeySelective(user);
	  Assert.assertTrue(reuslt>0);
				
	}
	@Test
	public void failToUpdateUser() {
		User user = userMapper.selectByPrimaryKey("test");
		user.setUserId("test1");
		try {
			userMapper.updateByPrimaryKeySelective(user);
			
		} catch (Exception e) {
			System.out.println("ExceptionMessage"+e.getMessage());
			Assert.assertTrue(true);
			
		}
	}
	
	@Test
	public void successToDeleteUser() {
		int result = userMapper.deleteByPrimaryKey("test12");
		Assert.assertTrue(result>0);
	}
	
	@Test
	public void failToDeleteUser() {
		int result  = userMapper.deleteByPrimaryKey("asdfasdfasd");
		Assert.assertTrue(result==0);
	}
	
	
}
