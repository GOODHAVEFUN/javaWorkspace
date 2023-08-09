package synchronization;

public class WaitThread implements Runnable{

	@Override
	public void run() {
		method1();
	}
	
	public synchronized void method1() {
		String name = Thread.currentThread().getName();
		for(int i = 0; i < 10; i ++) {
			System.out.println(i+1 + ". " + name);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i == 4) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public synchronized void method2() {
		String name = Thread.currentThread().getName();
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + ". " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
	}
	
}















