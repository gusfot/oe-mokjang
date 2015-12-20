package kr.ch.oe.dao;

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
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
public class ReportMapperTest {
	
	@Autowired
	private ReportMapper reportMapper;
	
	@Test
	public void insert() {
		Report resport = new Report();
		resport.setDeptSeq(14l);
		resport.setRegId("kjy");
		resport.setWeeks(1);
		
		int result = reportMapper.insertSelective(resport);
		
		Assert.assertTrue(result > 0);
	}
	
	@Test
	public void select() {
		
		Report report = reportMapper.selectByPrimaryKey(1l);
		
		Assert.assertTrue(report != null);
	}
	
	@Test
	public void selectByReportSeq() {
		
		Report report = reportMapper.selectByReportSeq(88l);
		
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
	
	@Test
	public void selectTotalPoint() {
		
		long deptSeq = 84;
		int mokjangTotalPoint = reportMapper.selectTotalPointByDeptSeq(deptSeq );
		
		Assert.assertTrue(mokjangTotalPoint > 0);
	}
}
