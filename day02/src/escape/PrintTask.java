package escape;

public class PrintTask {
	public static void main(String[] args) {
		//5시 16분까지
		//변수 선언하고 아래와 같이 출력하기
		//String 변수명 wether, 맑음
		//정수형 변수명 month
		//정수형 변수명 date
		//실수형 변수명 max 	23.352514
		//실수형 변수명 min		18.25314156
		
		String wether = "맑음";
		int month = 5;
		int date = 19;
		double max = 23.352514;
		double min = 18.25314156;
		
		//변수이용하여 값 넣기
		//오늘은 5월 19일입니다
		//오늘의 날씨는 맑음입니다
		System.out.printf("오늘은 %d월 %d일입니다\n", month, date);
		System.out.printf("오늘의 날씨는 %s입니다\n", wether);		
		
		//직접 값 넣기->변수사용 x
		//오늘의 최고기온은 23도입니다
		System.out.printf("오늘의 최고기온은 %d도입니다\n", 23);

		//반올림하여 소수점 n번째 자리까지 출력
		//오늘의 최고기온은 23.35도입니다
		//오늘의 최저기온은 18.253도입니다
		System.out.printf("오늘의 최고기온은 %.2f도입니다\n", max);
		System.out.printf("오늘의 최고기온은 %.3f도입니다\n", min);
	}
}











