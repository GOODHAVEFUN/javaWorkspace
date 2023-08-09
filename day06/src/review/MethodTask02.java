package review;

import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		// 1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장
		// 2. 사용자에게 이용할 사물함 번호를 입력받기
		// 3. 비밀번호를 입력받아 확인
		// 4. 일치/불일치 출력
		
		//객체 생성후 메소드 사용
		MethodTask02 mt = new MethodTask02();
		String result = null;
		int choice = 0, inputPw = 0;
			
		Scanner sc = new Scanner(System.in);
		int[] arPw = mt.setLockerPw(3, sc);

		System.out.println("이용할 사물함 번호 입력 : ");
		choice = sc.nextInt();
		
		System.out.println("비밀번호 입력 : ");		
		inputPw = sc.nextInt();
		
		result = mt.checkLockerPw(arPw[choice -1], inputPw);
		System.out.println(result);
		
	}
		//setLockerPw
		//비밀번호 설정 메소드 매개변수o, 반환값o
		int[] setLockerPw(int length, Scanner sc) {
			int[] arPw = new int[length];
			String msg = "번 사물함의 비밀번호 설정 : ";
			
			for(int i = 0; i < arPw.length; i++) {
				System.out.println(i + 1 + msg);
				arPw[i] = sc.nextInt();
			}
			return arPw;
		}
		
		//checkLockerPw 매개변수 o, 리턴값 o
		//비밀번호 일치여부 확인 메소드
		String checkLockerPw(int lockerPw, int inputPw) {
			String result = null;
			if(lockerPw == inputPw) {
				result = "비밀번호 일치";
			}else {
				result = "비밀번호 불일치";
			}
			return result;
		}
}


























