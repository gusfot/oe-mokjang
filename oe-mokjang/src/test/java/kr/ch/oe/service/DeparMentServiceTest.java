package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class DeparMentServiceTest {

	@Autowired
	private DepartmentService deptService;
	
	@Test
	public void successToGetDeptList() {
		DepartmentExample deptExam = new DepartmentExample();
		List<Department>deptList = deptService.getDeptList(deptExam);
		Assert.assertNotNull(deptList);
		
	}
	
	@Test
	public void successToGetDept(){
		Department dept = deptService.getDepatment(1L);
		Assert.assertNotNull(dept);
	}
	
	@Test
	public void successToRegisterDept(){
		Department dept = new Department();
		dept.setDeptName("고등부");
		dept.setParentSeq(13L);
		int result = deptService.registerDepartment(dept);
		Assert.assertTrue(result>0);
		
	}
	
@Test
public void successToModifyDept(){
	Department dept = deptService.getDepatment(15L);
	dept.setDeptName("update_고등부");
	int result = deptService.modifyDepartMent(dept);
	Assert.assertTrue(result>0);
	
}
@Test
public void successToRemoveDept(){
	int result = deptService.removeDeparment(15L);
	Assert.assertTrue(result>0);
}
	
}
