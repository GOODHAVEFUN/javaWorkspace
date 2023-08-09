package scnnerTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		//입력메소드를 사용하기 전에 입력 클래스를 import해야한다!
		//Scanner 클래스 import 자동완성 : ctrl + shift + o
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		System.out.println("이름입력 : ");
//		name = sc.next();
//		System.out.println(name);
//		String name2 = sc.next();
//		System.out.println(name2);
//		
		name = sc.nextLine();
		System.out.println(name);
		
		
	}
}









