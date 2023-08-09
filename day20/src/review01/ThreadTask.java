package review01;

public class ThreadTask implements Runnable{

	public void printA(Runnable a) {
		a.run();
	}
	
	public void printB(Runnable b) {
		b.run();
	}
	
	public void printC(Runnable c) {
		c.run();
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		switch(name) {
		case "A" :
			printA(() -> System.out.println(name));
			break;
		case "B" :
			printB(() -> System.out.println(name));
			break;
		case "C" :
			printC(() -> System.out.println(name));
			break;		
		}
	}
}















