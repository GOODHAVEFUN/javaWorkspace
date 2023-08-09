package InnerTest;

public class Outer {
	//필드
	int var1;
	String name;
	
	//메소드
	void method() {
		//내부클래스
		class Test{
			
		}
	}
	
	//내부클래스
	class Inner{
		//필드, 생성자, 메소드
		public Inner() {
			super();
		}
		
		//메소드
		void innerMethod1() {
			method();
			var1 = 1;
		}
	}
	
}












