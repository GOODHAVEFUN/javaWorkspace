package accessModifier2;

public class MainTest {
	public static void main(String[] args) {
		Person p = new Person("짱구", 5);
		p.sayHello();
		
//		p.name2 = "짱구";
		System.out.println(p.getName());
		
		//setter를 이용한 값 입력
		p.setName("홍길동");
		//getter를 이용해서 값 출력
		System.out.println(p.getName());
		
		//sayHello() 메소드를 호출하면 메소드에 정의한 내용이 출력
		//p.getName() 메소드를 호출하면 name 멤버변수값을 가져온다
		//p.setName() 메소드를 호출하면 name 멤버변수값을 변경할 수 있다
		
	}
}
