package apiTest;

import java.util.Random;

public class ApiTest01 {
	public static void main(String[] args) {
		//내부 API
		Random r = new Random();
		
		//n미만의 랜덤 정수를 반환한다
		int num = r.nextInt();
		System.out.println(num);
		int num2 = r.nextInt(100);
		System.out.println(num2);
		
		//0이상 1미만의 랜덤 실수 반환한다
		double num3 = r.nextDouble();
		System.out.println(num3);
		
		//범위를 지정하여 랜덤 정수를 생성한다
		int min = 5;
		int max = 15;
		int range = max - min + 1;
		int randomRange = r.nextInt(range) + min;
		System.out.println("5이상 15이하의 랜덤 정수 : " + randomRange);
		
		
	}
}















