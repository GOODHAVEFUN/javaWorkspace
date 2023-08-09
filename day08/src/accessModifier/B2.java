package accessModifier;

public class B2 extends B{

	//B클래스에 있는 protected 메소드를 오버라이딩
	
	@Override
	protected void method3() {
		System.out.println("메소드 오버라이딩");
	}
	
}
