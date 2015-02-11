package kr.ch.oe.service;

import java.util.List;
import java.util.Random;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;

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
	
	// TODO : 목장원이 목자가 될 경우 일어나는 경우
	// TODO : 목장원이 목장 또는 교구를 변경하는 경우
	
	@Test
	public void successToGetUserList(){
		Paging<User>pageList  =  userService.getPagingUserList(1, 10,"");
		Assert.assertTrue(pageList.getItems().size()>0);
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
		Random rdm = new Random();
		
		user.setUserId("test"+rdm.nextInt(100));
		user.setUserName("테스트"+rdm.nextInt(100));
		user.setEmail("test1@52ch.kr");
		user.setCellPhone("01011112222");
		user.setHomePhone("0233334444");
		user.setDeptSeq(1l);
		user.setPassword("test1");
		user.setBirth("1980101");
		user.setAddr("경기도 광명시");
		user.setRoleSeq(8l);
		user.setRegDt("20150109");
		user.setJob("직업");
		user.setGender("1");
		user.setRoleSeq(8L);
		user.setEmail("test@52ch.kr");
		user.setRoleName("새신자");
		
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
		User user =  userService.getUser("test84");
		user.setJob("개발자");
		user.setGender("2");
		boolean result = userService.modifyUser(user);
		Assert.assertTrue(result);
	}
	
	@Test
	public void failToModifyUser() {
		User user = userService.getUser("test123114");
		user.setUserId("test1");
	}
	@Test
	public void failToRemoveUser() {
		boolean result = userService.removeUser("test123114");
		Assert.assertTrue(result);
	}
	
	@Test
	public void successToGetFarmList(){
		Paging<User>pagingList = userService.getFarmUserList("sms");
		List<User> list = pagingList.getItems();
		Assert.assertTrue(list.size() > 0);
	}
	@Test
	public void successToregistUserFarm(){
		String[] list=null;
		Assert.assertTrue(userService.registUserFarm(list, "test69")); 
	}
	@Test
	public void successRemoveSheep(){
		//Assert.assertTrue(userService.removeSheep("test4",1l));
	}
}
