package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest03 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			li.add((10-i) * 10);
		}
		System.out.println(li);
		
		
	//Collections 클래스 : 컬렉션 프레임워크와 관련된 메소드를 가지고 있다
	//일부 알고리즘도 구현되어있다
	//static 메소드로 구현했기 때문에 객체를 만들 필요가 없다
		
		Collections.sort(li); //오름차순
		System.out.println(li);
		
		Collections.sort(li, Collections.reverseOrder()); //내림차순
		System.out.println(li);
		li.add(555);
		li.add(365);
		System.out.println(li);
//		Collections.sort(li, Collections.reverseOrder()); 
//		System.out.println(li);
		
		//현재 값들을 반대로 뒤집기(정렬 아님)
		Collections.reverse(li);
		System.out.println(li);
		
		//섞기
		Collections.shuffle(li); 
		System.out.println(li);
		
		//최대값, 최소값
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
	
	}
}






















