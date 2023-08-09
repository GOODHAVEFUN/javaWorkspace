package threadTest;

public class ThreadNameTest {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i = 0; i < 2; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {

			@Override
			public void run() {
//				super.run(); 
				//현재 클래스가 상속받는 Thread 클래스의 run() 메소드 실행하도록 지시하는 역할
				System.out.println(getName() + "실행");
			}
		};
		chatThread.start();
		//익명클래스의 객체 -> 상속은 한번밖에 못하는데 일회성으로 사용하려고 할때
		// 상속을 하면 나중에 필요할 때 못하게되니까 익명클래스로 만들어준다
		chatThread.setName("chatThread");
	}
}











