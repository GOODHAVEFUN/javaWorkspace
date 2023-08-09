package list;

import java.util.ArrayList;

public class ArrayListTest02 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		
		//추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li); 
		//참조값 출력x, toString()오버라이딩 된 값이 출력
		
		//값가져오기
		System.out.println(li.get(1));
//		System.out.println(li.get(10)); 인덱스범위 벗어나면 오류발생
		
		//삭제 : index 번호로 삭제 => int 타입을 인수
//		li.remove(1); //20 삭제할 값을 반환
		System.out.println(li.remove(1) + "를 삭제했습니다");
		
		System.out.println(li);
		
		//삭제 : 값으로 검색해서 삭제 => Object 타입을 인수
		//삭제 성공여부를 boolean 타입으로 반환함
		System.out.println(li.remove(Integer.valueOf(10)));
		System.out.println(li);
		
		//수정 : 수정할 인덱스, 값 넘겨주어야한다
		//수정되기 전의 값을 반환한다
		System.out.println(li.set(0, 100));
		System.out.println(li);
		
		//메소드의 설명에 throws가 있다면 예외처리를 고려한다
		try {
			li.set(10, 100);
			System.out.println(li);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 확인하세요");
		}
		
		//포함여부 검사 : 리스트에 존재하면 true, 없으면 false 반환
		System.out.println(li.contains(100));
		System.out.println(li.contains(1000));
		
		//전체삭제
		li.clear();
		System.out.println(li);
 }
}
















