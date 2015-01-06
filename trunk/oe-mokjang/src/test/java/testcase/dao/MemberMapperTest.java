package testcase.dao;

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
	
	
}
