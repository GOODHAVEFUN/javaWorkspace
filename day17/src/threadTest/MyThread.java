package threadTest;

public class MyThread extends Thread {
	//Thread 클래스 상속
	
	//필드
	String str;

	//생성자
	public MyThread(String str) {
		super();
		this.str = str;
	}

	//run 메소드를 오버라이딩
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(str + "쓰레드 종료!");
	}
}















