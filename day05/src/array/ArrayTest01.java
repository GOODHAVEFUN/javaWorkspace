package array;

public class ArrayTest01 {
	public static void main(String[] args) {
		int number0 = 10;
		System.out.println(number0);
		
		//1) 정수형 배열명 number1 선언 후 크기가 10인 배열 생성
		//자료형[] 배열명 = new 자료형[크기];
		int[] number1 = new int[10];
		double[] number2 = new double[5];
		System.out.println(number1);
		System.out.println(number1[0]);
		
		System.out.println(number2);
		System.out.println(number2[0]);
		
		//2) 문자열 배열명 city 선언 후 초기값 "서울", "대전", "대구", "부산"
		//자료형[] 배열명 = {값};
		String[] city = {"서울", "대전", "대구", "부산"};
		System.out.println(city);
		System.out.println(city[0]);
		System.out.println(city[2]);
		city[2] = "경기도";
		System.out.println(city[2]);
		
		//3) 실수형 배열명 number3 선언 후 크기가 3인 배열을 생성하면서
		//초기값으로 5.1, 5.2, 5.3
		//자료형[] 배열명;
		//배열명 = new 자료형[]{값};
		double[] number3;
		number3 = new double[] {5.1, 5.2, 5.3};
		System.out.println(number3);
		System.out.println(number3[1]);
		
	}
}












