package testcase.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;
import kr.ch.oe.model.Role;

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
	
	//@Test
	public void insertMember(){
		
		Group group = new Group();
		group.setGroupId(1);
		group.setChurchId(1);
		group.setGyoguId(1);
		Mokjang mokjang = new Mokjang();
		mokjang.setGroup(group);
		mokjang.setMokjangId(1);
		
		Role role =new Role();
		role.setId(1);
		role.setType("MJ");
		
		Member member = new Member();
		member.setMemberId(2);
		member.setPassword("5252");
		member.setName("김현");
		member.setAddress("경기도 광명시");
		member.setBirthday("19820408");
		member.setEmail("gusfot@gmail.com");
		member.setHomePhone("07011112222");
		member.setMobilePhone("01063901427");
		member.setJob("IT개발자");
		member.setMokjang(mokjang);
		member.setRole(role);
		
		memberMapper.insert(member);
	}

	//@Test
	public void updateMember(){
		Member member = new Member();
		member.setMemberId(2);
		member.setPassword("5252");
		member.setName("김현");
		member.setAddress("경기도 광명시");
		member.setBirthday("19820408");
		member.setEmail("gusfot@gmail.com");
		member.setHomePhone("07011112222");
		member.setMobilePhone("01063901427");
		member.setJob("IT개발자");
		
		memberMapper.update(member);
	}
	
	//@Test
	public void deleteMember(){
		Member member = new Member();
		member.setMemberId(2);
		member.setPassword("5252");
		member.setName("김현");
		member.setAddress("경기도 광명시");
		member.setBirthday("19820408");
		member.setEmail("gusfot@gmail.com");
		member.setHomePhone("07011112222");
		member.setMobilePhone("01063901427");
		member.setJob("IT개발자");
		
		memberMapper.delete(2);
	}
	
	//@Test
	public void selectMemberById(){
		
		Member member = memberMapper.selectMemberById(2);
	}
	
	@Test
	public void selectMembersByCriteria(){
		Map criteria = new HashMap();
		List<Member> members = memberMapper.selectMembersByCriteria(criteria);
		for(Member member: members){
			System.out.println(member.getName());
			System.out.println(member.getRole().getType());
		}
	}
	
}
