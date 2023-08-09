package array;

import java.util.Iterator;

public class ArrayTest05 {

	public static void main(String[] args) {
//		//각 학생별 점수를 넣은 배열선언
//		//총점과 편균 구하기
//		
//		String[] name = {"이우진" ,"이상훈","이치영"};
//		String [] prog= {"Java","python","c"};
//		double [] avg= new double[3]; 
//		int [] total= new int[3];
//		int [] java= new int[3];
//		int [] python= new int[3];
//		int [] c= new int[3];
//		
//		
//		
//		for (int i = 0; i < total.length; i++) {
//			System.out.println(name[i]);
//			for (int j = 0; j < total.length; j++) {
//				System.out.println(prog[j]);
//				
//			}
//		}

		// 학생의 java, python, c 점수를 넣은 배열 선언
		// 3칸짜리 배열, 점수는 자율적으로 넣기
		// 총점과 평균을 구하기(총점은 정수형, 평균은 실수형-double)

		int[] score = { 50, 88, 100 };
		int total = 0;
		double avg = 0.0;

//     for(int i = 0; i < score.length; i++) {
//        total += score[i];
////        System.out.println(total);
//     }

		avg = total / score.length;
		System.out.println("평균 : " + avg);
		avg = (double) total / score.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}

}
