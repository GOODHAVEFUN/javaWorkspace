package review;

public class MethodTask01 {
	public static void main(String[] args) {
		MethodTask01 mt = new MethodTask01();
//		System.out.println(mt.changeSing(10));
//		System.out.println(mt.changeSing(-10));
//		
		int[] ar = {3, 2, 5, 1, 4, 5, 10};
		System.out.println(mt.getAvg(ar));

		mt.printMinMax(ar);
		
		int max = Integer.MAX_VALUE;
		System.out.println(max); //2147483647
		int min  = Integer.MIN_VALUE;
		System.out.println(min);
		long max1 = Long.MAX_VALUE;
		System.out.println(max1);
		
	}
	
	//1. 음수를 양수로, 양수를 음수로 바꾸는 메소드
	//메소드명 changeSing
	int changeSing(int num) {
		return num * -1;
	}
	
	//2. 5개의 정수 중 평균값을 반환하는 메소드
	//getAvg
	double getAvg(int[] ar) {
		if(ar.length != 5) {
			return 0.0;
		}
		
		int total = 0;
		for(int i = 0; i < ar.length; i++) {
			total += ar[i];
		}
		return (double)total / ar.length;
	}
	
	//3. 정수 배열 중 최대값과 최소값 출력하는 메소드
	//printMinMax
	
	void printMinMax(int[] ar) {
		int min = ar[0];
		int max = ar[0];
		
		for(int i = 0; i < ar.length; i++) {
//			if(ar[i] < min) {
//				min = ar[i];
//			}
//			if(ar[i] > max) {
//				max = ar[i];
//			}
			//삼항연산자
			min = min > ar[i] ? ar[i] : min; //{3, 2, 5, 1, 4, 5, 10} 3>3 거짓  3, 3>2 참 2 ,2>5 거짓 2 , 2>1 참 1 , 1>4 거짓 1 
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
	}
}




















