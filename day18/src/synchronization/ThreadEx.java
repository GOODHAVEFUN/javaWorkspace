package synchronization;

public class ThreadEx implements Runnable {

	int number = 5;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			com();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("sleep~");
				break;
			}
		}

	}

	public synchronized void com() {
		number++;
		System.out.println("com + ");
		System.out.println("number : " + number);
		if (number > 9) {
			System.out.println("com이 num을 최대로 올렸습니다");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("wait~");
		}
	}

	public synchronized void user() {
		if (number == 0) {
			System.out.println("num이 최소값입니다");
		} else {
			number--;
			System.out.println("user - ");
			System.out.println("number : " + number);
			notify();
		}
	}
}