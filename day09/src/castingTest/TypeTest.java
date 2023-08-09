package castingTest;

public class TypeTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//instanceof : true, false
		//자식 클래스의 객체는 부모 클래스 타입도 동시에 갖는다 b라는 객체로 확인가능
		System.out.println(a instanceof A);	//t
		System.out.println(a instanceof B); //f	
		System.out.println(b instanceof A); //t
		System.out.println(b instanceof B); //t
	}
}
