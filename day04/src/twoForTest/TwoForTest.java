package twoForTest;

public class TwoForTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 2; i++) { //바깥for문
			System.out.println("바깥 for문" + i);
			for(int j =1; j <= 2; j++) { //안쪽for문
				System.out.println("안쪽 for문" + j);
			}
		}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println("i : "+ i + ", j : " + j);
			}
		}
	}
}
