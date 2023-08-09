package exceptionTest;

import java.util.Scanner;

public class ThrowTest02 {
	public static void main(String[] args) {
		//숫자를 입력받기(양의 정수만 입력가능, 0과 음수는 입력불가)
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.println("양의정수 입력 : ");
		number = sc.nextInt();
		
		//조건(number < 0)
		//try-catch
		if(number < 0) {
			try {
				throw new MyException();
			}catch(MyException e) {
				e.printStackTrace();
//				System.out.println("오류");
			}
			
		}
		System.out.println(number);
		
	}
}















