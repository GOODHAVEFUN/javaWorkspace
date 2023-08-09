package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex01_2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 난수 5개 값을 저장
		for(int i = 0; i < 5; i++) {
			numbers.add(r.nextInt(10)+1);
		}
		
		// 리스트 정렬
		Collections.sort(numbers);
		
		System.out.println("1부터 10까지 숫자 맞추기");
		int count = 0;
		
		while ( count < 5 ) {
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(numbers.contains(num)) {
				System.out.println("맞았습니다");
				numbers.remove(Integer.valueOf(num)); //맞춘 숫자 리스트에서 제거
				count ++;				
			} else {
				System.out.println("틀렸습니다");
			}
		}
		
	}
}










