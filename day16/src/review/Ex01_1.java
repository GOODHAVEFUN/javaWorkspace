package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex01_1 {
	public static void main(String[] args) {
//		1. list에 값을 5개 저장하고 정렬(1~10까지의 정수만 사용)
//		   사용자가 list에 저장된 값을 맞추는 프로그램
//			Random, Scanner, ArrayList, Collections
		
		//list에 값을 저장
		ArrayList<Integer> list = makeList();
		Scanner sc = new Scanner(System.in);
		String msg = "정수를 입력하세요(1~10) : ";
		ArrayList<String> viewList = new ArrayList<>();
		//변수
		int tmp = 0, count = 0, idx = 0, flag = 0;
		String resultMsg = null;
		
		//?를 위한 반복문
		for(int i = 0; i < list.size(); i++) {
			viewList.add("?");
		}
		
		//반복문(while) 숫자 맞추기
		while(true) {
			System.out.println(viewList);
			System.out.println(msg);
			tmp = sc.nextInt();
			count++;
			
			//조건문
			if(list.contains(tmp)) {
				resultMsg = "맞췄습니다";
				idx = list.indexOf(tmp);
				viewList.set(idx, tmp+" ");
				
				list.set(idx, Integer.MIN_VALUE);
				flag ++;
			}else {
				resultMsg = "틀렸습니다";
			}
			System.out.println(resultMsg);
			if(flag == 5) {
				break;
			}
		}
		
		System.out.println("======================");
		System.out.println("축하합니다!!");
		System.out.println(count + "번 시도하였습니다");
		
		
	}
	
	public static ArrayList<Integer> makeList(){
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		int tmp = 0;
		
		for(int i = 0; i < 5; i++) {
			tmp = r.nextInt(10) + 1;
			
			if(!list.contains(tmp)) {
				list.add(tmp);
				continue;
			}
			i--;
		}
		
		Collections.sort(list); //오름차순 정렬
		return list;		
	}
	
	
	
}






















