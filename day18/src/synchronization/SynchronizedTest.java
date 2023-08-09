package synchronization;

public class SynchronizedTest {
	public static void main(String[] args) {
		Test t = new Test();
//		System.out.println(t); //참조값
//		System.out.println(t.toString()); //참조값
//		System.out.println(t.number); //생성자
		
		Thread t1 = new Thread(t, "쓰레드-1");
		Thread t2 = new Thread(t, "쓰레드-2");
		
		t1.start(); //쓰레드 실행
		t2.start();

		
//		try {
//			t1.join(); //쓰레드가 종료될때까지 기다린다
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
