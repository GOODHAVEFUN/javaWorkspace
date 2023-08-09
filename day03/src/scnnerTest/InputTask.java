package scnnerTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		//내 이름(name) , 내가 좋아하는 숫자(int number)
		//내가 좋아하는 음식(food) 저장할 변수
		String name = null, food = null;
		int number = 0; //정수의 기본값 0, 실수의 기본값 0.0
		String msg1 = "이름 입력 : ", msg2 = "좋아하는 숫자입력 : ", 
				msg3 ="종아하는 음식입력 : ";
		Scanner sc = new Scanner(System.in);
		System.out.println(msg1);
		name = sc.next();
		System.out.println(msg2);
		number = sc.nextInt();
		
		sc.nextLine(); 
		//입력메소드(next, nextInt, nextDouble 등)을 사용했을 때 입력 버퍼 비우기
		
		
		//조건 음식을 입력할 때 메소드 nextLine() 사용할것
		System.out.println(msg3);
		food = sc.nextLine();
		
		//출력결과
		//내 이름은 000이고, 좋아하는 숫자는 0이고 좋아하는 음식은 00이다
		System.out.printf("내 이름은 %s이고, "
				+ "좋아하는 숫자는 %d이고 좋아하는 음식은 %s이다", name, number, food);
		
	}
}














