package day05_review;

import java.util.Scanner;

public class Ex03_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String upperCase = null;
		System.out.println("문자열 배열 길이 입력 : ");
		int length = sc.nextInt();
		String[] ar = new String[length];
		
		//for-each문 이용한 문자열 입력받기
		int index = 0;
		for(String i : ar) {
			System.out.println(index + 1 + "번째 문자열 입력 : ");
			ar[index] = sc.next();
			index ++;
		}
		
		System.out.println("대문자로 변환된 문자열 : ");
		for(String change : ar) {
			upperCase = change.toUpperCase();
			System.out.println(upperCase);
		}
		
//		System.out.println(upperCase);
	}
}














