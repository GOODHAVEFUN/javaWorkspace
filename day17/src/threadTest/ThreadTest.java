package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		//t1 *, t2 $
		MyThread t1 = new MyThread("*");
		MyThread t2 = new MyThread("$");
		
		//run 메소드는 메인 쓰레드가 실행시키는 것
//		t1.run(); 
//		t2.run();
		//Thread 클래스 내에는 start() 
		//run() 단순히 재정의한 코드를 실행시킨 것
		
		//start 메소드는 다른 쓰레드가 한다
		t1.start();
		t2.start();
		
		
		//3개의 쓰레드가 있는지 확인
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



















