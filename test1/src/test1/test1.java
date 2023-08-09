package test1;

import java.util.Iterator;

public class test1 {
	public static void main(String[] args) {

//	4. 아래 결과와 같이 출력되도록 할것

//	1) 
//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****

		int star = 5;
		int star1 = 5;

		for (int i = 0; i < star; i++) {
			System.out.println();

			for (int j = 0; j < star1; j++) {
				System.out.print("*");

			}
			star1--;
		}
		
		int star2= 5;
		int star3 = 0;

		for (int i = 0; i < star; i++) {
			System.out.println();

			for (int j = 5; j > 0; j--) {
				System.out.print("*");
			}
			star3++;
			
		}
		
	}
}

//	2)
//	*
//	***
//	*****
//	*******
