package testcase.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Role;
import kr.ch.oe.service.MemberService;

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
	MemberService memberService;
	
	//@Test
	public void regist(){
		//Report report = new Report();
		Role role = new Role();
		Group group = new Group();
		
		Member member = new Member();
		member.setRole(role);
		member.setGroup(group);
		
		memberService.regist(member);
		
	}
	
	@Test
	public void remove(){
		
		Member member = new Member();
		
		memberService.remove(member.getId());
	}
	
	@Test
	public void modify(){
		Member member = new Member();
		
		memberService.modify(member);
	}
	
	@Test
	public void getMember(){
		int id = 0;
		Member member = memberService.getMember(id);
	}
	
	@Test
	public void getMembers(){
		Map criteria = new HashMap();
		List<Member> member = memberService.getMembers(criteria);
	}
}
