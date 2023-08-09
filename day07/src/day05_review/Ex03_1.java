package day05_review;

import java.util.Scanner;

public class Ex03_1 {
	public static void main(String[] args) {
		//5. 문자열 배열을 입력받아 모든 문자열을 대문자로 변환하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 배열 길이 입력 : ");
		int length = sc.nextInt();
		String[] ar = new String[length];
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(i+1 + "번째 문자열 입력 : ");
			ar[i] = sc.next();
		}
		
		System.out.println("대문자로 변환된 문자열 : ");
		for(String change : ar) {
			String upperCase = "";
			for(int i = 0; i < change.length(); i++) {
				char c = change.charAt(i);
				if(c >= 'a' && c <= 'z') {
					c -= 32; //소문자를 대문자로 변환
				}
				upperCase += c;
			}
			System.out.println(upperCase);
		}
		
	}
}
















