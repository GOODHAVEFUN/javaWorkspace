package accessModifier;

public class B {
	//필드
	public int var1 = 1;  
	int var2 = 2;
	protected int var3 = 3;
	private int var4 = 4;
	
	//메소드
	public void method1() {
		System.out.println("public 메소드 호출");
	}
	void method2() {
		System.out.println("default 메소드 호출");
	}
	protected void method3() {
		System.out.println("protected 메소드 호출");
	}
	private void method4() {
		System.out.println("private 메소드 호출");
	}
}



