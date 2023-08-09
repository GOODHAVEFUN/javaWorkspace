package threadTest;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		//현재쓰레드.이름 가져오기
		
		for(int i = 0; i < 10; i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "쓰레드종료");
	}
	
}














