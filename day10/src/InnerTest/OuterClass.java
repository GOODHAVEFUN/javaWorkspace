package InnerTest;

public class OuterClass {
	//필드
	int instanceVar; //인스턴스 변수
	static int staticVar; //스태틱 변수
	
	class InstanceInner{	//OuterClass 내부에서 정의한 인스턴스 내부 클래스
		
	}
	
	static class StaticInner{	//OuterClass 내부에서 정의한 스태틱 내부 클래스
		
	}
	
	//메소드
	void instanceMethod() {
		//필드
		int localVar; //지역변수
		
		//클래스
		class LocalInner{	//메소드 내부에서 정의한 로컬 내부 클래스
			
		}
		
		LocalInner li = new LocalInner(); //로컬 내부클래스의 객체를 참조하는 로컬 변수
		InstanceInner ii = new InstanceInner(); 
		//OuterClass 클래스 내부의 인스턴스 내부 클래스의 객체를 참조하는 인스턴스 변수
		StaticInner si = new StaticInner();
		//OuterClass 클래스 내부의 스태틱 내부 클래스의 객체를 참조하는 인스턴스 변수
	}
	
	//스태틱 메소드
	static void staticMethod() { 
		//필드
		int localVar;	//지역변수
//		instanceVar = 20;
		staticVar = 20;
		localVar = 30;

		class LocalInner{	//메소드 내부에서 정의한 로컬 내부 클래스
			
		}
		
		LocalInner li = new LocalInner();	//로컬 내부클래스의 객체를 참조하는 로컬변수
//		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		//OuterClass 클래스의 내부의 스태틱 내부클래스의 객체를 참조하는 로컬변수
		
	}
	
}






















