package review;

public class ParameterTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1+num2);
		
		ParameterTest pt = new ParameterTest();
		pt.add(10, 20);
//		int num1=10 같은 영역안에서 같은이름의 변수는 선언할수없다
	}
	
	//두정수를 더하는 메소드(add)
	//매개변수는 지역변수 : 메소드 내부에서만 사용가능
	void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
}
