package operating;

public class Oper02 {
	public static void main(String[] args) {
		//복합대입연산자
		//산술연산자 + 대입연산자
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
//		System.out.println(num1 + num2);
		result += num1; // result = result + num1;
		System.out.println(result); 
		result += num1;	// result = result + num1;
		System.out.println(result); //20
		result -= num2; // result = result - num2;
		System.out.println(result);
		result += (num1 + num2) * 2;
		//result = 30 * 2 + result
		System.out.println(result);
		
		//관계연산자
		System.out.println("------관계연산자------");
		num1 = 15;
		num2 = 15;
		System.out.println(num1 > num2); //결과는 boolean
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		//삼항연산자
		System.out.println("------삼항연산자------");
		int result1 = 10 > 9 ? 10 : 9;
		System.out.println(result1);
		
		int num3 = 10, num4 = 10, num5 = 20;
		
		System.out.println(true ? num3 : num5);
		System.out.println(false ? num3 : num5);
		
		System.out.println(num1 == num2 ? "같다" : "다르다");
		System.out.println(num1 == num5 ? "같다" : "다르다");
		System.out.println(num1 > num2 ? num1 : num1 == num2 ? "같다" : num2);
		
	}
}
















