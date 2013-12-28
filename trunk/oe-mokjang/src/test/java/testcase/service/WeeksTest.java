package testcase.service;

import java.util.Calendar;

import org.junit.Test;

public class WeeksTest {

	@Test
	public void getWeeks(){
		Calendar now = Calendar.getInstance();
		 int week_yy = now.get(now.WEEK_OF_YEAR);
		 System.out.println("week_yy : " + week_yy);
		 
	}
	
	@Test
	public void getMondayOfWeeks(){
		Calendar now = Calendar.getInstance();
		 
		 now.add(Calendar.DAY_OF_MONTH, (2-now.get(Calendar.DAY_OF_WEEK)));
		 
		 System.out.println("monday : " + now.get(Calendar.DAY_OF_MONTH));
		 
	}
	
	@Test
	public void getSundayOfWeeks(){
		Calendar now = Calendar.getInstance();
		 
		 now.add(Calendar.DAY_OF_MONTH, (1-now.get(Calendar.DAY_OF_WEEK)));
		 
		 System.out.println("sunday : " + (now.get(Calendar.DAY_OF_MONTH)));
		 
	}
}
