package operating;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//1. 두 자릿수 정수 입력받고 십의 자리, 일의 자리 출력하는 프로그램
		
		//1) 변수 선언
//			inputNum : 입력받을 변수
//			resultNum1 : 십의 자리 저장할 변수
//			reusltNum2 : 일의 자리 저장할 변수
		int inputNum = 0, resultNum1 = 0, resultNum2 = 0;
		
//		//2) 출력(msg : 두자리수 정수 입력 )
//		String msg = "두자리수 정수 입력 : ";
//		System.out.println(msg);
//		
//		//3) 입력받아 inputNum 값 저장
		Scanner sc = new Scanner(System.in);
//		inputNum = sc.nextInt();
//		
//		//4) 계산하여 result 변수에 저장
//		resultNum1 = inputNum / 10;
//		resultNum2 = inputNum % 10;
//		
//		//5) 결과 출력
//		System.out.println("십의 자리는 " + resultNum1 + "입니다");
//		System.out.println("일의 자리는 " + resultNum2 + "입니다");
		
//입력
		//두자리수 정수 입력 :
		//값을 입력
//출력
		//십의자리는 0입니다
		//일의자리는 0입니다
		
		
//---------------------------------------------------------
		//2. 점수 입력받아 합계점수와 평균점수(강제 형변환)를 구하기(로직구성) 
		// java, c, python
	
		//1) 변수선언(java, c, python, sum, avg)
		//2) 출력(msg 출력)
		//3) 입력메소드(입력클래스 -> nextInt())
		//4) 합계저장할 값(+연산자)
		//5) 평균저장할 값((double)합계/3)
		
		int java = 0, c = 0, python = 0, sum;
		double avg = 0.0;
		String msg1 = "java 점수 입력 : ", msg2 = "c 점수 입력 : ",
				msg3 = "python 점수 입력 : ";
		System.out.println(msg1);
		java = sc.nextInt();
		System.out.println(msg2);
		c = sc.nextInt();
		System.out.println(msg3);
		python = sc.nextInt();
		
		sum = java+ c + python;
		avg = (double)sum / 3;
		System.out.println("합계점수는 " + sum + "점 입니다");
		System.out.println("평균점수는 " + avg + "점 입니다");
		
	}
}





















