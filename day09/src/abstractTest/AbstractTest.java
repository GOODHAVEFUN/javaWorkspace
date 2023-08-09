package abstractTest;

public class AbstractTest {
	public static void main(String[] args) {
//		ClassA ca = new ClassA();
		ClassA ca = new ClassB(); //업캐스팅
		ClassB ca2 = new ClassB();
		System.out.println(ca);
		System.out.println(ca2);
		
		ca.method1();
		ca2.method1();
		ca.method2();
		ca2.method2();
	}
}
