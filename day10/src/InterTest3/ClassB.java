package InterTest3;

public class ClassB extends ClassA implements Inter1{

	public static void main(String[] args) {
	
	ClassB b = new ClassB();
		b.printText();
		//ClassA 와 Inter1 양쪽에 printText() 메소드가 존재하지만
		//오류발생하지 않는다
	
		//2. 부모 클래스의 메소드와 인터페이스의 디폴트 메소드의 이름과 매개변수가 같다면
		// 부모클래스의 메소드가 사용된다
		// => 구현하는 인터페이스보다 상속받는 부모 클래스의 우선순위가 높기 때문이다
		
	}
}
