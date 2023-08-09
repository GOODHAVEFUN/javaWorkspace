package threadTest;

public class MainEx {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		
		t1.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		te.user();
//		te.user();
//		te.user();
	}
}
