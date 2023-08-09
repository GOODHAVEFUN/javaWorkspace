package homework;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Ex01 {
//	1. 회사의 사원들의 정보를 HashMap에 저장한다
//	HashMap의 Key는 사원의 ID(String)
//		Value는 이름, 나이, 부서로 설정
//
//	조건1. 새로운 사원정보를 추가
//		001, 짱구, 5, "영업부"
//		002, 철수, 5, "개발부"
//		003, 유리, 5, "사업부"
//
//	조건2. 특정 ID의 사원 정보를 조회
//	조건3. 모든 사원의 정보를 출력
//		entrySet 메소드사용
//	조건4. 특정 ID의 사원 정보를 삭제
//	조건5. 모든 사원 정보를 삭제
//		clear 메소드 사용

	public static void main(String[] args) {

//		조건1 새로운 사원정보를 추가
		ArrayList<String> ID = new ArrayList<>();
		ID.add("001");
		ID.add("002");
		ID.add("003");

		ArrayList<String> name = new ArrayList<>();
		name.add("짱구");
		name.add("철수");
		name.add("유리");

		ArrayList<Integer> age = new ArrayList<>();
		age.add(5);
		age.add(5);
		age.add(5);

		ArrayList<String> part = new ArrayList<>();
		part.add("영업부");
		part.add("개발부");
		part.add("사업부");

		HashMap<String, String> staffName = new HashMap<>();
		staffName.put(ID.get(0), name.get(0));
		staffName.put(ID.get(1), name.get(1));
		staffName.put(ID.get(2), name.get(2));
		System.out.println(staffName);

		HashMap<String, Integer> staffAge = new HashMap<>();
		staffAge.put(ID.get(0), age.get(0));
		staffAge.put(ID.get(1), age.get(1));
		staffAge.put(ID.get(2), age.get(2));
		System.out.println(staffAge);
		HashMap<String, String> staffPart = new HashMap<>();
		staffPart.put(ID.get(0), part.get(0));
		staffPart.put(ID.get(1), part.get(1));
		staffPart.put(ID.get(2), part.get(2));
		System.out.println(staffPart);

//		조건2. 특정 ID의 사원 정보를 조회
		// boolean containsKey()
		if (staffName.containsKey("001")) {
			System.out.println(
					"001" + ", " + staffName.get("001") + ", " + staffAge.get("001") + ", " + staffPart.get("001"));
		}

//		조건3. 모든 사원의 정보를 출력
//				entrySet 메소드사용
		Set<Entry<String, String>> name1 = staffName.entrySet();
		for (Entry<String, String> entry : name1) {
			System.out.println(entry);
		}
		Set<Entry<String, Integer>> age1 = staffAge.entrySet();
		for (Entry<String, String> entry : name1) {
			System.out.println(entry);
		}
		Set<Entry<String, String>> part1 = staffPart.entrySet();
		for (Entry<String, String> entry : part1) {
			System.out.println(entry);
		}

//		조건4. 특정 ID의 사원 정보를 삭제
		staffName.remove("001");
		System.out.println(staffName);
		staffAge.remove("001");
		System.out.println(staffAge);
		staffPart.remove("001");
		System.out.println(staffPart);

//	      조건5. 모든 사원 정보를 삭제
//			clear 메소드 사용
		staffName.clear();
		staffAge.clear();
		staffPart.clear();
		
	      System.out.println(staffName.isEmpty());
	      System.out.println(staffName);
	      System.out.println(staffAge.isEmpty());
	      System.out.println(staffAge);
	      System.out.println(staffPart.isEmpty());
	      System.out.println(staffPart);

	}

}
