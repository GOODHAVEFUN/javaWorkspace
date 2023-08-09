package lambdaTest;

public class LambdaTest {
	void printHello() {
		System.out.println("안녕하세요");
	}
	
	/*
	void printHello() {System.out.println("안녕하세요");}
//	1. 이름을 없애고 ->를 추가한다
	void () -> {System.out.print("안녕하세요");}
//	2. 반환타입은 추론 가능하면 생략한다
	() -> {System.out.print("안녕하세요");}
//	3. 명령문이 1줄이면 중괄호와 세미콜론을 생략가능하다(선택)
	() -> System.out.print("안녕하세요")
	*/
	
	int add10(int number) {
		return number + 10;
	}
	
	/*
	int add10(int number) {return number + 10;}
//	이름을 없애고 -> 를 추가한다
	int (int number) -> {return number + 10};
//	반환타입은 추론이 가능하므로 생략한다
	(int number) -> {return number + 10};
//  매개변수의 타입은 추론이 가능하므로 생략가능하다(선택)
	(number) -> {return number + 10};
//	매개변수가 1개라면 ()를 생략가능하다(선택)
//	단, 자료형을 생략하지 않았다면 ()를 생략할 수 없다
	number -> {return number + 10};
//	중괄호와 세미콜론은 생략 가능하다(선택)
	number -> return number + 10
//	중괄호와 세미콜론을 생략하면 retrun 생략해야한다
//	바디의 결과가 값이라면 자동으로 return된다
//	단, 바디에는 명령문이 1개이어야만한다
	number -> number + 10
	*/

	int addNumber(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		return num1 + num2;
	}
	
	/*
//	이름을 없애고 -> 를 추가한다
//	반환타입은 추론이 가능하므로 생략한다	
//  매개변수의 타입은 추론이 가능하므로 생략가능하다(선택)
//	매개변수가 2개 이상이므로 () 생략 불가능하다
	(num1, num2) -> {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		return num1 + num2;
	}
//	명령어가 2개 이상이므로 {}와 ; 생략 불가능하다
//	반환할 값이 있다면 return 사용하기
	*/
	
}




















