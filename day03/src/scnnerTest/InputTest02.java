package scnnerTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("입력 : ");
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
//		System.out.println("입력 : ");
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
		
		System.out.println("입력 : ");
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		System.out.println(sc.nextLine());	
		//값을 입력하지 않고 엔터만 눌러도 nextLine()은 엔터를 소모하는 일을 해야하므로
		//엔터를 없애고 할일을 마친다
		System.out.println(sc.nextLine());
	}
}












