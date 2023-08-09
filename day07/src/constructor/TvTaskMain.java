package constructor;

import java.util.Scanner;

public class TvTaskMain {
	public static void main(String[] args) {
		// switch문을 사용해서
		// 전원이 켜진 상태에서만 채널 up, down 가능하도록
		// 채널 down 1보다 큰 값일 경우에만 채널내리기 가능
		// 잘못된 번호 선택시 잘못 입력하셨습니다 출력
	
		Scanner sc = new Scanner(System.in);
		TvTask tt = new TvTask("red", 25, 25000);
		tt.info();

		while (true) {
			String msg = "1. 전원버튼\n" + "2. 채널 올리기\n" + "3. 채널 내리기\n" + "입력 : ";
			System.out.println(msg);
			int num = sc.nextInt();
			switch (num) {
			case 1:
				if (tt.power) {
					System.out.println("전원끄기");
					tt.powerOnOff();
				} else {
					System.out.println("전원켜기");
					tt.powerOnOff();
				}
				break;
				
			case 2:
				if(tt.power) {
					System.out.println("채널 : " + tt.channelUp());
				}else {
					System.out.println("채널을 켜주세요");
				}
				break;
				
			case 3:
				if(tt.power) {
					System.out.println("채널 : " + tt.channelDown());
				}else {
					System.out.println("채널을 켜주세요");
				}
				break;
				
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
			
		}
	}
}
