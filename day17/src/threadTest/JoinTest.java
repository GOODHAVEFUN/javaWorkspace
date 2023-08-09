package threadTest;

public class JoinTest {
	public static void main(String[] args) {
		
		//Runnable 인터페이스를 구현한 익명클래스 생성, 쓰레드 로직구현
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
			System.out.println(Thread.currentThread().getName() + "쓰레드 종료!");
		};
		
		//Runnable 객체를 이용해서 Thread 클래스 객체 t1, t2 생성
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		
		//t1, t2 쓰레드 실행
		t1.start();
		t2.start();
		
		//t1.join() 사용하여 t1쓰레드가 종료될때까지 다른 쓰레드들이 기다리도록 함
		try {
//			t1.join(); //t1이 끝날때까지 다른 쓰레드는 기다려
			
			t2.join(1000); // 밀리초 단위 1000 -> (1초)
			//기다릴 최대시간을 밀리초 단위동안 기다리도록 한다
			//t2 쓰레드가 1초내에 종료되면 join() 완료되고 다음 코드로 진행된다
			//1초가 경과하게 되면 InterruptedException이 발생한다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//for 반복문(현재 실행중인 쓰레드-> main의 이름을 출력)
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main 쓰레드 종료");
	}
}












