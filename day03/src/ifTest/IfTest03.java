package ifTest;

public class IfTest03 {
	public static void main(String[] args) {
		//if~else if~ else문
		int num1 = 100;
		int num2 = 1000;
		
		System.out.println("if~else if~ else문");
		if (num1 > num2) {
			System.out.println("num1이 큽니다");
		}
//		System.out.println("첫번째 if문");
		else if (num1 == num2) {
			System.out.println("num1과 num2가 같습니다");
		}
		else {
			System.out.println("num2가 큽니다");
		}
		
		System.out.println("if~else if~ else문 종료");
	}
}
