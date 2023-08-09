package ex2;

import java.util.Scanner;

public class Ex01 {
//	Ex01. 사용자로부터 배열 크기와 요소 값 입력받아 찾으려는 값이 해당 배열 내 몇번 등장하는지 개수 세기

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array;// 배열크기미정
		int value;

//	사용자로부터 배열 크기와 요소 값 입력받아

		System.out.println("배열크기:");
		int size = sc.nextInt();// 배열크기
		array = new int[size];

		// 요소값 입력받기
//		for (int i : array) {
//			array[i] = sc.nextInt();
//			System.out.println("array[" + i + "] = " + array[i]+"저장");
//			
//		}
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			System.out.println("array[" + i + "] = " + array[i]+"저장");
		}

		// 찾으려는 값이 해당 배열 내 몇번 등장하는지 개수 세기
		System.out.println("찾으려는값:");
		value = sc.nextInt();
//		for (int i : array) {
//			if (value == array[i]) {
//				System.out.println("array["+i+"] 에 저장되어있음");
//			}else {
//				System.out.println("값이 존재하지않음");
//			}
//		}
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				System.out.println("array["+i+"] 에 저장되어있음");
			}else {
				System.out.println("값이 존재하지않음");
			}
		}
	}

}
