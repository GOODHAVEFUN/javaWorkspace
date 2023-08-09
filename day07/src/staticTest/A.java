package staticTest;

public class A {
	int iVar;
	static int sVar;
	
	//인스턴스 메소드는 인스턴스, 스태틱 멤버를 사용 가능하다
	void iMethod1() {
		iVar = 10;
		sVar = 20;
		System.out.println(iVar);
		System.out.println(sVar);
		
	}
	
	//스태틱 메소드는 스태틱 멤버만 사용가능하다
	static void sMethod1() {
//		iVar = 100;
		sVar = 200;
		System.out.println(sVar);
	}
}
