package ifTest;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {

	//정수 2개를 입력받아서 큰 수 출력하기
	
	//1) 변수선언(num1, num2, result, msg1, msg2)
	int num1 = 0, num2 = 0;
	String msg1 = "정수입력1 : ", msg2 = "정수입력2 : ", result = null;
	//2) 입력 클래스
	Scanner sc = new Scanner(System.in);
	//3) 입력 메소드
	System.out.println(msg1);
	num1 = sc.nextInt();
	System.out.println(msg2);
	num2 = sc.nextInt();
	//4) 큰수 비교(조건문-큰수, 같다, 작은수)
	if(num1 > num2) {
		result = "큰 값 : " + num1;
	}else if(num1 < num2 ) {
		result = "큰 값 : " + num2;
	}else {
		result = "두 정수는 같습니다";
	}
	
	//5) 결과 출력
	System.out.println(result);
	
	}
}















