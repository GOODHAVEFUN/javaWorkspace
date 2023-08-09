package whileTest;

public class WhileTest01 {
	public static void main(String[] args) {
		//안녕하세요 10번 반복출력(for문)
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i+1 + "번.안녕하세요");
//		}
		
		//while문 조건식
		int cnt = 0;
		while(cnt!=10) {
			System.out.println(cnt+1 + "번.안녕하세요");
			cnt++;
		}
		System.out.println("while문 탈출");
	}
}
