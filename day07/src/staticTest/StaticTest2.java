package staticTest;

public class StaticTest2 {
	public static void main(String[] args) {
		//다른 클래스에서 인스턴스 멤버를 사용하는 경우
		A a = new A();
		System.out.println(a.iVar);
		a.iVar = 1;
		System.out.println(a.iVar);
		a.iMethod1();
		System.out.println(a.iVar);
		
		//다른 클래스에서 스태틱 멤버를 사용하는 경우
		// 객체 사용은 권장하지 않음
		a.sVar = 2;
		a.sMethod1();
		
		//클래스명을 이용하여 클래스 멤버에 접근하는 것을 권장한다
		A.sVar = 20;
		A.sMethod1();
		
	}
}
