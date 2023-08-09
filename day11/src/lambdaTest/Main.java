package lambdaTest;

public class Main {
	public static void main(String[] args) {
		//익명클래스
		FunctionalInter2 fi2 = new FunctionalInter2() {

			@Override
			public int add10(int number) {
				return number + 10;
			}
		};
		//람다식(익명메소드)-> 함수형 인터페이스에서만 사용가능(추상메소드가 1개만 있는 인터페이스)
		FunctionalInter2 fi3 = number -> number + 10;
		System.out.println(fi3.add10(50));
		
		System.out.println("------------------------------------");
		FuntionalInter3 fi4 = (num1, num2) -> {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			return num1 + num2;
		};
		
		int result = fi4.method(10, 20);
		System.out.println(result);
		
	}
}




















