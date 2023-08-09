package accessModifier;

public class Main2 {
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.var1);
		System.out.println(b.var2);
		System.out.println(b.var3);
//		System.out.println(b.var4); private이기 때문에 오류 발생
		
		b.method1(); 
		b.method2();
		b.method3();
		
		B2 b2 = new B2();
		System.out.println(b2);
		b2.method3();
	}
}

