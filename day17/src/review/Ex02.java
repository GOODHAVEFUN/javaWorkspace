package review;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
//	문자열에서 각 단어의 등장 빈도수를 세는 프로그램
//	사용자로부터 문자열을 입력받기
//	문자열을 공백을 기준으로 단어로 분리
//	각 단어의 등장 횟수를 세어 저장
//	단어와 그에 해당하는 등장 횟수를 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("특정문자 입력 : ");
		char str2 = sc.next().charAt(0);
		
		//문자 등장 횟수를 지정할 HashMap 생성
		HashMap<Character, Integer> map = new HashMap<>();
		
		//입력된 문자열 순회 등장 횟수 세기
		for(char c : str.toCharArray()) {
			//toCharArray() 메소드는 문자 배열로 반환하는 메소드
			//이미 등장
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count+1);
			}else {
			//처음 등장
				map.put(c, 1);
			}
		}
		
		int count = getStr(map, str2);
		System.out.println(str2 + " 등장 횟수 : " + count);
	}
	
	//저장된 특정 문자의 등장 횟수를 반환하는 메소드
	public static int getStr(HashMap<Character, Integer> map, char str2) {
		if(map.containsKey(str2)) {
			return map.get(str2);
		}
		return 0;
	}
}















