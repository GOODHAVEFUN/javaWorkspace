package review;

public class MethodTest {
	//정수 배열의 합을 계산하는 메소드(ArraySum)
	
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5};
		
		MethodTest mt = new MethodTest();
		System.out.println(mt.ArraySum(number));
		
		
	}
	
	int ArraySum(int[] ar) {
		int sum = 0;
		for(int i : ar) {
			sum += i;
		}
		return sum;
	}
}
