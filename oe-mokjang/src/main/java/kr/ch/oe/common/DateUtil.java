package kr.ch.oe.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 해당하는 날짜읜 해당주를 가져온다. ex) 1~52주
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	public static int getWeeksOfYear(int year, int month, int date){
		Calendar cal = Calendar.getInstance();
	    cal.set(year, month-1, date);
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
	
	/**
	 * 해당하는 날짜의 월별 주를 가져온다. ex) 3월 2째주
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	public static int getWeeksOfMonth(int year, int month, int date){
		Calendar cal = Calendar.getInstance();
	    cal.set(year, month, date);
	    return cal.getWeekYear();
	}
	
	
	public static int getStartDateWeeks(int year, int month, int date){
		
		// TODO : 날짜에 해당하는 주의 시작하는 주일(일요일)의 날짜를 가져온다.
		Calendar cal = Calendar.getInstance();
	    cal.set(year, month, date);

	    return cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int getEndDateWeeks(int year, int month, int date){
		
		// TODO : 날짜에 해당하는 주의 끝나는 토요일의 날짜를 가져온다.
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		
		return 0;
	}
	
	/**
	 * dateString 반환
	 * @param dateFormat
	 * @return
	 */
	public static String getDateFormatString(String dateFormat) {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.format(today);
	}
	
	/**
	 * 오늘 날짜(년), String("yyyy") 반환
	 * @return
	 */
	public static String getYearString() {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyy");
		return format.format(today);
	}
	
	/**
	 * 오늘 날짜(월), String("MM") 반환
	 * @return
	 */
	public static String getMonthString() {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM");
		return format.format(today);
	}
	
	/**
	 * 오늘 날짜(일), String("dd") 반환
	 * @return
	 */
	public static String getDayString() {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd");
		return format.format(today);
	}
	
	/**
	 * 해당 년도 , 주차의 시작일자
	 * @param year
	 * @param weeks
	 * @return
	 */
	public static Date getFirstDateByWeeks(int year, int weeks) {

		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.set(Calendar.WEEK_OF_YEAR, weeks);
		calendar.set(Calendar.YEAR, year);
		
		return calendar.getTime();
		
	}
	
	/**
	 * 해당 년도 , 주차의 마지막일자
	 * @param year
	 * @param weeks
	 * @return
	 */
	public static Date getLastDateByWeeks(int year, int weeks) {

		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.set(Calendar.WEEK_OF_YEAR, weeks);
		calendar.set(Calendar.YEAR, year);
		calendar.add(Calendar.DATE, 6);
		
		return calendar.getTime();
		
	}
}
