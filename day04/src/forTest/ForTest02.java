package forTest;

public class ForTest02 {
	public static void main(String[] args) {
		
		//continue문
		//1부터 100까지 합출력
		int total = 0;
		for(int i = 0; i < 100; i++) {
			total += i;
		}
		System.out.println("1부터 100까지 합 : " + total);
		
		//1~10까지 중 홀수의 합 출력
		int total1 = 0;	//홀수의 합 저장할 변수 선언
		for(int i = 0; i <= 10; i++) { 
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			total1 += i;			
		}
		System.out.println(total1);
	}
}

















