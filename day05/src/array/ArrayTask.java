package array;

public class ArrayTask {
	public static void main(String[] args) {
		//학생의 java, python, c 점수를 넣은 배열 선언 
			// 3칸짜리 배열, 점수는 자율적으로 넣기
		//총점과 평균을 구하기(총점은 정수형, 평균은 실수형-double)
		
		int[] score = {50, 88, 100};
		int total = 0;
		double avg = 0.0;
		
//		for(int i = 0; i < score.length; i++) {
//			total += score[i];
////			System.out.println(total);
//		}
		
		for(int i : score) {
			total += i;
//			System.out.println(total);
		}

		avg = total / score.length;
		System.out.println("평균 : "+avg);
		avg = (double)total / score.length;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
	}
}


