package review;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		2. 로또 번호 입력받아서 중복된 번호일 경우 저장되지 않도록 할 것(예외처리or조건문)
//			6개 숫자를 중복되지 않은 번호로만 저장 출력하기
		
		int[] lottoNum = new int[6];
		int count = 0; //현재 입력된 로또 번호의 개수
		
		while(count < 6) {
			try {
				System.out.println("로또 번호를 입력하세요(1~45) : ");
				Scanner sc = new Scanner(System.in);
				int number = sc.nextInt();
				
				if(number < 1 || number > 45) {
					throw new IllegalArgumentException("유효하지 않은 번호입니다");
				}
				
				//중복된 번호 예외처리->메소드
				if(Numbers(lottoNum, number)) {
					throw new IllegalStateException("중복된 번호입니다");	
				}
				
				//중복되지 않은 번호 배열에 저장
				lottoNum[count] = number;
				count++;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage() + "다시 입력하세요");
			}catch(IllegalStateException e) {
				System.out.println(e.getMessage() + "다른 번호를 선택하세요");
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 시도하세요");
			}
		} //while 끝
		
		//저장된 로또번호 출력
		System.out.println("입력된 로또 번호는 ");
		for(int number : lottoNum) {
			System.out.print(number + " ");
		}
		
		
	} //main 끝
	
	//중복된 번호 확인 메소드 매개변수o, 리턴값o
	static boolean Numbers(int[] num1, int num2) {
		for(int i:num1) {
			if(i == num2) {
				return true;
			}
		}
		return false;
	}
}


//컬렉션 프레임워크 아시는 분들은 Set을 이용해서 변경해보세요!











