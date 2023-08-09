package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) {
		/*
		 * 카페 메뉴
		 * 아메리카노 2500
		 * 라떼 3500
		 * 모카 4500
		 * 바닐라라떼 4500
		 * 
		 * HashMap에 저장하기
		 * 
		 * 출력과 입력)
		 * 1. 아메리카노
		 * 2. 라떼
		 * 3. 모카
		 * 4. 바닐라 라떼
		 * 입력 >> 2
		 * 
		 * 출력)
		 * 라떼는 3500원입니다.
		 */
		
		HashMap<String, Integer> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = null;
		String msg = "1. 아메리카노 \n" + "2. 라떼\n"
				+ "3. 모카\n" + "4. 바닐라라떼\n"+"입력 : ";
		
		menu.put("아메리카노", 2500);
		menu.put("라떼", 3500);
		menu.put("모카", 4500);
		menu.put("바닐라라떼", 4500);
		
		System.out.println(menu);
		//HashMap 은 순서를 보장하지 않는 해시기반의 자료구조
		
		System.out.println(msg);
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			result = "아메리카노는 " + menu.get("아메리카노") + "원 입니다";
			break;
		case 2:
			result = "라떼는 " + menu.get("아라떼") + "원 입니다";
			break;
		case 3:
			result = "모카는 " + menu.get("모카") + "원 입니다";
			break;
		case 4:
			result = "바닐라라떼는 " + menu.get("바닐라라떼") + "원 입니다";
			break;
			
		}
		System.out.println(result);		
	
	}
}










