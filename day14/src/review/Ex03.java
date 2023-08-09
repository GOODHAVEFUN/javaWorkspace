package review;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//랜덤 클래스 이용한 로또번호 => 로또 당첨확인
		
		//중복되지 않은 로또 번호를 저장할 배열
		int[] lottoNum = new int[6];
		
		int count = 0;
		
		while(count < 6) {
			try {
				System.out.println("로또번호 입력(1~45) : ");
				Scanner sc = new Scanner(System.in);
				int number = sc.nextInt();
				
				if(number < 1 || number > 45) {
					throw new IllegalArgumentException("유효하지 않은 번호");
				}
			
				if(containsNum(lottoNum, number)) {
					throw new IllegalStateException("중복된 번호");
				}
				
				lottoNum[count] = number;
				count++;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch(IllegalStateException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("예상치 못한 오류입니다");
			}
		}
		
		System.out.println("입력된 로또번호는 ");
		for(int num : lottoNum ) {
			System.out.print(num + " ");
		}
		
		//랜덤으로 중복되지 않은 로또 생성
		int[] randomLottoNum = randomLottoNum();
		System.out.println("\n랜덤으로 생성된 로또 번호는 ");
		for(int num : randomLottoNum) {
			System.out.print(num + " ");
		}
		
		
		
	} //main 끝
		//중복검사 메소드
		static boolean containsNum(int[] num1, int num2) {
			for(int num : num1) {
				if(num == num2) {
					return true;
				}
			}
			return false;
		}

		//랜덤 로또번호 생성 메소드
		static int[] randomLottoNum() {
			int[] randomNum = new int[6];
			Random r = new Random();
			
			//반복문
			for(int i = 0; i < 6; i++) {
				int number = r.nextInt(45) + 1;
				while(containsNum(randomNum, number)) {
					number = r.nextInt(45) + 1;
				}
				randomNum[i] = number;
			}
			return randomNum;
		}
		
} //클래스 끝












