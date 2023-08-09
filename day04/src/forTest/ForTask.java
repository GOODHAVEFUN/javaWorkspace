package forTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//1~100까지 출력
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
		
		//100~10까지 출력하는데 10씩 감소하도록 출력
//		for(int i = 100; i >= 10; i-=10) {
//			System.out.println(i);
//		}
		
//		int i = 100;
//		System.out.println(i);
//		i -= 10;
//		System.out.println(i);
		
		//1~100까지 짝수만 출력
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//A~F까지 출력(char사용)
		for(char c =  'A'; c <= 'F'; c++){
			System.out.print(c);
		}
		System.out.println();
		//65~70까지 출력(강제 형변환 char)
		for(int i = 65; i <= 70; i++) {
			System.out.println((char)i);
		}
		
		//2부터 10까지의 숫자를 모두 곱한 결과 출력
		//2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
		//1) for문 사용하지 않고 출력
		System.out.println(2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
		
		int result = 2;
		result *= 3;
		result *= 4;
		result *= 5;
		result *= 6;
		result *= 7;
		result *= 8;
		result *= 9;
		result *= 10;
		System.out.println(result);
		
		//2) for문 사용해서 출력
		int result1 = 1;
		for(int i = 2; i <= 10; i++) {
			result1 *= i;
		}
		System.out.println(result1);
		
		//사용자로부터 입력받은 정수에 대해 1부터 n까지 모두 더한 결과 출력
		//1) for문 사용하지 않고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		int total = num * (num+1)/2;
		System.out.println(total);
		
		//2) for문 사용해서 출력
		int num1 = sc.nextInt();
		int total1 = 0;
		for(int i = 1; i <= num1; i++) {
			total1 += i;
		}
		System.out.println(total1);
		
	}
}









