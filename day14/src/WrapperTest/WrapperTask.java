package WrapperTest;

import java.util.Arrays;

public class WrapperTask {
	public static void main(String[] args) {
		
		//아래 있는 값들을 하나의 배열에 담기
		//String[] 배열은 사용 금지
		//1, 4.25, 'b', "Cat", "JAVA", true
		
		Integer num = Integer.valueOf(1);
		Double num2 = Double.valueOf(4.25);

		Object[] obj1 = {num, num2, 'b', "Cat", "JAVA", true};
		Object[] obj = {1, 4.25, 'b', "Cat", "JAVA", true};
		System.out.println(obj);
//		for(Object i : obj) {
//			System.out.println(i);
//		}
		
		System.out.println(Arrays.toString(obj));
	}
}









