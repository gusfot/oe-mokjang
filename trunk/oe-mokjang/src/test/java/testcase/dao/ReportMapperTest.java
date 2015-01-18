package testcase.dao;

import java.util.List;

import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.ReportExample;
import kr.ch.oe.model.ReportExample.Criteria;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={//"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class ReportMapperTest {
	
	@Autowired
	private ReportMapper reportMapper;
	
	@Test
	public void selectUser() {
		//reportMapper.s
	}
	
	@Test
	public void insert() {
		Report record = new Report();
		record.setDeptSeq(14l);
		record.setRegId("kjy");
		record.setWeeks(1);
		
		int result = reportMapper.insertSelective(record);
		
		Assert.assertTrue(result > 0);
	}
	
	@Test
	public void select() {
		
		Report report = reportMapper.selectByPrimaryKey(1l);
		
		Assert.assertTrue(report != null);
	}
	
	@Test
	public void selectList() {
		
		ReportExample example = new ReportExample();
		Criteria criteria = example.createCriteria();  
		criteria.andWeeksEqualTo(1);
		criteria.andDeptSeqEqualTo(14l);
		List<Report> report = reportMapper.selectByExample(example);
		
		Assert.assertTrue(report != null);
	}
}
