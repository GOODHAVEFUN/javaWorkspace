package threadTest;

public class ThreadTest02 {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		
//		mt1.run();
//		mt2.run();
		
		//Thread() 생성자 안에 Runnable target을 넣어줄 수 있고
		//이름을 지정할 수도 있다
		Thread t1 = new Thread(mt1, "A");
		Thread t2 = new Thread(mt2, "B");
//		Thread t3 = new Thread(new MyThread2(), "C");
		t1.start();
		t2.start();
//		t3.start();
		
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread test = new Thread(r1, "D");
		test.start();
		
		Thread t3 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "쓰레드종료!!");
		}, "java");
		
		t3.start();
	}
}



















