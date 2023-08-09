package abstractTest;

//추상 클래스 => 추상 메소드 1개 이상 와야한다, 일반 메소드 사용 가능
abstract public class ClassA {
	abstract void method1();//자식클래스에서 재정의 해줘야한다
	void method2() {
		System.out.println("메소드2 실행");
	}
}
