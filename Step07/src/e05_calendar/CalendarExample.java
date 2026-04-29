package e05_calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//연도
		System.out.println(calendar.get(Calendar.YEAR));
		//월
		System.out.println(calendar.get(Calendar.MONTH)+1);
		//일
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//시
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		//분
		System.out.println(calendar.get(Calendar.MINUTE));
		//초
		System.out.println(calendar.get(Calendar.SECOND));
		//밀리초
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
		//날짜 변경
		calendar.set(Calendar.YEAR, 2025);
		calendar.set(Calendar.MONTH, 4);//월은 0부터 시작함. -1 해줘야함
		System.out.println(calendar.getTime());
		
	}

}




