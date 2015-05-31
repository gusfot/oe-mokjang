package kr.ch.oe.dao;

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
@ContextConfiguration(locations = {// "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml" })

public class DepartmentMapperTest {

	@Autowired
	private DepartmentMapper deptMapper;
	
	@Test
	public void successToSelectDeptList() {
		DepartmentExample example = new DepartmentExample();
		List<Department> list = deptMapper.selectByExample(example);
		Assert.assertNotNull(list);
		
	}
	
	@Test
	public void successToSelectDept() {
		Department dept = deptMapper.selectByPrimaryKey(15L);
		System.out.println(dept.getParent().getDeptName());
		Assert.assertNotNull(dept);
	}
	
	
	@Test
	public void successToInsertDept() {
		Department dept = new Department();
		dept.setDeptName("고등부");
		dept.setParentSeq(13L);
		int result = deptMapper.insertSelective(dept);
		Assert.assertTrue(result>0);
		
	}
	@Test
	public void successToUpdatDept() {
		Department dept = deptMapper.selectByPrimaryKey(14L);
		dept.setDeptName("update유년부");
		int result = deptMapper.updateByPrimaryKeySelective(dept);
		Assert.assertTrue(result>0);
	}
	
	@Test
	public void successToDeleteDept() {
		int result = deptMapper.deleteByPrimaryKey(14L);
		Assert.assertTrue(result>0);
	}
	
	
}
