package list;

import java.util.ArrayList;
import java.util.List;

//ArrayList
public class ArrayListTest {
	public static void main(String[] args) {

//      ArrayList al = new ArrayList();
//      al.add(10);
//      al.add(20);
//      al.add(30);
//      al.add(10);
//      al.add(20);
//      System.out.println(al);
//      
//      for(int i = 0; i < al.size(); i++) {
//         System.out.println(al.get(i));
//         //al[i]는 ArrayList에서 안됨
//         //al.get(i) 값을 출력할 수 있음
//      }

		// <E> <Element> : 제네릭(Generic)
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(0.1);
		li.add('a');
		li.add("java");
		System.out.println(li);

		ArrayList<Integer> li2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li2.add(i);
		}
		System.out.println(li2);
		System.out.println(li2.size());

		// 향상된 for문, for-each문
		for (int data : li2) { // auto unboxing
			System.out.println(data + 10);
		}

		// 배열
		for (int data : new int[] { 1, 2, 3, 4, 5 }) {
			System.out.println(data);
		}

		System.out.println(li2.toString());

		ArrayList<List> li3 = new ArrayList<>();
		li3.add(li3); // 객체 자기자신을 넣으면 this Colletion 이 나온다
		System.out.println(li3); // [(this Collection)]

	}
}
