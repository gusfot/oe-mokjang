
package kr.ch.oe.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.model.ReportItem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/dao-context.xml"})
public class ReportItemServiceTest {

	@Autowired
	private ReportItemService reportItemService;
	
	@Test
	public void successToGetDeptList() {

		Map<String, Object> params = new HashMap<>();
		List<ReportItem> items = reportItemService.getList(params );
				for (ReportItem reportItem : items) {
					System.out.println(reportItem.toString());
				}
		
		Assert.assertNotNull(items);
	}
}
