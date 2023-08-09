package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(10);
		li.add(40);
		li.add(10);
		li.add(10);
		
		System.out.println(li);
		HashSet<Integer> se = new HashSet<>(li);
		System.out.println(se);
		ArrayList<Integer> result = new ArrayList<>(se);
		Collections.sort(result);
		System.out.println(result);
	}
}