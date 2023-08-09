package ex2;

public class Ex02 {
//	Ex02. 주어진 배열에서 최대값과 최소값을 찾는 메소드 만들어서 결과 반환하기(for-each문 사용)
//	   int[] number = {5, 3, 2, 15, 24, 19, 0};
	public static void main(String[] args) {
		int[] number = { 5, 3, 2, 15, 24, 19, 0 };// 주어진 배열
		int max = 0;// 최대값
		int min = 0;// 최소값
//		최대값과 최소값을 찾는 메소드
		for (int i : number) {
			if (max < number[i]) {
				max = number[i];
			}else {
				
			}
			
		}
		System.out.println(max);

//		결과 반환하기

	}
}
