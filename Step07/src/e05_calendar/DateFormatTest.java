package e05_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {
		// 날짜 생성
		Calendar today = Calendar.getInstance();
		// 날짜 서식 문자열을 이용해서 원하는 형태로 문자열을 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();

		// 연도 4자리
		sdf.applyPattern("yyyy");
		System.out.println(sdf.format(today.getTime()));
		// 연도 2자리
		sdf.applyPattern("yy");
		System.out.println(sdf.format(today.getTime()));
		// 월 1자리
		sdf.applyPattern("M");
		System.out.println(sdf.format(today.getTime()));
		// 월 2자리
		sdf.applyPattern("MM");
		System.out.println(sdf.format(today.getTime()));
		// 월 약자 - 로컬형식
		sdf.applyPattern("MMM");
		System.out.println(sdf.format(today.getTime()));
		// 월 풀네임 - 로컬형식
		sdf.applyPattern("MMMM");
		System.out.println(sdf.format(today.getTime()));
		// 일 1자리
		sdf.applyPattern("d");
		System.out.println(sdf.format(today.getTime()));
		// 일 2자리
		sdf.applyPattern("dd");
		System.out.println(sdf.format(today.getTime()));

	}

}
