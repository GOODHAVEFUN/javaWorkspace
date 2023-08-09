package day01;

public class Variable01 {
	public static void main(String[] args) {
		//변수 선언
		//정수형 number
		int number; //정수를 저장할 수 있는 변수 number를 선언했다(만들었다)
		//변수에 값 저장(초기화)
		number = 10; //변수 number에 10이라는 정수값을 저장했다
		System.out.println(number);
		
		//변수 선언과 동시에 초기화
		String subject = "java";
		System.out.println(subject);
		
		//정수형 변수를 3개 선언과 동시에 초기화
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
		
		//여러개의 변수를 선언하는 방법
		int num1 = 1, num2 = 2, num3 = 3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//변수에 값을 변경(변수의 재사용)
		num1 = 10;
		System.out.println(num1);
	}
}


















