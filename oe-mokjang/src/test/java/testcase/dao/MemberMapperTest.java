package testcase.dao;

import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.model.Member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class MemberMapperTest {

	@Autowired
	MemberMapper memberMapper;
	
	@Test
	public void insertMember(){
		Member member = new Member();
		member.setId(2);
		member.setPassword("5252");
		member.setName("김현");
		member.setAddress("경기도 광명시");
		member.setBirthday("19820408");
		member.setEmail("gusfot@gmail.com");
		member.setHomePhone("07011112222");
		member.setMobilePhone("01063901427");
		member.setJob("IT개발자");
		
		memberMapper.insert(member);
	}
}
