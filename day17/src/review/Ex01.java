package review;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
//	1. 회사의 사원들의 정보를 HashMap에 저장한다
//	HashMap의 Key는 사원의 ID(String)
//	Value는 이름, 나이, 부서로 설정
//

	public static void main(String[] args) {
		//HashMap 생성
		HashMap<String, Employee> em1 = new HashMap<>();
//		조건1. 새로운 사원정보를 추가
//		001, 짱구, 5, "영업부"
//		002, 철수, 5, "개발부"
//		003, 유리, 5, "사업부"
		addEmployee(em1, "001", "짱구", 5, "영업부");
		addEmployee(em1, "002", "철수", 5, "개발부");
		addEmployee(em1, "003", "유리", 5, "사업부");
		
//		조건2. 특정 ID의 사원 정보를 조회
		String id = "003";
		Employee em2 = getEmployee(em1, id);
		if(em2 != null) {
			System.out.println("[조회된 사원 정보]");
			System.out.println("id : " + id);
			System.out.println("이름 : " + em2.getName());
			System.out.println("나이 : " + em2.getAge());
			System.out.println("부서 : " + em2.getDepartment());
		}else {
			System.out.println("id에 사원정보가 없습니다");
		}
		
//		조건3. 모든 사원의 정보를 출력
//		entrySet 메소드사용
		for(Map.Entry<String, Employee> entry : em1.entrySet()) {
			String id1 = entry.getKey();
			Employee emp = entry.getValue();
			System.out.println("id : " + id1);
			System.out.println("이름 : " + emp.getName());
			System.out.println("나이 : " + emp.getAge());
			System.out.println("부서 : " + emp.getDepartment());
		}
		
//		조건4. 특정 ID의 사원 정보를 삭제
		String delId = "003";
		delEmployee(em1, delId);
		System.out.println(em1);
	}
	
	//사원정보 추가 메소드
	public static void addEmployee(HashMap<String, Employee> map, 
			String id, String name,	int age, String department) {
		Employee em = new Employee(name, age, department);
		map.put(id, em);
	}
	
	//특정 id의 사원번호 조회 메소드
	public static Employee getEmployee(HashMap<String, Employee> map, String id) {
		return map.get(id);
	}
	
	//특정 id 사원 정보 삭제 메소드
	public static void delEmployee(HashMap<String, Employee> map, String id) {
		map.remove(id);
	}
	
	//모든 사원 정보 삭제 메소드
	public static void allEmployee(HashMap<String, Employee> map) {
		map.clear();
	}
}

class Employee{
	//필드
	private String name;
	private int age;
	private String department;

	//생성자
	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}
}














