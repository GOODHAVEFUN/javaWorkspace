package ex2;

public class Ex03 {

//Ex03. 두개의 정수를 매개변수로 받아서 합을 반환하는 add메소드(오버로딩 활용)
//   정수 더한 값 반환
//   실수 더한 값 반환
	public static void main(String[] args) {
		
		
	}

	public int add1(int a, int b) {
		int sum = a + b;

		return sum;
	}
	public double add2(int a, int b) {

		double dsum = (double) a + (double) b;
		return dsum;
	}
}
