package method;

public class MethodTest01 {
	public static void main(String[] args) {
		int num = 0;
		System.out.println(num);
		
		//메소드 사용 - 메소드 안에서 사용한다
		System.out.println(printTest());
	}
	
	//메소드 정의 -메소드 밖에서 정의한다
	static int printTest() {
		int num1 = 1;
		return num1;
	}
}
