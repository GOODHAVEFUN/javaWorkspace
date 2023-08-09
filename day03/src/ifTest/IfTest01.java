package ifTest;

public class IfTest01 {
	public static void main(String[] args) {
		//if문
		int num1 = 100;
		int num2 = 0;
		
		System.out.println("if문");
		if (num1 > num2) {
			System.out.println("num1이 큽니다");
		}
		System.out.println("첫번째 if문");
		if (num1 == num2) {
			System.out.println("num1과 num2가 같습니다");
		}
		System.out.println("두번째 if문");
		if (num1 < num2) {
			System.out.println("num2가 큽니다");
		}
		
		System.out.println("if문 종료");
		
	}
}
