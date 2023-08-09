package constructor;

public class BTest {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		System.out.println(b1);
//		System.out.println(b2);
		b1.printNum(10);
		
		b2.num = 20;
		b2.printNum(30);
		b1.printNum(100);
		
	}
}
