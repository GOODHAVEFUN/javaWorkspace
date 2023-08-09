package review;

public class Movie implements Runnable{

	@Override
	public void run() {
		String movieTitle = Thread.currentThread().getName();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(movieTitle + "영화 상영중~");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println(movieTitle + "영화종료!");
	}
}
