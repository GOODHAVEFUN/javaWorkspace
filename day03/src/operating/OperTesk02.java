package operating;

import java.util.Scanner;

public class OperTesk02 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기
		//로직 구성
		
		//1) 변수선언(num1, num2, result, msg1, msg2)
		int num1 = 0, num2 = 0;
		String result = null;
		String msg1 = "정수1입력", msg2 = "정수2입력";
		//2) 입력 클래스
		Scanner sc = new Scanner(System.in);
		System.out.println(msg1);
		//3) 입력 메소드
		num1 = sc.nextInt();
		System.out.println(msg2);
		num2 = sc.nextInt();
		//4) 큰수 비교(삼항연산자-큰수, 같다, 작은수)
		result = num1 > num2 ? num1 + "" : num1 == num2 ? "같다" : num2 + "";
		
		//5) 결과 출력
		System.out.println(result);

	}
}










