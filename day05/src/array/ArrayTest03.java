package array;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = {5, 2, 1, 6, 2, 10, 6};
		System.out.println(arData.length);
		
		arData[0] = 10; //저장공간
		System.out.println("arData[0] : " + arData[0]);
		arData[2] = arData[0] + arData[4]; //저장공간, 값, 값
		System.out.println("arData[2] : " + arData[2]);
		
		arData[10] = 10;
		System.out.println(arData[10]);
	}
}
