package kr.ch.oe.common;

import java.util.Calendar;

public class DateUtil {

	public static int getWeeks(int year, int month, int date){
		Calendar cal = Calendar.getInstance();
	    cal.set(year, month, date);
//	    //System.out.println(now.getTime());
//
//	    System.out.println("Current week of month is : " + now.get(Calendar.WEEK_OF_MONTH));
//	    System.out.println("Current week of year is : " + now.get(Calendar.WEEK_OF_YEAR));
//
//	    now.add(Calendar.WEEK_OF_MONTH, 1);
//
//	    System.out.println("date after one year : " + (now.get(Calendar.MONTH) + 1) + "-"
//	        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
//		
	    return cal.get(Calendar.WEEK_OF_YEAR);
	}
}
