package review;

import java.util.Scanner;

public class IfTask02 {
	public static void main(String[] args) {
		//성적처리(10분)
		//1. 학생의 이름, python, c, java점수를 입력받아 학생의 총점과 평균을 계산하는 프로그램
		//2. 각 과목의 점수는 0~100까지만 가능하며 사용자로부터 입력받은 점수가 0~100사이에 포함되는지
		//확인하고 만약 점수가 범위를 벗어나면 잘못된 점수입니다 출력(출력 뒤에 System.exit(0);작성)
		//3. 학생의 총점점수 계산
		//4. 학생의 평균점수 계산
		//5. 평균을 기준으로 학점을 부여
			// 평균이 90점 이상이면 A, 80~90 B, 70~80 C, 60~70 D, 60점미만이면 F
		//6. 학생의 이름, 총점, 평균, 학점을 출력
		
		String name = null, msg = "이름 : ", 
				msg1 = "c점수 : ", msg2 = "java점수 : ", msg3 = "python 점수 : ", grade = null;
		int c = 0, java = 0, python = 0, total = 0;
		double avg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		name = sc.nextLine();
		System.out.println(msg1);
		c = sc.nextInt();
		System.out.println(msg2);
		java = sc.nextInt();
		System.out.println(msg3);
		python = sc.nextInt();
		
		//점수 범위 확인
		if(c < 0 || c > 100 || java < 0 || java > 100|| python < 0 || python > 100) {
			System.out.println("잘못된 점수입니다");
			System.exit(0);
		}
		
		//총점과 평균 계산
		total = c + java + python;
		avg = total / 3.0;
		
		//학점부여
		if(avg >= 90) {
			grade = "A";
		} else if(avg < 90) {
			grade = "B";
		} else if(avg < 80) {
			grade = "C";
		} else if(avg < 70) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		//결과 출력
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+grade);
	}
}
















