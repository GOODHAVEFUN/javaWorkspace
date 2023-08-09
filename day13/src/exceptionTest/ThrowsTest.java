package exceptionTest;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void method() throws InterruptedException{
		for(int i = 0; i < 10; i ++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}














