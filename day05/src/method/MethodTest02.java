package method;

public class MethodTest02 {
	public static void main(String[] args) {
		//객체생성
		//자료형 객체명 = 값;
		//Scanner 객체명 = new Scanner(System.in);
		MethodTest02 mt = new MethodTest02();
		System.out.println(mt); //참조값

		System.out.println(mt.addTen(10)); //20
//		System.out.println(printTest());

//		System.out.println(add(10));
//		System.out.println(add(20));
	}

	int addTen(int num) {
		int result = num + 10;
		return result;
	}
	
	static int printTest() {
		int num1 = 1;
		return num1;
	}
}




//1. 기능 - 숫자에 10을 더해주는 기능
//2. 리턴타입 - 생각나지 않으면 void
//3. 메소드명 - add
//4. 매개변수 - 매개변수 1개
//5. 기능 구현 - 정수형 변수 1개 선언 => 매개변수명 + 10;
//6. 리턴값




