package day05_review;

public class ArrayEx01 {
	public static void main(String[] args) {
//		1. 각 학생별 총점과 평균을 출력(2차원배열, 빠른 for문)
//		각 학생별 총점과 평균 출력하기
//
//		1번학생 : 10, 90, 30
//		2번학생 : 40, 80, 27
//		3번학생 : 50, 100, 20
//		4번학생 : 85, 62, 100
//		5번학생 : 65, 54, 89
		
		//1) 2차원 배열 선언
		int[][] arScore = {{10, 90, 30}, 
				{40, 80, 27}, 
				{50, 100, 20},
				{85, 62, 100}, 
				{65, 54, 89}};
		//2) 변수 선언(int 총점, double 평균, int count)
		int total = 0, count = 0;
		double avg = 0.0;
		
		//3) for-each문
//		1차원 for-each문 for(자료형 변수명 : 배열명)
//		2차원 일반 for문 for(행[]){ for(열){}}
//		2차원 for-each문 for(행[])for(열){}
		
//		for(자료형[] 변수1 : 배열명){
//			변수
//			for(자료형 변수2 : 변수1){}
		for(int[] i : arScore) {
			total = 0;
			count ++;
			for(int j : i) {
			total += j;
			}
			System.out.println(count + "번 총점 : " + total + "점");
			avg = (double) total/i.length;
			System.out.println(count + "번 평균 : " + avg + "점");
		}		
	}
}













