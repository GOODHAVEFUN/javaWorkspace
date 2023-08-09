package review;

import java.util.ArrayList;
import java.util.List;

public class JavaCinema {
	public static void main(String[] args) {
//		List<Movie> movies = new ArrayList<>();
//		List<Thread> thread = new ArrayList<>();
		
		/* 
		 * javacinema라는 영화관이 있다
			3개의 관에서 각각 다른 영화를 상영중이다
			A관은 영화를 먼저 시작하고
			B,C관은 상영이 끝나야 영화를 시작한다
			
			각 상영관은 영화를 상영중에 000영화 상영중이라는 문구 10번표시
			영화가 끝나면 000영화 종료!! 문구 표시
			
			Movie 클래스(0.5초)와 JavaCinema 클래스를 만든다
			JavaCinema 클래스에는 main 쓰레드가 존재한다
			Runnable 인터페이스와 join() 사용할 것!
			
			플래시, 범죄도시3, 엘리멘탈
			
		*/
		Movie m = new Movie();
//		Thread t1 = new Thread(m, "플래시");
//		Thread t2 = new Thread(m, "범죄도시3");
//		Thread t3 = new Thread(m, "엘리멘탈");
//		
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		t2.start();
//		t3.start();

		String[] title = {"플래시", "범죄도시3", "엘리멘탈"};
		Thread[] arThread = new Thread[title.length];
		
		for(int i = 0; i < title.length; i++) {
			arThread[i] = new Thread(m, title[i]);		
		}
		
		for(int i = 0; i < arThread.length; i++) {
			arThread[i].start();
			if(i==0) {
				try {
					arThread[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

















