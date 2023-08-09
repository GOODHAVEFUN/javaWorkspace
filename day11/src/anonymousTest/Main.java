package anonymousTest;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		InterA a = new ClassA();
		InterA b = new InterA() {
			@Override
			public void printData() {
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		System.out.println(b);
		System.out.println(ca);
		System.out.println(a);
		b.printData();
	}
}
