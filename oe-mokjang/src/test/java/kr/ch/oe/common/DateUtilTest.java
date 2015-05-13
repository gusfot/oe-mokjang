package kr.ch.oe.common;

import java.text.DateFormat.Field;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;



public class DateUtilTest {
	
	@Test
	public void getWeeks() {
	   System.out.println(DateUtil.getWeeksOfYear(2015, 4, 19));
//	   System.out.println(DateUtil.getStartDateWeeks(2015, 1, 16));
//		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
//		System.out.println("weeks : " + weeks);
	  }
	
	@Test
	public void getFirstDayByWeeks() {
		// We know week number and year.
		int week = 19;
		int year = 2015;

		// Get calendar, clear it and set week number and year.
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);

		// Now get the first day of week. 
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		calendar.add(Calendar.DATE, 6);
		Date date1 = calendar.getTime();
		System.out.println(date1 );
	
	}
	
	@Test
	public void getLastDayByWeeks() {
		// We know week number and year.
		int week = 19;
		int year = 2015;

		// Get calendar, clear it and set week number and year.
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);

		// Now get the first day of week.
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		calendar.add(Calendar.DATE, 6);
		Date date1 = calendar.getTime();
		System.out.println(date1);
		
		
	}
	
	
}
