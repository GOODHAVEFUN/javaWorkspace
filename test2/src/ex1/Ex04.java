package ex1;

import java.util.Iterator;

public class Ex04 {
//	Ex04. 출력결과와 동일한 결과 나오도록 코드 작성}
//	1) 
//	123456789
//	 1234567
//	  12345
//	   123
//	    1

	public static void main(String[] args) {
		for (int i = 10; i > 0; i-=2) {
			if(i==8) {
				System.out.print(" ");
			}
			if(i==6) {
				System.out.print("  ");
			}
			if(i==4) {
				System.out.print("   ");
			}
			if(i==2) {
				System.out.print("    ");
			}
			for (int j = 1; j < 10; j++) {
				if (j<i) {					
					System.out.print(j);			
				}
			}
			System.out.println();
		}
		
//		2) 
//		A
//		BC
//		DEF
//		GHIJ
//		KLMNO
		
		for (char i = 'A'; i <= 'O'; i++) {
			
			System.out.print(i);
			
			for (int j = 0; j < args.length; j++) { //i값이 1개씩 올라가면서 줄바꿈할 곳이 변한다
				
			}
			
//			if((int)i%2==1) {
//				System.out.println();
//			}
			if(i=='A') {
			}
			if(i=='C') {
				System.out.println();
			}
			if(i=='F') {
				System.out.println();
			}
			if(i=='J') {
				System.out.println();
			}
			if(i=='O') {
				System.out.println();
			}

		}

	}
}
