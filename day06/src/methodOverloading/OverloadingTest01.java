package methodOverloading;

public class OverloadingTest01 {
	public static void main(String[] args) {
		OverloadingTest01 o1 = new OverloadingTest01();
		System.out.println(o1.add(1, 2, 3));
		System.out.println(o1.add(1, 2));

	}
	
	//메소드 2개 매개변수가 2개인 메소드/매개변수가 3개인 메소드
	int add(int a, int b) {
		return a + b;
	}
	
//	double add(double a, int b) {
//		return a + b;
//	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}
