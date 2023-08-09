package threadTest;

class A implements Runnable{

	@Override
	public void run() {
//		System.out.println(Thread.interrupted()); 
//		System.out.println(Thread.interrupted());		
		for(int i = 0; i < 10; i++) {
			if(Thread.interrupted()) {
				System.out.println("인터럽트발생");
				break;
			}
			System.out.println(i);
		}
	}
}


public class InterruptTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		t1.start();
		t1.interrupt();  //true 인터럽트 발생한 것으로 간주
	}
	
}











