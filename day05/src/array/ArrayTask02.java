package array;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {
		// 1. String 배열 words 선언 후 1부터 5까지의 영어단어 저장
		// 2. 사용자로부터 1부터 5사이의 숫자를 입력받기
		// 3. 입력받은 숫자가 1~5사이의 숫자인지 확인
		// 4. 1부터 5까지의 수라면 해당하는 영어단어 출력 후 종료
		// 5. 아니라면 잘못입력했습니다 출력 후 다시 입력받도록 하기

		String[] words = {"one", "two", "three", "four", "five" };
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String word = null;
		
		do {
			System.out.println("1부터 5까지의 숫자 입력 : ");
			number = sc.nextInt();
		}while(number < 1 || number > 5);
		
		word = words[number -1];
		System.out.println("입력한 숫자에 해당하는 영어 단어 : " + word);
		
	}
}












