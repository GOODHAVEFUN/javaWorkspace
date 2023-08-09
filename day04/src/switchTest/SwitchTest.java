package switchTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0; //정수형 변수 choice에 기본값 대입
		String result = null, msg = "1부터 4까지의 정수입력 : ";
		
		System.out.println(msg);
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: case 3:
			result ="홀수";
			break;
		case 2: case 4:
			result ="짝수";
			break;
		default:
			result = "잘못입력했습니다";
			break;
		}
		
		System.out.println(result);
	}
}
