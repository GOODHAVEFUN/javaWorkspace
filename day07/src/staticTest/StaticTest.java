package staticTest;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.iMethod1();
		sMethod1(); //static 키워드가 붙으면 객체를 이용하는 것은 권장하지 않음
		
	}
	
	void iMethod1() {
		System.out.println("인스턴스 메소드1 실행");
		iMethod2();
		sMethod1();
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");

	}
	
	static void sMethod1() {
		System.out.println("스태틱 메소드1 실행");
//		iMethod1(); //스태틱메소드에서 인스턴스 메소드는 실행불가능
		sMethod2();
	}
	
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
	}
	
}







