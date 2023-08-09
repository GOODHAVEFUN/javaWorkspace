package exceptionTask;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		//2분 ~ 12분 쉬는시간
		
		//1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하기 //for문
		// 숫자가 아닌 값이 입력될 경우 잘못된 입력입니다 라는 예외메시지 출력후
		// 프로그램 종료 //예외처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		try {
			int num = sc.nextInt();
			int total = 0;
			
			for(int i = 1; i <= num; i++) {
				total += i;
			}
			System.out.println("1부터 " + num + "까지의 합은 " + total + "입니다");
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
		}finally {
			sc.close(); //Scanner 객체가 사용한 시스템 리소스를 반환하고
						//메모리 누수와 문제를 방지하기 위해 작성함
		}

		}
}
