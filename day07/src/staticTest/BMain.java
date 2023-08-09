package staticTest;

public class BMain {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		b1.iVar = 10;
		b2.iVar = 20;
		
		System.out.println(b1.iVar);
		System.out.println(b2.iVar);
		
		b1.sVar = 10;
		b2.sVar = 20;
		
		System.out.println(b1.sVar);
		System.out.println(b2.sVar);
		System.out.println(B.sVar);
		//클래스변수(스태틱변수)는 하나의 저장공간이다
		//즉, 하나의 클래스로 만든 모든 객체가 공유하는 저장공간이다
		//그러므로 클래스명으로 접근한다
		
	}
}

















