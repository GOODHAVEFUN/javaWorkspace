package stringTest;

import java.util.Arrays;

public class ArrayStringTest {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		String numString = Arrays.toString(num);
		
		System.out.println(numString);
		//배열의 값을 문자열로 변환하여 출력
	}
}
