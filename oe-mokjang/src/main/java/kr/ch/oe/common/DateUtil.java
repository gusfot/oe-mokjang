package kr.ch.oe.common;

import java.util.Calendar;

public class DateUtil {

	public static int getWeeks(){
		Calendar now = Calendar.getInstance();
		 return now.get(now.WEEK_OF_YEAR);
	}
}
