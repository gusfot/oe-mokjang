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
		User user = userMapper.selectByPrimaryKey("gusfot");
		System.out.println(user.getUserName());
		Assert.assertTrue(user != null);
	}
	
	@Test
	public void failToSelectUser(){
		User user = userMapper.selectByPrimaryKey("gusfot");
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
		
		int result = userMapper.insertSelective(user);
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
		
		userMapper.updateByPrimaryKeySelective(user);
			
	}
	
	@Test
	public void successToDeleteUser() {
		int result = userMapper.deleteByPrimaryKey("test12");
		Assert.assertTrue(result>0);
	}
	
	@Test
	public void selectByUserId() {
		User user  = userMapper.selectByUserId("gusfot");
		System.out.println(user.toString());
		Assert.assertTrue("김현래목장".equals(user.getDepartment().getDeptName()));
	}
	
}
