package interTest;

public class ClassA implements Inter{

	@Override
	public void method1() {
		System.out.println("method1 오버라이딩");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 오버라이딩");
	}
	
}
