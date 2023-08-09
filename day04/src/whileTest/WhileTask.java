package whileTest;

public class WhileTask {
	public static void main(String[] args) {
		//1부터 100까지 합, 짝수의 합, 홀수의 합을 출력
		//로직구성 후 코드작성!!!
		
		//1) while문
		//변수 선언(4개)
		int cnt = 0, sum = 0, evenSum = 0, oddSum=0;
		while(cnt <= 100) {
			sum += cnt;
			if(cnt % 2 == 0) {
				evenSum += cnt;
			}else {
				oddSum += cnt;
			}
			
			//증감식
			cnt++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수의 합 : " + evenSum);
		System.out.println("1부터 100까지의 홀수의 합 : " + oddSum);
		
		//2) for문
		int sum1 = 0, evenSum1 = 0, oddSum1 = 0;
		for(int i = 1; i <= 100; i++) {
			sum1 += i;
			
			if(i % 2 == 0) {
				evenSum1 += i;
			} else {
				oddSum1 += i;
			}
		}
		System.out.println("1부터 100까지의 합 : " + sum1);
		System.out.println("1부터 100까지의 짝수의 합 : " + evenSum1);
		System.out.println("1부터 100까지의 홀수의 합 : " + oddSum1);	
	}
}










