
package kr.ch.oe.service;

import kr.ch.oe.model.Department;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
public class DeparmentServiceTest {

	@Autowired
	private DepartmentService deptService;
	
	@Test
	public void successToGetDeptList() {

		deptService.getDeptList(0, 0,"");
		
		/*List<Department>deptList = deptService.getDeptList(deptExam);
		Assert.assertNotNull(deptList);
		*/
	}
	
	@Test
	public void successToGetDept(){
		Department dept = deptService.getDepatment(1L);
		System.out.println(dept);
		Assert.assertNotNull(dept);
	}
	
	@Test
	public void successToGetDepatmentWithChildren(){
		Department dept = deptService.getDepatmentWithChildren(1L);
		System.out.println(dept);
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
		Department dept = new Department();
		dept.setDeptName("update_123");
		dept.setParentSeq(0L);
		int result = deptService.modifyDepartMent(dept,26L);
		Assert.assertTrue(result>0);
		
	}
	@Test
	public void successToRemoveDept(){
		int result = deptService.removeDeparment(15L);
		Assert.assertTrue(result>0);
	}
		
}
