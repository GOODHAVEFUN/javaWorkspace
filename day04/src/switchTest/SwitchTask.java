package switchTest;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		
		//1.사용자로부터 월(1~12)을 입력받기
		//2.입력된 월에 따라 해당하는 계절을 출력하기
			//12, 1, 2 겨울
			//3, 4, 5 봄
			//6, 7, 8 여름
			//9, 10, 11 가을
			//그외는 잘못된 입력입니다 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		String season = null;
		switch(month) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "없는 계절";
			break;
		}
		System.out.println("입력한 월은 " + season + "입니다");
		
		//해당 코드를 if문으로 변경(과제)

//		String day = "화요일";
//		switch (day) {
//		case "월요일":
//			System.out.println("월요일입니다");
//			break;
//		case "화요일":
//			System.out.println("화요일입니다");
//			break;
//		}
		
	}
}
