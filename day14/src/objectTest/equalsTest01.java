package objectTest;

public class equalsTest01 {
	public static void main(String[] args) {
		Person p1 = new Person("짱구", 10);
		Person p2 = new Person("유리", 30);
		Person p3 = new Person("짱구", 40);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
	}
}

class Person{
	//필드
	String name;
	int age;
	
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//메소드
	//p1.equals(p2))
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { // 현재 객체와 비교대상객체가 같은 인스턴스인 경우
			return true;	// 두 객체가 동일하다고 판단 true
		}
		
		if(obj == null || getClass() != obj.getClass()) {
		//비교대상객체 null이거나 클래스 타입이 다른 경우	
			
			return false; // 두 객체가 다르다고 판단 false
		}
		
		Person p = (Person)obj;
		// 비교대상객체 obj를 Person 타입으로 형 변환하여 p에 저장
		return this.name.equals(p.name);
		//현재 객체의 name 필드와 비교대상객체의 name필드를 비교하여
		//같으면 true, 다르면 false로 출력
		
//참고 
// equals()메소드는 객체의 name 필드만을 비교하여 같은지를 판단함

		
		
	}

}










