package inheritance;

public class Parents {
	//상속이 멤버를 자식클래스 내부에 소스코드를 물려준다는것일까?
	//Parents 클래스를 상속받는 자식클래스가 여러개면 여러 자식클래스들이 각각 부모멤버들을
	//클래스 내부에 포함시키고 있을까?
	
	//필드
	int number;
	
	//생성자
//	public Parents() {
//		System.out.println("Parents 생성자 호출");
//	}
	
	public Parents(int number) {
		super(); //Object클래스(모든 클래스의 최상위 부모클래스)
		this.number = number;
	}
	
	
	//메소드
	void printStr(String str) {
		System.out.println(str);
	}


}
