package review;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
		//합격 여부 판단
		//1. 사용자로부터 java, python, c언어 점수 입력받기
		//2. 각 점수가 모두 60점 이상인 경우 "합격"을 출력
		//3. 그렇지 않은 경우 "불합격"을 출력
		
		//1) 변수선언(int c, java, python)
		//2) 입력클래스 - 입력메소드(nextInt)
		//3) 조건문(if~else) if 조건식(논리연산자) 합격 출력
		//4) else 불합격 출력
		
		int c = 0, java = 0, python = 0;
		String msg1 = "c언어 점수 입력 : ", msg2 = "java점수 입력 : ", msg3 = "python 점수 입력";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg1);
		c = sc.nextInt();
		System.out.println(msg2);
		java = sc.nextInt();
		System.out.println(msg3);
		python = sc.nextInt();
		
		if(c >= 100 && java >= 60 && python >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}













