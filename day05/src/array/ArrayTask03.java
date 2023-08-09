package array;

import java.util.Scanner;

public class ArrayTask03 {
    public static void main(String[] args) {
		// 1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장
		// 2. 사용자에게 이용할 사물함 번호를 입력받기
		// 3. 비밀번호를 입력받아 확인
		// 4. 일치/불일치 출력
    	
    	int[] lockerPw = new int[5];
    	Scanner sc = new Scanner(System.in);
    	int choice = 0, inputPw = 0 ;
    	
    	//1. 비밀번호를 배열에 저장
//    	for(int i = 0; i < lockerPw.length; i++) {
//    		System.out.println(i+1 + "번 사물함의 비밀번호 설정 : ");
//    		lockerPw[i] = sc.nextInt();
//    	}
    	int index = 0;
    	for(int passwd : lockerPw) {
    		System.out.println(index + 1 + "번 사물함의 비밀번호 설정 : ");
    		lockerPw[index] = sc.nextInt();
    		index++;
    	}
    	
    	//2. 사용자가 이용할 사물함 번호 입력받기
    	System.out.println("이용할 사물함 번호 입력 : ");
    	choice = sc.nextInt();
    	
    	//3. 비밀번호를 입력받아서 확인
    	System.out.println("비밀번호 입력 : ");
    	inputPw = sc.nextInt();
    	
    	//4. 일치/불일치 출력
    	if(lockerPw[choice - 1] == inputPw) {
    		System.out.println("일치합니다");
    	}else {
    		System.out.println("불일치합니다");
    	}
    }
}













