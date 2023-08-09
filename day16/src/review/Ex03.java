package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		3. 로또 번호 출력하는 Lotto 클래스 
//		- 주어진 횟수(사용자로부터 입력받기)만큼 로또번호를 출력
//		- Lotto 클래스 생성
//		- 입력받은 횟수만큼 로또번호 출력하기
//		- 각 회차 로또번호는 1~45까지 중복되지 않게 6개를 선택
//		- 선택된 로또번호 오름차순 정렬
		
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 몇회차 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			List<Integer> lottoNum = lottoNumbers();
			Collections.sort(lottoNum);
			
			System.out.println(i + "회차 로또번호 : ");
			for(int j : lottoNum) {
				System.out.println(j + " ");
			}
			System.out.println();
		}

	}
	
	private static List<Integer> lottoNumbers(){
		List<Integer> number = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 1; i < 46; i++) {
			number.add(i);
			//r.nextInt(45) + 1;
		}
		
		Collections.shuffle(number);
		List<Integer> lotto = number.subList(0, 6);
		
		return lotto;
	}
	
}












