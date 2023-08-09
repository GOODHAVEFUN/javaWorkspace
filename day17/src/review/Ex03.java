package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
//	 학생 성적 계산
//		성적을 입력받아 평균점수와 최고점수 계산하기
//
//		점수 입력받기
//		입력받은 점수를 컬렉션 프레임워크를 이용해 저장하기
//		평균점수와 최고점 계산하고 출력하기
	public static void main(String[] args) {
		//ArrayList 생성
		List<Integer> score = new ArrayList<>();
		
		//점수 입력 받기
		Scanner sc = new Scanner(System.in);
		int num = 0; //학생수 저장할 변수
		System.out.println("학생수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("학생 " + (i+1) + " 점수 입력 : ");
			int score1 = sc.nextInt();
			score.add(score1);
		}
		
		
		//평균점수 계산
		System.out.println(calc(score));
		
		//최고점수 계산
		System.out.println(calcMax(score));
	}
	
	//평균점수 계산 메소드
	public static double calc(List<Integer> score) {
		int sum = 0;
		for(int i : score) {
			sum += i;
		}
		return (double) sum / score.size();
	}

	//최고점수 계산 메소드
	public static int calcMax(List<Integer> score) {
		int highScore = Integer.MIN_VALUE;  //-2147483648
		for(int s : score) {
			if(s > highScore) {
				highScore = s;
			}
		}
		return highScore;
	}
	
}



















