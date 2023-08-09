package forTest;

public class ForTest01 {
	public static void main(String[] args) {
		//for문 i를 잘 사용해야함 -> i의 규칙성을 찾아서 활용
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번. 행복하다");
		}
		//10번 ~ 1번까지 반복
		for(int i = 10; i > 0; i--) {
			System.out.println(i + "번. 행복하다");
		}
//		for(;true;) {
//			System.out.println("무한반복");
//		}
//		for(;false;) {
//			System.out.println("실행");
//		}
	}
}
