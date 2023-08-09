package exceptionTask;

import java.util.Scanner;

public class StringNumber {
	//2. StringNumber 클래스 생성 후 진행
	// 문자열을 입력받아 입력받은 문자열을 정수로 변환하여 출력
	// 입력받은 문자열이 숫자가 아닐 경우, 
	// NumberFormatException 예외발생
	// 숫자가 아닌 문자열이 입력되었습니다 예외메시지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		String inNum = sc.nextLine();
		
		try {
			int num = Integer.parseInt(inNum);
			System.out.println("입력한 숫자 : " + num);
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
		}finally {
			sc.close();
		}
	}		
}












