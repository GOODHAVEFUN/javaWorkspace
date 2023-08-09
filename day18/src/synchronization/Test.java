package synchronization;

public class Test implements Runnable{
	//필드
	int number;
	
	//생성자
	public Test() {
		this.number = 100;
	}
	
//	@Override
//	public synchronized void run() { 
//		//run()에 동기화 처리하면 싱글쓰레드로 작동한다
//		for(int i = 0; i < 5; i++) {
//			sub(10);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			//동기화 블록 설정
//			synchronized (this) {
				sub(10);
//			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//동기화 블록을 사용할 경우 해당 동기화 블록 설정
	public void sub(int number) {
		String name = Thread.currentThread().getName();
//		synchronized(this) { //동기화 블록 설정
			this.number -= number;
			System.out.println(name + " : -" + number);
			System.out.println("현재 number값 : " + this.number);
//		}
			
	}
	
	//동기화 메소드일 때 일반 메소드로 사용 가능
//	public void sub(int number) {
//		String name = Thread.currentThread().getName();
//			this.number -= number;
//			System.out.println(name + " : -" + number);
//			System.out.println("현재 number값 : " + this.number);
//	}
}











