package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> mart = new HashMap<>();
		
		//추가
		mart.put("새우깡",1300);
		mart.put("감자깡",1300);
		mart.put("양파링",2500);
		mart.put("포카칩",3300);
		mart.put("새우깡",2300);
		
		System.out.println(mart);
		
		//key만 가져오기
		//Iterator : 컬렉션에 저장된 데이터들을 
		//컬렉션 종류와 상관없이 동일한 방식으로 가져오기 위한 인터페이스(타입)
		
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		
//		System.out.println(iter);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//values -> value만 가져오기
		System.out.println(mart.values());
		
		Iterator<Integer> iter2 = mart.values().iterator();
//		System.out.println(iter2);
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		System.out.println(mart.entrySet());
		
		//Key, Value 한쌍씩 가져오기
		Set<Entry<String, Integer>> item = mart.entrySet();
		// HashMap 객체인 mart의 모든 key-value 쌍을 Set 형태로 반환 item 변수에 저장함
				for(Entry<String, Integer> entry : item) {
			System.out.println(entry);
		}
	}
}











