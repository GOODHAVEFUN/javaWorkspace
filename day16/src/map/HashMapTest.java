package map;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(map);
		
		map.put("a", 11);
		map.put("b", 22);
		map.put("c", 33);
		map.put("d", 44);
		
		System.out.println(map);
		
//		System.out.println(map.put("d", 1));
		//수정시에는 기존 값을 반환해주고 변경
//		System.out.println(map);
//		System.out.println(map.get("e")); //null
//		System.out.println(map.get("d")); //value값을 가져옴
//		System.out.println(map.size());
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
//		//삭제
//		map.remove("d");
//		System.out.println(map);
//		
//		//포함여부 확인(key, value)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsValue(33));
//		
//		//요소개수 확인
//		System.out.println(map.size());
//		
//		//해당 map이 비어있는지확인
//		System.out.println(map.isEmpty());
//		
//		//모두 비우기
//		map.clear();
//		
//		System.out.println(map.isEmpty());
//		System.out.println(map);
	}
}















