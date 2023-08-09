package day05_review;

public class ArrayEx03 {
	public static void main(String[] args) {
//		aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력하기
		
		char[] ar = new char[26];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (char)(i%2 != 0? i + 65 : i + 97);
		}
		
		for(char data : ar) {
			System.out.print(data);
		}
	}
}
