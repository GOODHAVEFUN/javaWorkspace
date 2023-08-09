package exceptionTask;

import java.util.Scanner;

public class DoubleNumber {
	//3. DoubleNumber 클래스 생성 후 진행
	// 사용자로부터 정수를 입력받아 입력받은 정수가 0~100사이의 값인 경우
	// 입력받은 정수를 2배한 값을 출력하고 그외의 값이 입력될 경우
	// 잘못된 입력입니다 예외메시지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			//정수입력 출력
			//정수로 변환
			//조건문(if~else)
			System.out.println("정수입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num >= 0 && num <= 100) {
				System.out.println(num + "의 2배는 "+ 
						(num*2) + "입니다" );
			}
//				else {
//				throw new Exception("잘못된 입력입니다");
//			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("잘못된 입력입니다");
		}finally {
			sc.close();
		}
	}
}















