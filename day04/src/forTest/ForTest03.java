package forTest;

public class ForTest03 {
	public static void main(String[] args) {
		//continue문 : 즉시 다음 반복으로 돌아감
		for(int i = 1; i <= 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		//break문 : 즉시 해당 영역 탈출
		for(int i = 1; i <= 10; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i); //1 2
		}
	}
}
