package apiTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	//날짜 처리하는 api
	
	public static void main(String[] args) {
//		Date today = new Date();
//		System.out.println(today);
//		
		//SimpleDateFormat 날짜 형식
//		SimpleDateFormat(String pattern); // 패턴은 이미 정해진 약속
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String todayForm = sdf.format(today);
//		System.out.println(todayForm);
		
		//실습
		//현재 날짜 23년 월/일 --- 시(H):분(m):초(s)
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM/dd --- HH:mm:ss");
		System.out.println(sdf.format(today));
//		
		//String -> Date로 변환
		//parse() 분석
		try {
			Date myDay = sdf.parse("23년 6/7 --- 17:26:23");
			System.out.println(sdf.parse("23년 6/7 --- 17:26:23"));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		//System.currentTimeMillis() : 현재 시간을 특정시간(1970/1/1)을 기준으로 얼마나 흘렀는지
		//밀리초로 알려준다
		System.out.println(System.currentTimeMillis());
		Date d1 = new Date(System.currentTimeMillis());
		System.out.println(d1);
		
		//Date를 안쓸수 없다
		//Calnedar, Date, SimpleDateFormat 을 왔다갔다하면서 사용해야한다
	}
}






























