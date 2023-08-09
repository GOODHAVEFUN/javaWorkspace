package interTest;

public class Main {
	public static void main(String[] args) {
//		Inter i = new Inter();
		ClassA a = new ClassA();
		a.method1();
		a.method2();
		
		Inter i = new ClassA(); //업캐스팅
		i.method1();
		i.method2();
		
		System.out.println(Inter.VAR1); //인터페이스.상수명
		System.out.println(ClassA.VAR2); //클래스명.상수명
//		a.VAR1 = 20; //VAR1 상수기때문에 값을 변경 불가
//		i.VAR2 = 30; 
		
		
	}
}
