package method;

public class MethodTest03 {
	//메소드 정의 가능
	//두 수를 곱하는 기능
	//메소드명 mul
	//매개변수 2개
	int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public static void main(String[] args) {
		//메소드 정의 불가능
		//메소드 사용 가능
		//객체를 만들고 메소드 호출
		MethodTest03 mt = new MethodTest03();
		System.out.println(mt.mul(10, 20));
		
	}
}














