package kr.ch.oe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 통계 서비스 테스
 * @author hyunlaekim
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context-test.xml"})
public class StatisticsServiceTest {

	@Autowired
	StatisticsService statisticsService;
	
	// TODO : 목장원이 목자가 될 경우 일어나는 경우
	// TODO : 목장원이 목장 또는 교구를 변경하는 경우
	
	/**
	 * 특정기간의 한 목장원의 전체 목장보고 통계 테스트 
	 */
	@Test
	public void test1() {
		
	}

	/**
	 * 특정기간의 한 목장의 전체 목장보고 통계 테스트  
	 */
	@Test
	public void test2(){
		// statisticsService.get
	}
	
	/**
	 * 특정기간의 한 교구의 전체 목장보고 통계 테스트  
	 */
	@Test
	public void test3(){
		// statisticsService.get
	}
	
	/**
	 * 특정기간의 교회 전체 목장보고 통계 테스트 
	 */
	@Test
	public void test4() {
		
	}
	
	
}
