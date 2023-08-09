package accessModifier2;

import accessModifier.B;

public class Main {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1);
		
		System.out.println(b1.var1);
		b1.method1();
		
		B1 b2 = new B1();
		System.out.println(b2);
	}
}
