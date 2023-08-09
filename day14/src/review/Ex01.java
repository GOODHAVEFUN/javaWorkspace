package review;

import java.util.Scanner;

public class Ex01 {
	/*
	 * 1. 영화 예매 시스템 사용자로부터 좌석번호를 입력받아 해당 좌석을 예약하는 기능 구현하기 
	 * 사용자가 이미 예약된 좌석을 선택하거나 유효하지
	 * 않은 좌석 번호를 입력하는 경우 오류메시지를 출력하고 다시 좌석번호를 입력받도록 코드 구현
	 * 
	 * - 좌석번호는 1~50까지 입력가능 
	 * - 유효하지 않은 좌석 번호일 경우 -> 유효하지 않은 좌석 번호입니다. 다시 입력하세요. 
	 * - 이미 예약된 좌석 번호일 경우 -> 이미 예약된 좌석입니다. 다른 좌석을 선택하세요.
	 */
	public static void main(String[] args) {
		
		boolean[] seat = new boolean[51];
		
		while(true) {
			try {
				System.out.println("예약할 좌석번호 선택(1~50) : ");
				Scanner sc = new Scanner(System.in);
				int sNum = sc.nextInt();
				
				seat[1] = true;
				seat[2] = true;
				seat[10] = true;
				seat[20] = true;
					
				
				if(sNum < 1 || sNum > 50) {
//					System.out.println("유효하지 않은 좌석입니다. 다시 입력하세요.");
//					continue;
					throw new IllegalArgumentException("유효하지 않은 좌석입니다");
				}
				if(seat[sNum]) {
//					System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
//					continue;
					throw new IllegalStateException("이미 예약된 좌석입니다");
				}
				
				seat[sNum] = true;
				System.out.println("좌석" + sNum +"번 자리가 예약되었습니다");
				break;
				
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage() + "다시입력하세요");
			}catch(IllegalStateException e) {
				System.out.println(e.getMessage() + "다른좌석 선택하세요");
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}

			//유효하지 않은 좌석번호

			
			//이미 예약된 좌석일 경우
//			if(seat[sNum]) {
//				System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
//				continue;
//			}
//			
//			//좌석 예약
//			seat[sNum] = true;
//			System.out.println("좌석" + sNum +"번 자리가 예약되었습니다");
//			break;
//			
		}
	}
}
























