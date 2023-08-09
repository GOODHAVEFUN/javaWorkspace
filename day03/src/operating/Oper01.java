package operating;

public class Oper01 {
	public static void main(String[] args) {
		//단항 연산자
		
		System.out.println("------단항연산자------");
		int num1 = 10;
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println(num1);
		
		boolean isTrue = true;
		System.out.println(isTrue);
		System.out.println(!isTrue); //!는 not을 의미
		
		//증감 연산자
		System.out.println("------증감연산자------");
		int num2 = 0;
		System.out.println(num2++); //num2+1
		//++가 뒤에 붙으면 후위증가연산자, 출력되고 나서 +1
		//++가 앞에 붙으면 전위증가연산자, +1 더하고 나서 출력
		System.out.println(num2);
		
		int num3 = 5;
//		System.out.println("전위 : " + ++num3);
		System.out.println("후위 : " + num3++);
		System.out.println(num3);
		
		System.out.println("감소후위 : " + num3--);
		System.out.println(num3);
		System.out.println("감소전위 : " + --num3);
		
		System.out.println("------산술연산자------");
		num1 = 10;
		num2 = 5;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
//		System.out.println(10/0); 0으로 나눌수없다(에러발생)
		
		//String 문자열 타입은 산술연산자의 + 만 사용가능함
		System.out.println("java" + "   " + "3일차");
//		System.out.println("java" - "3일차");
		
		
	}
}



















