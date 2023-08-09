package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		//HashSet
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("코알라");
		animalSet.add("사자");
		animalSet.add("기린");
		animalSet.add("고양이");
		animalSet.add("고양이");
		animalSet.add("고양이");
		animalSet.add("고양이");
		animalSet.add("고양이");
		animalSet.add("고양이");
		
		System.out.println(animalSet);
		
		System.out.println(animalSet.add("하마"));
		System.out.println(animalSet.add("코알라"));
		
		System.out.println(animalSet);
		//내가 저장한 순서대로 값이 저장되어 있는가?
		//내가 set에서 특정 값을 가져올 수 있는가?
		//HashSet은 값을 가져올 수 없다. 어떻게 toString() 값을 가져올까?
		//다른 자료구조로 변환하여 값을 가져와야한다
		System.out.println(animalSet.toString());
		
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter.hasNext());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		
		
	}
}












