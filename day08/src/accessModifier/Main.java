package accessModifier;

public class Main {
	public static void main(String[] args) {
	
		A a = new A();
	
		a.var1 = 10;
		a.var2 = 20;
		a.var3 = 30;
//		a.var4 = 40;
		System.out.println(a.var1);
		System.out.println(a.var2);
		System.out.println(a.var3);
		
		a.setVar4(40);
		System.out.println(a.getVar4());
	
	
	
	}
}
