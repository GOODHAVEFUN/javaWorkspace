package method;

public class MethodTest04 {
	public static void main(String[] args) {
		//메소드 호출
		//객체 선언
		MethodTest04 m1 = new MethodTest04();
		
		//매개변수x, 리턴값x 메소드 호출
		m1.printTest();
		
		//매개변수o, 리턴값x 메소드 호출
		m1.add(10, 13, 15);
		
		//매개변수x, 리턴값o 메소드 호출
		System.out.println(m1.getTotal());
		
		//매개변수o, 리턴값o 메소드 호출
		System.out.println(m1.TotalNum(3));
		
		int[] number = {1, 2, 3, 4, 5};
		System.out.println(m1.getArray(number));
		
	}
	
	//매개변수x, 리턴값x 메소드 정의(printTest)
	void printTest() {
		System.out.println("김영선");
	}
	
	//매개변수o, 리턴값x 메소드 정의(add 매개변수3개)
	void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	//매개변수x, 리턴값o 메소드 정의(getTotal)
	//1부터 100까지 합을 반환하는 메소드
	int getTotal() {
		int total = 0;
		for(int i = 1; i < 101; i++) {
			total += i;
		}
		return total;
	}
	
	//매개변수o, 리턴값o 메소드 정의(TotalNum)
	//정수 num을 넘겨받아 1~num까지의 합을 출력하는 메소드
	int TotalNum(int num) {
		int total = 0;
		for(int i = 0; i <= num; i++) {
			total += i;
		}
		return total;
	}
	
	//5개의 정수를 넘겨주면 합을 반환하는 메소드 정의(getArray)
	int getArray(int[] arr) {
		if(arr.length > 5) {
			return Integer.MIN_VALUE;
		}
		
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}















